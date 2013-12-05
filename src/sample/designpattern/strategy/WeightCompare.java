package sample.designpattern.strategy;

public class WeightCompare implements HumanStrategy {

	@Override
	public int compare(Human human1, Human human2) {
		
		int result;
		
		if (human1.weight > human2.weight) {
			result = 1;
		} else if (human1.weight == human2.weight) {
			result = 0;
		} else {
			result = -1; 
		}
		
		return result;
	}

}
