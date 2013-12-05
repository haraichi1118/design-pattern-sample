package sample.designpattern.strategy;

/**
 * Humanクラス
 * @author tsuiki_kenji
 *
 */
public class Human {

	// 名前
	public String name;
	// 身長
	public int height;
	// 体重
	public int weight;
	// 年齢
	public int age;
	
	// コンストラクタ
	public Human (String name, int height, int weight, int age) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.age = age;
	}
}
