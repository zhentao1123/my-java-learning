package com.sample.pattern.prototype.deepclone;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Wheel implements Serializable{
	private float size;

	public Wheel() {
		super();
	}
	
	public Wheel(float size) {
		super();
		this.size = size;
	}

	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}
}
