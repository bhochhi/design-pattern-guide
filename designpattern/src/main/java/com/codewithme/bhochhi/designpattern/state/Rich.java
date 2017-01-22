package com.codewithme.bhochhi.designpattern.state;

public class Rich implements State {

	public void saySomething(StateContext sc) {
		System.out.println("I play a lots");
		sc.changeState(new Poor());
	}

}
