package com.ankush.enumTest;

public class EnumTest {
	public static void main(String[] args) {
		String str="v2.2"; //this i get from a props file
		System.out.println(EnumTest.getEnumNamebyValue(str));
	}
	
	
	public static String getEnumNamebyValue(String str){
		for(Version v : Version.values()){
			if(v.getVersion().equals(str))
				return v.name();
		}
		
		return null;
	}
}
