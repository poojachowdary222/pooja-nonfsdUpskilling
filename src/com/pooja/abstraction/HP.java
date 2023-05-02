package com.pooja.abstraction;

public abstract class HP implements TouchScreen{
	@Override

	public void Scroll() {

	System.out.println("Inside HP class");

	}

	@Override

	public abstract void Click();

}
