package com.codewithme.bhochhi.designpattern.observer;

public class Main {

	public static void main(String[] args) {
		HeadHunter hh = new HeadHunter();
		hh.registerObserver(new JobSeeker("Mike"));
		hh.registerObserver(new JobSeeker("Rupesh"));
		
		
		hh.addJob("google job");
		hh.addJob("book job");
	}
	
}
