package com.pooja.abstraction;

public abstract class Dell implements TouchScreen {

	@Override

	public void Scroll() {

	System.out.println("Inside Dell class");

	}

	@Override

	public abstract void Click();

}
