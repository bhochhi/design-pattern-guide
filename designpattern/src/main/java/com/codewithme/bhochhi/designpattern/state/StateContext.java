package com.codewithme.bhochhi.designpattern.state;

public class StateContext {

	private State currentState;
	
	public StateContext() {
		currentState = new Poor();
	}

	public void changeState(State nextState) {
		currentState = nextState;		
	}
	
	public void saySomeThing(){
		currentState.saySomething(this);
	}
}
