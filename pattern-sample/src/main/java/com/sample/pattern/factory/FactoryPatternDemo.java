package com.sample.pattern.factory;

public class FactoryPatternDemo {
	
	public static void main(String[] args) {
		
		ShapeFactory sf = new ShapeFactory();
		
		Shape shape1 = sf.getShape("Circle");
		shape1.draw();
		
		Shape shape2 = sf.getShape("Square");
		shape2.draw();
		
		Shape shape3 = sf.getShape("Rectangle");
		shape3.draw();
	}
	
}
