package com.codewithme.bhochhi.designpattern.observer;

import java.util.ArrayList;

public class HeadHunter implements Subject {

	private ArrayList<Observer> userList;
	private ArrayList<String> jobs;
	
	public HeadHunter() {
		userList = new ArrayList<>();
		jobs = new ArrayList<>();
	}
	
	public void registerObserver(Observer o) {
		userList.add(o);
	}

	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub

	}

	public void notifyAllObservers() {
		for(Observer o: userList){
			o.update(this);
		}
	}
	
	public String toString(){
		return jobs.toString();
	}

	public void addJob(String job) {
		this.jobs.add(job);
		this.notifyAllObservers();		
	}

}
