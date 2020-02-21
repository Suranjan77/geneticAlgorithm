package geneticAlgorithm;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Selection {
	List<Integer> fitValue = new ArrayList<>();
	Population population;
	
	public Selection(Population population) {
		this.population = population;
		for (int i : population.individual.keySet()) {
			fitValue.add(i); 
		}
		Collections.sort(fitValue);
	}
	
	public Individual getFirstFittest(){
		return population.individual.get(fitValue.get(fitValue.size()-1));
	}
	
	public Individual getSecondFittest(){
		return population.individual.get(fitValue.get(fitValue.size()-2));
	}
}