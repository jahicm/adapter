package org.java.patterns.adapter;

public class Samsung implements Phone {

	private int signal = 101001;

	public void dial(String number) {

		System.out.println("Samsung is dialing number :" + number);

	}

	public int getSignal() {

		return signal;

	}

}
