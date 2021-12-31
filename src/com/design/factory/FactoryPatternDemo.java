package com.design.factory;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory shapefactory = new ShapeFactory();
		
		//get circle object 
		Shape circle = shapefactory.getShape("Circle");
		circle.draw();
		
		Shape rectangle = shapefactory.getShape("Rectangle");
		rectangle.draw();
		
		Shape triangle = shapefactory.getShape("Triangle");
		triangle.draw();
	}

}
