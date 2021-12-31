package com.design.singleton;

public class SingleObject {

	private static SingleObject singleobject = new SingleObject();

	private SingleObject() {
	}

	public static SingleObject getInstance() {
		return singleobject;
	}

	public static void showMessage() {
		System.out.println("Hello World!");
	}
}
