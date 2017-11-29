package com.sample.pattern.builder;

public abstract class ColdDrink implements Item {

	@Override
	public abstract String name();
	
	@Override
	public abstract float price();

	@Override
	public Packing packing() {
		return new Bottle();
	}

}
