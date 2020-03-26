package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import utility.ConnectionManager;

public class City {
	
	//read method
//	public static void list() 
//	{
//
//		Connection connection = new ConnectionManager().getConnection();
//		if (connection != null) {
//			try {
//				String selectSQL = "select * from  city,state where city.state_id=state.state_id";
//				PreparedStatement statement = connection.prepareStatement(selectSQL);
//
//				ResultSet set = statement.executeQuery();
//
//				while (set.next()) {
//					String state_name = set.getString("state_name");
//					String city_name = set.getString("city_name");
//					System.out.println("State Name : " + state_name
//							+ " and city Name : " + city_name);
//				}
//
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//
//		}
//	}

	
	//city insertion method
	public static boolean insert() 
	{
		Connection connection = new ConnectionManager().getConnection();
		if (connection != null) {
			try {
				//user inputs
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter City Name: ");
				String cityname = sc.nextLine();
				System.out.println("Enter State Id: ");
				int stateid = sc.nextInt();
				String insertSQL = "insert into city(city_name,state_id) values (?,?)";
				PreparedStatement statement = connection.prepareStatement(insertSQL);

				statement.setString(1, cityname);
				statement.setInt(2, stateid);

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

	
	//city deletion method
	public static boolean delete() 
	{
		Connection connection = new ConnectionManager().getConnection();
		if (connection != null) {
			try {
				//user inputs
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter City Name: ");
				int cityId = sc.nextInt();
				
				String deleteSQL = "delete from city where city_id=?";
				PreparedStatement statement = connection.prepareStatement(deleteSQL);

				statement.setInt(1, cityId);

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

	
	//city updation method
	public static boolean update() 
	{
		Connection connection = new ConnectionManager().getConnection();
		if (connection != null) {
			try {
				//user inputs
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter State Name: ");
				String cityname = sc.nextLine();
				System.out.println("Enter State ID: ");
				int cityid = sc.nextInt();
				
				//sql query
				String updateSQL = "update state set city_name=? where city_id=?";
				PreparedStatement statement = connection.prepareStatement(updateSQL);

				statement.setString(1, cityname);
				statement.setInt(2, cityid);

				int rowAffected = statement.executeUpdate();
				if (rowAffected > 0)
				{
					System.out.println("Updated details");
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
}
