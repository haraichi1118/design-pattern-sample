package sample.designpattern.strategy;

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
