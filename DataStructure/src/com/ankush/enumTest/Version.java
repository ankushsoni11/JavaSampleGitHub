package com.ankush.enumTest;

public enum Version { 
	VERSION_2_0("v2.0"), 
	VERSION_2_1("v2.1"), 
	VERSION_2_2("v2.2");
	private final String version; 
	
	public String getVersion() {
		return version;
	}

	Version(String version) {
        this.version = version;
    }

}
