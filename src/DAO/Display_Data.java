package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import utility.ConnectionManager;


//business operations
public class Display_Data {
	
	//query 1
	public void list1() 
	{
		Connection connection = new ConnectionManager().getConnection();
		if (connection != null) {
			try {
				
				//sql query to get all animal
				String selectSQL = "select * from animal";
				PreparedStatement statement = connection.prepareStatement(selectSQL);

				ResultSet set = statement.executeQuery();

				//iteration method
				while (set.next()) 
				{
					int aid = set.getInt("animal_id");
					String aName = set.getString("name");
					String height= set.getString("height");
					int weight= set.getInt("weight");
	                String sci_name=set.getString("sci_name");
	                int life_span= set.getInt("life_span");
	                int age=set.getInt("age");
					System.out.println("animal_id: " + aid + "  "
							+ " name : " + aName + "  " + "height: " + height + "  "+ "weight: " + weight + "  "
							+ "sci_name: " + sci_name + "  "+ "life_span: " + life_span + "  "+ " age : " + age);
					System.out.println("-------------------------------------------------------------------------------------------------"
							+ "-------------------------------------");
				}
				System.out.println("Query return successfully.");
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}

	
	//query 2
	public void list2() 
	{
		Connection connection = new ConnectionManager().getConnection();
		if (connection != null) {
			try {
				//sql query to get all critically endangered animal
				String selectSQL = "select animal.animal_id,animal.name,animal.height,animal.weight,animal.sci_name,animal.life_span,animal.age\r\n" + 
						"from animal\r\n" + 
						"INNER JOIN main_category on animal.animal_id=main_category.animal_id\r\n" + 
						"inner join category on category.category_id=main_category.category_id\r\n" + 
						"where main_category.category_id=2";
				PreparedStatement statement = connection.prepareStatement(selectSQL);

				ResultSet set = statement.executeQuery();

				//iteration method
				while (set.next()) 
				{
					int aid = set.getInt("animal_id");
					String aName = set.getString("name");
					String height= set.getString("height");
					int weight= set.getInt("weight");
	                String sci_name=set.getString("sci_name");
	                int life_span= set.getInt("life_span");
	                int age=set.getInt("age");
					System.out.println("animal_id: " + aid + "  "
							+ " name : " + aName + "  " + "height: " + height + "  "+ "weight: " + weight + "  "
							+ "sci_name: " + sci_name + "  "+ "life_span: " + life_span + "  "+ " age : " + age);
					
					System.out.println("-------------------------------------------------------------------------------------------------"
							+ "-------------------------------------");
				}
				System.out.println("Query return successfully.");
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}

	
	//query 3
	public void list3() 
	{
		Connection connection = new ConnectionManager().getConnection();
		if (connection != null) {
			try {
				//sql query to get all endangered animal
				String selectSQL = "select animal.animal_id,animal.name,animal.height,animal.weight,animal.sci_name,animal.life_span,animal.age\r\n" + 
						"from animal\r\n" + 
						"INNER JOIN main_category on animal.animal_id=main_category.animal_id\r\n" + 
						"inner join category on category.category_id=main_category.category_id\r\n" + 
						"where main_category.category_id=3";
				PreparedStatement statement = connection.prepareStatement(selectSQL);

				ResultSet set = statement.executeQuery();

				
				//iteration method
				while (set.next()) 
				{
					int aid = set.getInt("animal_id");
					String aName = set.getString("name");
					String height= set.getString("height");
					int weight= set.getInt("weight");
	                String sci_name=set.getString("sci_name");
	                int life_span= set.getInt("life_span");
	                int age=set.getInt("age");
					System.out.println("animal_id: " + aid + "  "
							+ " name : " + aName + "  " + "height: " + height + "  "+ "weight: " + weight + "  "
							+ "sci_name: " + sci_name + "  "+ "life_span: " + life_span + "  "+ " age : " + age);
					
					System.out.println("-------------------------------------------------------------------------------------------------"
							+ "-------------------------------------");
				}
				System.out.println("Query return successfully.");
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}

	
	//query 4
	public void list4() 
	{
		Connection connection = new ConnectionManager().getConnection();
		if (connection != null) {
			try {
				//sql query to get population of indian elephant
				String selectSQL = "select name, population from animal a, animal_details d, city c where a.animal_id = d.animal_id and d.city_id = c.city_id and c.city_name = 'maysore' and a.name = 'indian elephant'";
				PreparedStatement statement = connection.prepareStatement(selectSQL);

				ResultSet set = statement.executeQuery();

				
				//iteration method
				while (set.next()) 
				{
					String name = set.getString("name");
					int population = set.getInt("population");
					System.out.println("Name: " + name + " Population: "
							+ population);
				}
				System.out.println("Query return successfully.");
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}

	
	//query 5
	public void list5() {
		Connection connection = new ConnectionManager().getConnection();
		if (connection != null) {
			try {
				//sql query to get all mammals
				String selectSQL = "select animal.animal_id,animal.name,animal.height,animal.weight,animal.sci_name,animal.life_span,animal.age\r\n" + 
						"from animal\r\n" + 
						"INNER JOIN main_category on animal.animal_id=main_category.animal_id\r\n" + 
						"inner join sub_category on sub_category.sub_category_id=main_category.sub_category_id\r\n" + 
						"where main_category.sub_category_id=2";
				PreparedStatement statement = connection.prepareStatement(selectSQL);

				ResultSet set = statement.executeQuery();

				
				//iteration method
				while (set.next()) 
				{
					int aid = set.getInt("animal_id");
					String aName = set.getString("name");
					String height= set.getString("height");
					int weight= set.getInt("weight");
	                String sci_name=set.getString("sci_name");
	                int life_span= set.getInt("life_span");
	                int age=set.getInt("age");
					System.out.println("animal_id: " + aid + "  "
							+ " name : " + aName + "  " + "height: " + height + "  "+ "weight: " + weight + "  "
							+ "sci_name: " + sci_name + "  "+ "life_span: " + life_span + "  "+ " age : " + age);
					
					System.out.println("-------------------------------------------------------------------------------------------------"
							+ "-------------------------------------");
				}
				System.out.println("Query return successfully.");
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}

	
	//query 6
	public void list6() 
	{
		
		Connection connection = new ConnectionManager().getConnection();
		if (connection != null) {
			try {
				//sql query to get all Reptiles & Amphibians
				String selectSQL = "select animal.animal_id,animal.name,animal.height,animal.weight,animal.sci_name,animal.life_span,animal.age\r\n" + 
						"from animal\r\n" + 
						"INNER JOIN main_category on animal.animal_id=main_category.animal_id\r\n" + 
						"inner join sub_category on sub_category.sub_category_id=main_category.sub_category_id\r\n" + 
						"where main_category.sub_category_id=3";
				PreparedStatement statement = connection.prepareStatement(selectSQL);

				ResultSet set = statement.executeQuery();

				
				//iteration method
				while (set.next()) 
				{
					int aid = set.getInt("animal_id");
					String aName = set.getString("name");
					String height= set.getString("height");
					int weight= set.getInt("weight");
	                String sci_name=set.getString("sci_name");
	                int life_span= set.getInt("life_span");
	                int age=set.getInt("age");
					System.out.println("animal_id: " + aid + "  "
							+ " name : " + aName + "  " + "height: " + height + "  "+ "weight: " + weight + "  "
							+ "sci_name: " + sci_name + "  "+ "life_span: " + life_span + "  "+ " age : " + age);
					
					System.out.println("-------------------------------------------------------------------------------------------------"
							+ "-------------------------------------");
				}
				System.out.println("Query return successfully.");
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}

	
	//query 7
	public void list7() 
	{
		
		Connection connection = new ConnectionManager().getConnection();
		if (connection != null) {
			try {
				//sql query to get all birds
				String selectSQL = "select animal.animal_id,animal.name,animal.height,animal.weight,animal.sci_name,animal.life_span,animal.age\r\n" + 
						"from animal\r\n" + 
						"INNER JOIN main_category on animal.animal_id=main_category.animal_id\r\n" + 
						"inner join sub_category on sub_category.sub_category_id=main_category.sub_category_id\r\n" + 
						"where main_category.sub_category_id=1";
				PreparedStatement statement = connection.prepareStatement(selectSQL);

				ResultSet set = statement.executeQuery();

				
				//iteration method
				while (set.next()) 
				{
					int aid = set.getInt("animal_id");
					String aName = set.getString("name");
					String height= set.getString("height");
					int weight= set.getInt("weight");
	                String sci_name=set.getString("sci_name");
	                int life_span= set.getInt("life_span");
	                int age=set.getInt("age");
					System.out.println("animal_id: " + aid + "  "
							+ " name : " + aName + "  " + "height: " + height + "  "+ "weight: " + weight + "  "
							+ "sci_name: " + sci_name + "  "+ "life_span: " + life_span + "  "+ " age : " + age);
					
					System.out.println("-------------------------------------------------------------------------------------------------"
							+ "-------------------------------------");
				}
				System.out.println("Query return successfully.");
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}

	
	//query 8
	public void list8() 
	{
		
		Connection connection = new ConnectionManager().getConnection();
		if (connection != null) {
			try {
				//query to get list of all the Cities
				String selectSQL = "select city_id,city_name\r\n" + 
						"from city";
				PreparedStatement statement = connection.prepareStatement(selectSQL);

				ResultSet set = statement.executeQuery();

				
				//iteration method
				while (set.next()) 
				{
					String cityid = set.getString("city_id");
					String cityname = set.getString("city_name");
					
					System.out.println("CityId: " + cityid + " CityName: "
							+ cityname);
					System.out.println("-------------------------------------------------------------------------");
				}
				System.out.println("Query return successfully.");
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}
}

