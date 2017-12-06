package com.sample.pattern.abstractfactory;

public class ColorFactory extends AbstractFactory {
	
	@Override
	public Shape getShape(String shape) {
		return null;
	}

	@Override
	public Color getColor(String color) {
		if("BLUE".equals(color)) {
			return new Blue();
		}
		else if("RED".equals(color)) {
			return new Red();
		}
		else if("GREEN".equals(color)) {
			return new Green();
		}
		return null;
	}
	
}
