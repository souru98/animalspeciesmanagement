package model;

public class AnimalDetails {
	
	private int animal_id;
	private int city_id;
	private int population;
	
	
	public int getAnimal_id() {
		return animal_id;
	}
	public void setAnimal_id(int animal_id) {
		this.animal_id = animal_id;
	}
	public int getCity_id() {
		return city_id;
	}
	public void setCity_id(int city_id) {
		this.city_id = city_id;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	
	
	public AnimalDetails(int animal_id, int city_id, int population) {
		super();
		this.animal_id = animal_id;
		this.city_id = city_id;
		this.population = population;
	}

	
	
}
