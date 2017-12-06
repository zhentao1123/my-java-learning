package com.sample.pattern;

import org.junit.Test;

import com.sample.pattern.bridge.Circle;
import com.sample.pattern.bridge.GreenCircle;
import com.sample.pattern.bridge.RedCircle;
import com.sample.pattern.bridge.Shape;

public class BridgePatteryTest {

	@Test
	public void test() {
		Shape redCircle = new Circle(100, 100, 10, new RedCircle());
		Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

		redCircle.draw();
		greenCircle.draw();
	}
}
