package com.logztechstuff.core.inheritance.base;

public class ProtectedCheckBaseClass {
	
	public String publicName = "Base class publicName";
	
	protected String protectedName = "Base class protectedName";

	String defaultName = "Base class defaultName";

	public String getPublicName() {
		return publicName;
	}
	
	protected String getProtectedName() {
		return protectedName;
	}
	
	String getDefautName() {
		return defaultName;
	}
}
