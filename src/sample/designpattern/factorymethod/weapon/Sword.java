package sample.designpattern.factorymethod.weapon;

import sample.designpattern.factorymethod.product.WeaponProduct;

public class Sword implements WeaponProduct {

	@Override
	public void showWepon(String job) {
		System.out.println(job + " weapon is a Sword!!");
	}

}
