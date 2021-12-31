package com.design.singleton;

public class SingletonPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleObject singleobj = SingleObject.getInstance();
		singleobj.showMessage();
		 // This is illigal //SingleObject object = new SingleObject();
	}
}
