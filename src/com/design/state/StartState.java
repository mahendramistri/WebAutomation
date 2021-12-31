package com.design.state;

public class StartState implements State {


	public void doAction(Context context) {
		// TODO Auto-generated method stub
		System.out.println("Player is in start state");
		context.setState(this);
	}

	public String toString(){
	      return "Start State";
	   }
}
