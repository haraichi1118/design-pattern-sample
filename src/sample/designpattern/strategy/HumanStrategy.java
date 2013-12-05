package sample.designpattern.strategy;

/**
 *  Human同士を比較するインタフェース
 * @author tsuiki_kenji
 *
 */
public interface HumanStrategy {
	public int compare(Human human1, Human human2);
}
