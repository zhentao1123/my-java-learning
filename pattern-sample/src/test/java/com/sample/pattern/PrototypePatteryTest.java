package com.sample.pattern;

import org.junit.Test;

import com.sample.pattern.prototype.Shape;
import com.sample.pattern.prototype.ShapeCache;
import com.sample.pattern.prototype.deepclone.Car;
import com.sample.pattern.prototype.deepclone.Chair;
import com.sample.pattern.prototype.deepclone.Wheel;

public class PrototypePatteryTest {

	@Test
	public void test() {
		ShapeCache.loadCache();

		Shape clonedShape = (Shape) ShapeCache.getShape("1");
		System.out.println("Shape : " + clonedShape.getType());

		Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
		System.out.println("Shape : " + clonedShape2.getType());

		Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
		System.out.println("Shape : " + clonedShape3.getType());
	}
	
	@Test
	public void test2() {
		Car car = new Car();
		car.setName("Ford");
		car.addChair(new Chair("red"));
		car.addChair(new Chair("red"));
		car.addWheel(new Wheel(25.0f));
		car.addWheel(new Wheel(25.0f));
		car.addWheel(new Wheel(25.0f));
		car.addWheel(new Wheel(25.0f));
		
		try {
			Car car2 = (Car)car.deepClone();
			System.out.println(car2.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
