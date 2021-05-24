package org.java.patterns.adapter;

public class UsePhone {

	public static void main(String[] args) {

		Phone samsung = new Samsung();

		Phone iphone = new IPhone();

		Phone google = new GooglePhone();

		ChargerAdapter chargerAdapter = new ChargerAdapter();

		iphone.dial("0029772888");

		chargerAdapter.charge(iphone);

		System.out.println("**************************************");

		samsung.dial("0029772888");

		chargerAdapter.charge(samsung);

		System.out.println("**************************************");

		google.dial("09933777");

		chargerAdapter.charge(google);

	}
}
