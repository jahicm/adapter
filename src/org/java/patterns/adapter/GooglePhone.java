package org.java.patterns.adapter;

public class GooglePhone implements Phone {

	private int signal = 111000;

	public void dial(String number) {

		System.out.println("Dialing from Google Phone " + number);

	}

	public int getSignal() {

		return signal;

	}

}
