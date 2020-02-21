package geneticAlgorithm;
import java.util.Map;
import java.util.HashMap;

public class Population {
	
	public int fitness = 0;
	
	public Map<Integer, Individual> individual = new HashMap<Integer, Individual>();
	
	public Population() {
		for(int i=0; i<20; i++) {
			Individual in = new Individual();
			individual.put(calculateFitness(in), in);
		}
		
		/*for(int x: population.keySet()) {
			System.out.print(x+" ");
			for(int i=0; i<10; i++)
				System.out.print(population.get(x).gene[i]);
			System.out.println("");
		}*/
		
	}
	
	//Fitness function calculates fitness as the number of genes = 1
	public int calculateFitness(Individual indie) {
		fitness = 0;
		for(int i=0; i<10; i++) {
			if(indie.gene[i] == 1) {
				++fitness;
			}
		}
		return fitness;
	}	
}