package com.ankush.object;

public class TestMarkerInterface {
	public void tastmarkerInterfaceMethod(Object o) throws CloneNotSupportedException{
		if(o instanceof MyMarkerInterface){
			System.out.println("true");
		}else{
			throw new CloneNotSupportedException();
		}
	}
}
