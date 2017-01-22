package com.codewithme.bhochhi.designpattern.observer;

public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyAllObservers();
}
