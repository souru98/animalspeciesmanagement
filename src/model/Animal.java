package model;


//animal class
public class Animal 
{
//arguments
private	int animal_id;
private String name;
private String height;
private	int weight;
private	String sci_name;
private	int life_span;
private	int age;


//getters and setters
public int getAnimal_id() {
	return animal_id;
}
public void setAnimal_id(int animal_id) {
	this.animal_id = animal_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getHeight() {
	return height;
}
public void setHeight(String height) {
	this.height = height;
}
public int getWeight() {
	return weight;
}
public void setWeight(int weight) {
	this.weight = weight;
}
public String getSci_name() {
	return sci_name;
}
public void setSci_name(String sci_name) {
	this.sci_name = sci_name;
}
public int getLife_span() {
	return life_span;
}
public void setLife_span(int life_span) {
	this.life_span = life_span;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

//constructor
public Animal(int animal_id, String name, String height, int weight, String sci_name, int life_span, int age) {
	super();
	this.animal_id = animal_id;
	this.name = name;
	this.height = height;
	this.weight = weight;
	this.sci_name = sci_name;
	this.life_span = life_span;
	this.age = age;
}


	

}
