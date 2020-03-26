package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import utility.ConnectionManager;

public class State {

	//read method
//	public static void list() 
//	{
//
//		Connection connection = new ConnectionManager().getConnection();
//		if (connection != null) {
//			try {
//				String selectSQL = "select * from state order by state_id";
//				PreparedStatement statement = connection.prepareStatement(selectSQL);
//
//				ResultSet set = statement.executeQuery();
//
//				while (set.next()) {
//					int state_id = set.getInt("state_id");
//					String state_name = set.getString("state_name");
//
//					System.out.println("State Id : " + state_id
//							+ " and State Name : " + state_name);
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
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter State Name : ");
				String statename = scanner.nextLine();
				System.out.println("Enter State ID : ");
				int stateid = scanner.nextInt();
				
				//sql query
				String insertSQL = "insert into state(state_id,state_name) values (?,?)";
				PreparedStatement statement = connection.prepareStatement(insertSQL);

				statement.setInt(1, stateid);
				statement.setString(2, statename);

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
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter State ID : ");
				int stateid = scanner.nextInt();
				
				//sql query
				String deleteSQL = "delete from state where state_id=?";
				PreparedStatement statement = connection.prepareStatement(deleteSQL);

				statement.setInt(1, stateid);

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

	
	//state updation method
	public static boolean update() 
	{
		Connection connection = new ConnectionManager().getConnection();
		if (connection != null) {
			try {
				//user inputs
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter State Name : ");
				String statename = scanner.nextLine();
				System.out.println("Enter State ID : ");
				int stateid = scanner.nextInt();
				
				//sql query
				String updateSQL = "update state set state_name=? where state_id=?";
				PreparedStatement statement = connection.prepareStatement(updateSQL);

				statement.setString(1, statename);
				statement.setInt(2, stateid);

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

