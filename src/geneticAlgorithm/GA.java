package geneticAlgorithm;

public class GA {

	public static void main(String[] s) {
		int gen = 0; 
		while(true) {
			//Random Population
			Population population = new Population();
			
			//Survival of the fittest
			Selection select = new Selection(population);
			
			for(int i = select.fitValue.get(select.fitValue.size()-3); i>=0; i--){
				population.individual.remove(i);
			}
			
			//heredity
			Crossover cross = new Crossover(select.getFirstFittest(), select.getSecondFittest());
			
			//Mutation
			Mutation mutation = new Mutation();
			
			//Add into the population
			population.individual.put(population.calculateFitness(mutation.mutant), mutation.mutant);
			population.individual.put(population.calculateFitness(cross.Child1), cross.Child1);
			population.individual.put(population.calculateFitness(cross.Child2), cross.Child2);
			
			int fit = population.calculateFitness(cross.Child1);
			int fit1 = population.calculateFitness(cross.Child2);
			if(fit<fit1) {
				fit = fit1;
			}
			
			if(fit == 10) {
				System.out.println("Generation: "+gen);
				System.out.print("Individual: ");
				for(int i=0; i<cross.Child1.gene.length-1; i++)
					System.out.print(cross.Child1.gene[i]);
				break;
			}
			gen++;
		}
		
	}
}