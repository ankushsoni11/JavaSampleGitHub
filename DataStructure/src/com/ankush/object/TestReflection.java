package com.ankush.object;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestReflection {
	
	public static void createObjectAndRunMethod(String objectName) throws ClassNotFoundException, SecurityException, NoSuchMethodException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException{
		Class object = Class.forName(objectName);
		String className = object.getName();
		Constructor constructor = object.getConstructor();
		Object classObject = constructor.newInstance();
		System.out.println(classObject +" , "+className);
	}
	public static void main(String[] args) throws SecurityException, IllegalArgumentException, ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
		//TestReflection.createObjectAndRunMethod("com.ankush.object.TestMarkerInterface");
		TestReflection t = new TestReflection();
		t.createObjectAndRunMethod("com.ankush.object.TestMarkerInterface");
		
	}
}
