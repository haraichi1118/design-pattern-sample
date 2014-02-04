package sample.designpattern.factorymethod;

import sample.designpattern.factorymethod.job.Magician;
import sample.designpattern.factorymethod.job.Soldier;
import sample.designpattern.factorymethod.product.WeaponProduct;

/**
 * 【factoryMethodパターン】
 *
 * FactoryMethod パターンは、オブジェクトの生成方法に一工夫加えることで、
 * より柔軟にオブジェクトを生成することを目的とするものです。
 * FactoryMethod パターンでは、インスタンスの生成をサブクラスに行わせることで、
 * より柔軟に生成するインスタンスを選択することが可能となります
 * 
 * @author tsuiki_kenji
 *
 */
public class FactoryMethodMain {

	public static void main(String[] args) {
		
		// 戦士
		Soldier soldier = new Soldier();
		WeaponProduct weapon = soldier.createWeapon(); 
		weapon.showWepon(soldier.getJobName());

		// 魔法使い
		Magician magician = new Magician();
		weapon = magician.createWeapon();
		weapon.showWepon(magician.getJobName());

	}

}
