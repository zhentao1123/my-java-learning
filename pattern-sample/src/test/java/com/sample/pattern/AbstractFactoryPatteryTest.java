package com.sample.pattern;

import org.junit.Test;

import com.sample.pattern.abstractfactory.AbstractFactory;
import com.sample.pattern.abstractfactory.Color;
import com.sample.pattern.abstractfactory.FactoryProducer;
import com.sample.pattern.abstractfactory.Shape;

public class AbstractFactoryPatteryTest {

	@Test
	public void test() {
		AbstractFactory sf = FactoryProducer.getFactory("Shape");
		
		Shape shape1 = sf.getShape("Circle");
		shape1.draw();
		
		Shape shape2 = sf.getShape("Square");
		shape2.draw();
		
		Shape shape3 = sf.getShape("Rectangle");
		shape3.draw();
		
		
		
		AbstractFactory cf = FactoryProducer.getFactory("Color");
		
		Color color1 = cf.getColor("Red");
		color1.fill();
		
		Color color2 = cf.getColor("Green");
		color2.fill();
		
		Color color3 = cf.getColor("Blue");
		color3.fill();
	}
}
