package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import utility.ConnectionManager;

public class SubCategory {

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
//				}
//
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//
//		}
//	}

	
	//subcategory insertion method
	public static boolean insert() 
	{
		Connection connection = new ConnectionManager().getConnection();
		if (connection != null) {
			try {
				//user inputs
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter Sub Category Name : ");
				String subname = scanner.nextLine();
				System.out.println("Enter Sub Category ID : ");
				int subid = scanner.nextInt();
				
				//sql query
				String insertSQL = "insert into sub_category(sub_category_id,sub_category_name) values (?,?)";
				PreparedStatement statement = connection.prepareStatement(insertSQL);

				statement.setInt(1, subid);
				statement.setString(2, subname);

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

	
	//subcategory deletion method
	public static boolean delete() 
	{
		Connection connection = new ConnectionManager().getConnection();
		if (connection != null) {
			try {
				//user inputs
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter Sub Category ID : ");
				int subid = sc.nextInt();
				
				//sql query
				String deleteSQL = "delete from sub_category where sub_category_id=?";
				PreparedStatement statement = connection.prepareStatement(deleteSQL);

				statement.setInt(1, subid);

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

	
	//subcategory updation method
	public static boolean update() 
	{
		Connection connection = new ConnectionManager().getConnection();
		if (connection != null) {
			try {
				//user inputs
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter Sub Category Name: ");
				String subname = sc.nextLine();
				System.out.println("Enter Sub Category Id: ");
				int subid = sc.nextInt();
				
				//sql query
				String updateSQL = "update sub_category set sub_category_name=? where sub_category_id=?";
				PreparedStatement statement = connection.prepareStatement(updateSQL);
				
				statement.setString(1, subname);
				statement.setInt(2, subid);
				
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

