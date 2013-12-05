package sample.designpattern.strategy;

public class AgeCompare implements HumanStrategy {

	@Override
	public int compare(Human human1, Human human2) {
		
		int result;
		
		if (human1.age > human2.age) {
			result = 1;
		} else if (human1.age == human2.age) {
			result = 0;
		} else {
			result = -1; 
		}
		
		return result;
	}
	
}
