package sample.designpattern.factorymethod.job;

import sample.designpattern.factorymethod.factory.JobFactory;
import sample.designpattern.factorymethod.product.WeaponProduct;
import sample.designpattern.factorymethod.weapon.Rod;

public class Magician extends JobFactory{

	@Override
	public String getJobName() {
		return "Magician";
	}

	@Override
	public WeaponProduct createWeapon() {
		return new Rod();
	}

}
