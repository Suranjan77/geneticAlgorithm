package geneticAlgorithm;
import java.util.Random;

public class Individual {
	int[] gene = new int[10];
	
	public Individual() {
		Random rand = new Random();
		
		for(int i=0; i<10; i++) {
			gene[i] = (abs(rand.nextInt())%2); //generates 0 or 1 randomly
		}
	}

	private int abs(int x) {
		if(x < 0)
			return -x;
		return x;
	}
}