package com.ankush.designPattern.factory;

import com.ankush.designPattern.Circle;
import com.ankush.designPattern.Shape;
import com.ankush.designPattern.Square;

public class ShapeFactory{
	public Shape getArea(Object nameOfShape){
		if(nameOfShape instanceof Circle){
			return new Circle();
		}else if(nameOfShape instanceof Square){
			return new Square();
		}
		return null;
	}

	
}
