package com.ankush.designPattern.factory;

import com.ankush.designPattern.Circle;
import com.ankush.designPattern.Shape;
import com.ankush.designPattern.Square;

public class TestFactory {
	
	public static void main(String[] args) {
		ShapeFactory shapeFactory =  new ShapeFactory();
		
		Shape shape = shapeFactory.getArea(new Circle());
		System.out.println(shape.getArea(1));
		
		
		Shape shape2 = shapeFactory.getArea(new Square());
		System.out.println(shape2.getArea(2));
		
		
	}
	
	
}
