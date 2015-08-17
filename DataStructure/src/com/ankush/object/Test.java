package com.ankush.object;

import java.io.IOException;

public class Test implements MyMarkerInterface{
public static void main(String[] args) throws CloneNotSupportedException, IOException {
	/*Test t = new Test();
	new TestMarkerInterface().tastmarkerInterfaceMethod(t);*/
	
	Parent p1 = new Parent();
	p1.execute();
	Parent p2 = new Parent();
	p2.execute();
}

}
