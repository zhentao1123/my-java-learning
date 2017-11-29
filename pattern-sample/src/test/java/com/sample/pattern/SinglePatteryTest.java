package com.sample.pattern;

import org.junit.Test;

import com.sample.pattern.singleton.SingleObject;

public class SinglePatteryTest {

	@Test
	public void test() {
		// 不合法的构造函数
		// 编译时错误：构造函数 SingleObject() 是不可见的
		// SingleObject object = new SingleObject();

		// 获取唯一可用的对象
		SingleObject object = SingleObject.getInstance();

		// 显示消息
		object.showMessage();
	}
}
