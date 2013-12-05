package sample.designpattern.strategy;

public class Comparetor {
	
	HumanStrategy strategy;
	
	public Comparetor(HumanStrategy strategy) {
		this.strategy = strategy;
	}
	
	public int compare(Human human1, Human human2) {
		return strategy.compare(human1, human2);
	}

}
