package com.design.state;

public class StatePatternDemo {

	public static void main(String[] args) {
		Context context = new Context();
		
		StartState startstate = new StartState();
		startstate.doAction(context);
		System.out.println(context.getState().toString());

		StopState stopstate = new StopState();
		stopstate.doAction(context);
		System.out.println(context.getState().toString());
	}
}
