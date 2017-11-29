package com.sample.pattern.abstractfactory;

public class ColorFactory extends AbstractFactory {
	
	@Override
	public Shape getShape(String shape) {
		return null;
	}

	@Override
	public Color getColor(String color) {
		if("Blue".equals(color)) {
			return new Blue();
		}
		else if("Red".equals(color)) {
			return new Red();
		}
		else if("Green".equals(color)) {
			return new Green();
		}
		return null;
	}
	
}
