package org.java.patterns.adapter;

public class IPhone implements Phone {

	private int signal = 111100;

	public int getSignal() {

		return signal;

	}

	public void dial(String number) {

		System.out.println("IPhone is dialing number :" + number);

	}

}
