package com.codewithme.bhochhi.designpattern.observer;

public class JobSeeker implements Observer {

	private String name;
	
	public JobSeeker(String name) {
		this.name = name; 
	}
	
	@Override
	public void update(Subject s) {
		System.out.println(this.name+" got Notified");
		System.out.println(s);
	}
	
	

}
