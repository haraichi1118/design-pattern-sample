package sample.designpattern.factorymethod.factory;

import sample.designpattern.factorymethod.product.WeaponProduct;

public abstract class JobFactory {
	
	public abstract String getJobName();
	public abstract WeaponProduct createWeapon();

}
