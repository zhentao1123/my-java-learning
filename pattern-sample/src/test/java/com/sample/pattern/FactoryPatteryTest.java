package com.sample.pattern;

import org.junit.Test;

import com.sample.pattern.factory.Shape;
import com.sample.pattern.factory.ShapeFactory;

public class FactoryPatteryTest {

	@Test
	public void test() {
		ShapeFactory sf = new ShapeFactory();

		Shape shape1 = sf.getShape("Circle");
		shape1.draw();

		Shape shape2 = sf.getShape("Square");
		shape2.draw();

		Shape shape3 = sf.getShape("Rectangle");
		shape3.draw();
	}
}
