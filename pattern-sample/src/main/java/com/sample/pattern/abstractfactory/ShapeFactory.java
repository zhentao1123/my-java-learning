package com.sample.pattern.abstractfactory;

public class ShapeFactory extends AbstractFactory {
	
	@Override
	public Shape getShape(String shape) {
		if("Circle".equals(shape)) {
			return new Circle();
		}
		else if("Square".equals(shape)) {
			return new Square();
		}
		else if("Rectangle".equals(shape)) {
			return new Rectangle();
		}
		return null;
	}

	@Override
	public Color getColor(String color) {
		return null;
	}
	
}
