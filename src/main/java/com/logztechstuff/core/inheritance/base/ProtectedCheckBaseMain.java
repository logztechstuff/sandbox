package com.logztechstuff.core.inheritance.base;

public class ProtectedCheckBaseMain {

	public static void main(String[] args) {
		
		ProtectedCheckSubClass sub = new ProtectedCheckSubClass();
		System.out.println("Base class default variable  with sub class obj::" + sub.defaultName);
		System.out.println("Base class protected variable with sub class obj::" + sub.protectedName);
		System.out.println("Base class public variable with sub class obj::" + sub.publicName);
		
		System.out.println("Base class default method  with sub class obj::" + sub.getDefautName());
		System.out.println("Base class protected method with sub class obj::" + sub.getProtectedName());
		System.out.println("Base class public method with sub class obj::" + sub.getPublicName());
	}
}
