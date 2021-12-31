package com.design.state;

public class StopState implements State {

	public void doAction(Context context) {
		System.out.println("Playes stop");
		context.setState(this);
	}

	public String toString() {
		return "Playes get stop";
	}

}
