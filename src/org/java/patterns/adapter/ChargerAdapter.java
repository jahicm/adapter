package org.java.patterns.adapter;

public class ChargerAdapter implements Charger {

	private IPhoneCharger iphoneCharger;

	private SamsungCharger samsungCharger;

	private void chargeSamsung(Phone phone) {

		samsungCharger = new SamsungCharger();

		samsungCharger.charge(phone);

	}

	private void chargeIphone(Phone phone) {

		iphoneCharger = new IPhoneCharger();

		iphoneCharger.charge(phone);

	}

	public void charge(Phone phone) {

		if (phone instanceof IPhone) {

			chargeIphone(phone);

		} else if (phone instanceof Samsung) {

			chargeSamsung(phone);

		} else {

			System.out.println("Invalid phone only iPhone or Samsung");

		}

	}

}
