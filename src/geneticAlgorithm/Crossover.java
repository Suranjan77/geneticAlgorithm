package geneticAlgorithm;
import java.util.Random;

public class Crossover {
	Individual Child1, Child2;
	
	public Crossover(Individual firstFit, Individual secondFit) {
		Random rand = new Random();
		int crossoverPoint = abs(rand.nextInt(firstFit.gene.length));
		
		for(int i=0; i<crossoverPoint; i++) {
			firstFit.gene[i] = secondFit.gene[i];
		}
		
		for(int i=crossoverPoint; i<=firstFit.gene.length - 1; i++) {
			secondFit.gene[i] = firstFit.gene[i];
		}
		
		Child1 = firstFit;
		Child2 = secondFit;
	}
	
	private int abs(int x) {
		if(x < 0)
			return -x;
		return x;
	}
}