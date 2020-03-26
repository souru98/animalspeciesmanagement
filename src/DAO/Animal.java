package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import utility.ConnectionManager;



public class Animal {


	public static void list() {

		Connection connection = new ConnectionManager().getConnection();
		if (connection != null) {
			try {
				String selectSQL = "select * from animal order by animal_id";
				PreparedStatement statement = connection
						.prepareStatement(selectSQL);

				ResultSet set = statement.executeQuery();

				while (set.next()) {
					int animal_id = set.getInt("animal_id");
					String animal_name = set.getString("animal_name");
					String height = set.getString("height");
					int weight = set.getInt("weight");
					String sci_name = set.getString("sci_name");
					int life_span = set.getInt("life_span");
					int age = set.getInt("age");
					int main_cat_id = set.getInt("main_category_id");
					
					System.out.println("Animal_Id : " + animal_id
							+ " and Animal_Name : " + animal_name
							+ " and height: " + height
							+ " and weight: " + weight
							+ " and sci_name: " + sci_name
							+ " life_span: " + life_span
							+ " and age: " + age
							+ " and main_cat_id: " + main_cat_id);
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}

	public static boolean insert() {
		Connection connection = new ConnectionManager().getConnection();
		if (connection != null) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter Animal Name: ");
				String name = sc.nextLine();
				System.out.println("Enter Animal height: ");
				String height = sc.nextLine();
				System.out.println("Enter Animal weight: ");
				int weight = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Animal Scientific Name: ");
				String sci_name = sc.nextLine();
				
				System.out.println("Enter Animal life span: ");
				int life_span = sc.nextInt();
				System.out.println("Enter Animal age: ");
				int age = sc.nextInt();
				System.out.println("Enter animal_Id: ");
				int animal_id = sc.nextInt();
				
				String insertSQL = "insert into animal(animal_id,name,height,weight,sci_name,life_span,age)values (?,?,?,?,?,?,?)";
				PreparedStatement statement = connection.prepareStatement(insertSQL);
				
				statement.setInt(1, animal_id);
				statement.setString(2, name);
				statement.setString(3, height);
				statement.setInt(4, weight);
				statement.setString(5, sci_name);
				statement.setInt(6, life_span);
				statement.setInt(7, age);
				
			
				int rowAffected = statement.executeUpdate();

				if (rowAffected > 0)
				{
					System.out.println("Inserted details");
					return true;
				}
				else
					return false;
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return false;
	}

	public static boolean delete() {
		Connection connection = new ConnectionManager().getConnection();
		if (connection != null) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter Animal Id: ");
				int aid = sc.nextInt();
				String deleteSQL = "DELETE FROM animal WHERE animal_id=?";
				PreparedStatement statement = connection.prepareStatement(deleteSQL);

				statement.setInt(1, aid);

				int rowAffected = statement.executeUpdate();

				if (rowAffected > 0)
					{
					System.out.println("Deleted details");
					return true;
					}
				else
					return false;
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return false;
	}

	public static boolean update() {
		Connection connection = new ConnectionManager().getConnection();
		if (connection != null) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter Animal Name: ");
				String name = sc.nextLine();
				System.out.println("Enter Animal height: ");
				String height = sc.nextLine();
				System.out.println("Enter Animal weight: ");
				int weight = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Animal Scientific Name: ");
				String sci_name = sc.nextLine();
				
				System.out.println("Enter Animal life span: ");
				int life_span = sc.nextInt();
				System.out.println("Enter Animal age: ");
				int age = sc.nextInt();
				System.out.println("Enter animal_Id: ");
				int aid = sc.nextInt();
				
				String updateSQL = "update animal set name =?,height =?,weight =?,sci_name =?,life_span =?,age =?  where animal_id= ?";
				
				PreparedStatement statement = connection.prepareStatement(updateSQL);
				
				statement.setString(1, name);
				statement.setInt(7, aid);
                statement.setString(2, height);
                statement.setInt(3, weight);
                statement.setString(4, sci_name);
                statement.setInt(5, life_span);
                statement.setInt(6, age);
                
                
				int rowAffected = statement.executeUpdate();

				if (rowAffected > 0)
					return true;
				else
					return false;
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return false;
	}
}
