package sample.designpattern.strategy;

/**
 * 【Strategyパターン】
 * 
 * 普通にプログラミングしていると、メソッドの中に溶け込んだ形でアルゴリズムを実装してしまうことがよくあります。
 * if文などで分岐させることでアルゴリズムを変更するような方法です。
 * Strategyパターンでは、戦略の部分を意識して別クラスとして作成するようにしています。
 * 戦略x部分を別クラスとして作成しておき、戦略を変更したい場合には、利用する戦略クラスを変更するという方法で対応します。
 * Strategyパターンを利用することで、メソッドの中に溶け込んだ形のアルゴリズムより柔軟でメンテナンスしやすい設計となります。
 * 
 * @author tsuiki_kenji
 *
 */
public class StrategyMain {

	public static void main(String[] args) {
		
		// 対象者の宣言
		Human tanaka = new Human("tanaka", 170, 60, 28);
		Human suzuki = new Human("suzuki", 175, 59, 28);
		
		// 身長の比較
		Comparetor comparetor = new Comparetor(new HeightCompare());
		System.out.println("身長の比較結果 = " + comparetor.compare(tanaka, suzuki));
		
		// 体重の比較
		comparetor = new Comparetor(new WeightCompare());
		System.out.println("体重の比較結果 = " + comparetor.compare(tanaka, suzuki));
		
		// 年齢の比較
		comparetor = new Comparetor(new AgeCompare());
		System.out.println("年齢の比較結果 = " + comparetor.compare(tanaka, suzuki));

	}

}
