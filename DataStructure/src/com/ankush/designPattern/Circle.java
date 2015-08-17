package com.ankush.designPattern;

public class Circle implements Shape, CopyOfShape{

	@Override
	public int getArea(int factor) {
		// TODO Auto-generated method stub
		return (int) (3.14*factor*factor);
	}

}
