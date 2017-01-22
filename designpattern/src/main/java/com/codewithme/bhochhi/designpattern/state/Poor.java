package com.codewithme.bhochhi.designpattern.state;

public class Poor implements State {

	public void saySomething(StateContext sc) {
		System.out.println("I work hard");
		sc.changeState(new Rich());
	}

}
