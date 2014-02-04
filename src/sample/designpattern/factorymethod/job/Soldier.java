package sample.designpattern.factorymethod.job;

import sample.designpattern.factorymethod.factory.JobFactory;
import sample.designpattern.factorymethod.product.WeaponProduct;
import sample.designpattern.factorymethod.weapon.Sword;

public class Soldier extends JobFactory {

	@Override
	public String getJobName() {
		return "Soldier";
	}

	@Override
	public WeaponProduct createWeapon() {
		return new Sword();
	}

}
