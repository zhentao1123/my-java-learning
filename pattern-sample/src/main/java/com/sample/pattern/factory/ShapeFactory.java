package com.sample.pattern.factory;

public class ShapeFactory {
	
	public Shape getShape(String shapeType) {
		if("Circle".equals(shapeType)) {
			return new Circle();
		}
		else if("Square".equals(shapeType)) {
			return new Square();
		}
		else if("Rectangle".equals(shapeType)) {
			return new Rectangle();
		}
		return null;
	}
	
}
