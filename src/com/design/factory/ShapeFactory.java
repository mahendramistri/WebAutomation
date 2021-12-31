package com.design.factory;

public class ShapeFactory {
	
	public Shape getShape(String shapename) {
		if(shapename == null)
		{
			return null;
		}
		if(shapename.equalsIgnoreCase("Circle"))
		{
			return new Circle();
		}
		
		if(shapename.equalsIgnoreCase("Rectangle"))
		{
			return new Rectangle();
		}
		
		if(shapename.equalsIgnoreCase("Triangle"))
		{
			return new Triangle();
		}
		return null;
		
	}

}
