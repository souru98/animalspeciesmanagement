package model;

import java.util.Scanner;

import DAO.Animal;
import DAO.AnimalDetails;
import DAO.Category;
import DAO.City;
import DAO.Display_Data;
import DAO.State;
import DAO.SubCategory;


//extended class 
class MainClass 
{

	//animal method
	void animal(Animal a) {
		Scanner sc = new Scanner(System.in);
		System.out
				.println("----------------------------------------------------------------------------------------------");
		System.out.println("1.Insert");
		System.out.println("2.Update");
		System.out.println("3.Delete");
		System.out.println("4.Exit");
		System.out.println("\nWhich Action You want to Perform?(1-4)");
		System.out
				.println("----------------------------------------------------------------------------------------------");
		int action_choice = sc.nextInt();

		//switch conditions
		switch (action_choice) {
		case 1:
			a.insert();
			break;
		case 2:
			a.update();
			break;
		case 3:
			a.delete();
			break;
		case 4:
			break;
		default:
			System.out.println("Wrong Choice");
		}
	}

	
	//animal details method
	void animalDetails(AnimalDetails ad) 
	{
		Scanner sc = new Scanner(System.in);
		System.out
				.println("----------------------------------------------------------------------------------------------");
		System.out.println("1.Insert");
		System.out.println("2.Update");
		System.out.println("3.Delete");
		System.out.println("4.Exit");
		System.out.println("\nWhich Action You want to Perform?(1-4)");
		System.out
				.println("----------------------------------------------------------------------------------------------");
		int action_choice = sc.nextInt();

		//switch conditions
		switch (action_choice) {
		case 1:
			ad.insert();
			break;
		case 2:
			ad.update();
			break;
		case 3:
			ad.delete();
			break;
		case 4:
			break;
		default:
			System.out.println("Wrong Choice");
		}
	}

	
	//state method
	void state(State s) 
	{
		Scanner sc = new Scanner(System.in);
		System.out
				.println("----------------------------------------------------------------------------------------------");
		System.out.println("1.Insert");
		System.out.println("2.Update");
		System.out.println("3.Delete");
		System.out.println("4.Exit");
		System.out.println("\nWhich Action You want to Perform?(1-4)");
		System.out
				.println("----------------------------------------------------------------------------------------------");
		int action_choice = sc.nextInt();

		//switch conditions
		switch (action_choice) {
		case 1:
			s.insert();
			break;
		case 2:
			s.update();
			break;
		case 3:
			s.delete();
			break;
		case 4:
			break;
		default:
			System.out.println("Wrong Choice");
		}
	}

	
	//city method
	void city(City c) 
	{
		Scanner sc = new Scanner(System.in);
		System.out
				.println("----------------------------------------------------------------------------------------------");
		System.out.println("1.Insert");
		System.out.println("2.Update");
		System.out.println("3.Delete");
		System.out.println("4.Exit");
		System.out.println("\nWhich Action You want to Perform?(1-4)");
		System.out
				.println("----------------------------------------------------------------------------------------------");
		int action_choice = sc.nextInt();

		//switch conditions
		switch (action_choice) {
		case 1:
			c.insert();
			break;
		case 2:
			c.update();
			break;
		case 3:
			c.delete();
			break;
		case 4:
			break;
		default:
			System.out.println("Wrong Choice");
		}
	}

	
	//category method
	public void category(Category cat) 
	{
		Scanner sc = new Scanner(System.in);
		System.out
				.println("----------------------------------------------------------------------------------------------");
		System.out.println("1.Insert");
		System.out.println("2.Update");
		System.out.println("3.Delete");
		System.out.println("4.Exit");
		System.out.println("\nWhich Action You want to Perform?(1-4)");
		System.out
				.println("----------------------------------------------------------------------------------------------");
		int action_choice = sc.nextInt();

		//switch conditions
		switch (action_choice) {
		case 1:
			cat.insert();
			break;
		case 2:
			cat.update();
			break;
		case 3:
			cat.delete();
			break;
		case 4:
			break;
		default:
			System.out.println("Wrong Choice");
		}
	}

	
	//subcategory method
	void subCategory(SubCategory scat) 
	{
		Scanner sc = new Scanner(System.in);
		System.out
				.println("----------------------------------------------------------------------------------------------");
		System.out.println("1.Insert");
		System.out.println("2.Update");
		System.out.println("3.Delete");
		System.out.println("4.Exit");
		System.out.println("\nWhich Action You want to Perform?(1-4)");
		System.out
				.println("----------------------------------------------------------------------------------------------");
		int action_choice = sc.nextInt();

		//switch conditions
		switch (action_choice){
		case 1:
			scat.insert();
			break;
		case 2:
			scat.update();
			break;
		case 3:
			scat.delete();
			break;
		case 4:
			break;
		default:
			System.out.println("Wrong Choice");
		}
	}
	
	
	//complex queries method
	void complexQueries()
	{
		Scanner sc = new Scanner(System.in);
		System.out
		.println("----------------------------------------------------------------------------------------------");
		System.out.println("1. List all the animals");
		System.out.println("2. List all the critically endangered Animals");
		System.out.println("3. List all the Endangered animals");
		System.out.println("4. Find the population of 'indian elephant' mammal in maysore.");
		System.out.println("5. list all the Mammals");
		System.out.println("6. list all the Reptiles & Amphibians");
		System.out.println("7. list all the Birds");
		System.out.println("8. list all the Cities");
		System.out.println("9. Exit.");
		System.out
		.println("----------------------------------------------------------------------------------------------");
		System.out.println("Enter Choice: ");
		int ch = sc.nextInt();
		Display_Data dd = new Display_Data();
		
		//switch conditions
		switch(ch){
			case 1:
				dd.list1();
				break;
			case 2:
				dd.list2();
				break;
			case 3:
				dd.list3();
				break;
			case 4:
				dd.list4();
				break;
			case 5:
				dd.list5();
				break;
			case 6:
				dd.list6();
				break;
			case 7:
				dd.list7();
				break;
			case 8:
				dd.list8();
				break;
			case 9:
				break;
			default:
				System.out.println("Wrong Choice.");
				break;
			
		}
		
	}
}



//Main class or  Driver code
public class Main 
{

	private static Scanner sc;

	//main method
	public static void main(String[] args) 
	{
		sc = new Scanner(System.in);
		System.out
				.println("----------------------------------------------------------------------------------------------");
		System.out
				.println("                         Welcome To The Animal Sanctury management System                              ");
		System.out
				.println("----------------------------------------------------------------------------------------------");
		while (true) {
			System.out.println("\nList Of tables:-");
			System.out.println("1.Animal");
			System.out.println("2.Category");
			System.out.println("3.Sub_Category");
			System.out.println("4.Animal_details");
			System.out.println("5.State");
			System.out.println("6.City");
			System.out.println("7.Display Data");
			System.out.println("8.Exit");
			System.out.println("Enter your Choice(1-8)");

			int table_choice = sc.nextInt();
			MainClass mc = new MainClass();
			
			//switch conditions
			switch (table_choice) {
			case 1:
				Animal a = new Animal();				
				mc.animal(a);
				break;
			case 2:
				Category cat= new Category();
				mc.category(cat);
				
				break;
			case 3:
				SubCategory scat = new SubCategory();
				mc.subCategory(scat);
				break;
			case 4:
				AnimalDetails ad = new AnimalDetails();
				mc.animalDetails(ad);
				break;
			case 5:
				State s = new State();
				mc.state(s);
				break;
			case 6:
				City cit = new City();
				mc.city(cit);
				break;
			case 7:
				mc.complexQueries();
				break;
			case 8:
				System.out.println("THANK YOU!");
				System.exit(0);
				break;

			default:
				System.out.println("Wrong Choice!!");
				;
			}
		}

	}

}
