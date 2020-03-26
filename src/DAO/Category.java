package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import utility.ConnectionManager;

public class Category {

   //read method
//	public static void list() 
//	{
//
//		Connection connection = new ConnectionManager().getConnection();
//		if (connection != null) {
//			try {
//				String selectSQL = "select * from state order by state_id";
//				PreparedStatement statement = connection
//						.prepareStatement(selectSQL);
//
//				ResultSet set = statement.executeQuery();
//
//				while (set.next()) {
//					int state_id = set.getInt("state_id");
//					String state_name = set.getString("state_name");
//
//					System.out.println("State Id : " + state_id
//							+ " and State Name : " + state_name);
//					
//				}
//
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//
//		}
//	}

	
	//category insertion method
	public static boolean insert() 
	{
		Connection connection = new ConnectionManager().getConnection();
		if (connection != null) {
			try {
				//user inputs
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter Category Name : ");
				String catname = sc.nextLine();
				System.out.println("Enter Category ID : ");
				int catid = sc.nextInt();
				
				//sql query
				String insertSQL = "insert into category(category_id,category_name) values (?,?)";
				PreparedStatement statement = connection.prepareStatement(insertSQL);

				statement.setInt(1, catid);
				statement.setString(2, catname);

				int rowAffected = statement.executeUpdate();
				if (rowAffected > 0)
				{
					System.out.println("Inserted details");
					return true;
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return false;
	}

	
	//category deletion method
	public static boolean delete() 
	{
		Connection connection = new ConnectionManager().getConnection();
		if (connection != null) {
			try {
				//user inputs
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter Category ID : ");
				int catid = sc.nextInt();
				
				//sql query
				String deleteSQL = "delete from category where category_id=?";
				PreparedStatement statement = connection.prepareStatement(deleteSQL);

				statement.setInt(1, catid);

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

	
	//category updation method
	public static boolean update() 
	{
		Connection connection = new ConnectionManager().getConnection();
		if (connection != null) {
			try {
				//user inputs
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter Category Name : ");
				String catname = sc.nextLine();
				System.out.println("Enter Category ID : ");
				int catid = sc.nextInt();
				
				//sql query
				String updateSQL = "update category set category_name=? where category_id=?";
				PreparedStatement statement = connection.prepareStatement(updateSQL);

				statement.setString(1, catname);
				statement.setInt(2, catid);

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
