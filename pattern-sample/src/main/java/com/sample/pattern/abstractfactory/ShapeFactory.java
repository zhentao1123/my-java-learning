package com.sample.pattern.abstractfactory;

public class ShapeFactory extends AbstractFactory {
	
	@Override
	public Shape getShape(String shape) {
		if("CIRCLE".equals(shape)) {
			return new Circle();
		}
		else if("SQUARE".equals(shape)) {
			return new Square();
		}
		else if("RECTANGLE".equals(shape)) {
			return new Rectangle();
		}
		return null;
	}

	@Override
	public Color getColor(String color) {
		return null;
	}
	
}
