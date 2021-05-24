package org.java.patterns.adapter;

public class IPhoneCharger implements Charger {

	public void charge(Phone phone) {

		IPhone iPhone = (IPhone) phone;

		System.out.println("**Charging iPhone***Signal:" + iPhone.getSignal());

	}

}