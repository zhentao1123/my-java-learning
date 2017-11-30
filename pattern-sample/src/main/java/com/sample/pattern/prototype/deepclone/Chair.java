package com.sample.pattern.prototype.deepclone;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Chair implements Serializable{
	private String color;
	
	public Chair() {
		super();
	}

	public Chair(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
