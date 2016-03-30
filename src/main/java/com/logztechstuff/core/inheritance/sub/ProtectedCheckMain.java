package com.logztechstuff.core.inheritance.sub;

public class ProtectedCheckMain {

	public static void main(String[] args) {
		
		ProtectedSubClass protectedSubClass = new ProtectedSubClass();
		
		//Member variables
		System.out.println("Public member::" + protectedSubClass.publicName);
		
		// Compiler error: The field ProtectedCheckBaseClass.protectedName is not visible
		//System.out.println("Protected member::" + protectedSubClass.protectedName);
		
		// Compiler error: The field ProtectedCheckBaseClass.defaultName is not visible
		//System.out.println("Default member::" + protectedSubClass.defaultName);
		
		//Methods
		System.out.println("Public method::" + protectedSubClass.getPublicName());
		
		// Compiler error: getProtectedName cannot be resolved or is not a field
		//System.out.println("Protected member::" + protectedSubClass.getProtectedName);
		
		// Compiler error: The method getDefautName() from the type ProtectedCheckBaseClass is not visible
		//System.out.println("Default member::" + protectedSubClass.getDefautName());
		
		System.out.println("Base class protected member through subclass protected method::" + protectedSubClass.getBaseClassProtectedMember());
	}
}
