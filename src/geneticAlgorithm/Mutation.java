package geneticAlgorithm;
import java.util.Random;

public class Mutation {
	
	Individual mutant;
	
	public Mutation() {
		Random rand = new Random();
		
		mutant = new Individual();
		int mutationPoint = abs(rand.nextInt(mutant.gene.length));
		
		if(mutant.gene[mutationPoint] == 0) {
			mutant.gene[mutationPoint] = 1;
		}else {
				mutant.gene[mutationPoint] = 0;
		}
	}
	
	private int abs(int x) {
		if(x < 0)
			return -x;
		return x;
	}
}