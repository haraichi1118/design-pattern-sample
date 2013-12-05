package sample.designpattern.strategy;

public class HeightCompare implements HumanStrategy {

	@Override
	public int compare(Human human1, Human human2) {
		
		int result;
		
		if (human1.height > human2.height) {
			result = 1;
		} else if (human1.height == human2.height) {
			result = 0;
		} else {
			result = -1; 
		}
		
		return result;
	}

}
