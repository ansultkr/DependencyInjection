package com.ansul.thakur;

public class Airtel implements Sim{
	
	public Airtel() {
		System.out.println("Airtel Constructor called!");
	}
	
	@Override
	public void Calling() {
		System.out.println("Calling from Airtel Sim!");
		
	}

	@Override
	public void Browsing() {
		System.out.println("Browsing from Airtel Sim!");
		
	}

	
}
