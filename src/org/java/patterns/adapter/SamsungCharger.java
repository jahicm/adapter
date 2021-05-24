package org.java.patterns.adapter;

public class SamsungCharger implements Charger {

	public void charge(Phone phone) {

		Samsung samsung = (Samsung) phone;

		System.out.println("**Charging iPhone***Signal:" + samsung.getSignal());

	}
}
