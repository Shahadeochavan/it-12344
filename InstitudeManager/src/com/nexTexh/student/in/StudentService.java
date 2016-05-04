package com.nexTexh.student.in;
import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.HashMap;


/**
 * @author 801
 *
 */
public class StudentService {
	public static void insertOperation() {

		Connection connection = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/InstituteManager", "root",
					"system");

			stmt = connection.createStatement();
			stmt
					.execute("INSERT INTO STUDENT (NAME,DATE_OF_BIRTH,CLASS,ID,ROLL_NUMBER,MOBILE_NUMBER,HOME_PHONE_NUMBER,YEAR_OF_JOINING) "
							+ "VALUES ('Aniket','05-12-1990','BE',6,13,96374523,12334445,2012)");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("your data is inserted successfully");
	}

	public static void updateOpertion() {

		Connection connection = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/InstituteManager", "root",
					"system");
			stmt = connection.createStatement();
			stmt
					.execute("UPDATE student SET Name='Umesh' where Roll_Number='13'");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Your data is successfully update");
	}

	public static void deleteOpertion() {

		Connection connection = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/InstituteManager", "root",
					"system");

			stmt = connection.createStatement();
			stmt.execute("DELETE FROM STUDENT WHERE ID = 5");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("your data is deleted successfully");
	}

	public static void searchByName(String strName) {

		Connection connection = null;
		Statement stmt = null;
		ArrayList<Map<String, String>> list = new  ArrayList<>();
		
		try
		{

			Map<String, String> map = null;
			connection=getDBConnection();
			String strQuery="select name,date_of_birth,class,id,roll_number,mobile_number,home_phone_number,year_of_joining from student where name='"+strName+ "'";
			stmt=connection.createStatement();
			ResultSet rs=stmt.executeQuery(strQuery);
			while (rs.next()) {
				map = new HashMap<String, String>();
				map.put("Name", rs.getString("name"));
				map.put("DATE_OF_BIRTH",rs.getString("DATE_OF_BIRTH"));
				map.put("CLASS",rs.getString("class"));
				map.put("id", rs.getString("id"));
				map.put("roll_number",rs.getString("roll_number"));
				map.put("mobile_number",rs.getString("mobile_number"));
				map.put("home_phone_number", rs.getString("home_phone_number"));
				map.put("year_of_joining",rs.getString("year_of_joining"));
				list.add(map);
			}
			Set s1=map.entrySet();
			Iterator itr=s1.iterator();
			while(itr.hasNext())
			{
				Map.Entry m1=(Map.Entry)itr.next();
				System.out.println(m1.getKey());
				System.out.println(m1.getValue());
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		}
	public static void searchByClass(String strClass) {

		Connection connection = null;
		Statement stmt = null;
		ArrayList<Map<String, String>> list = new  ArrayList<>();
		try
		{
			Map<String, String> map = null;
			connection=getDBConnection();
			String strQuery="select name,date_of_birth,class,id,roll_number,mobile_number,home_phone_number,year_of_joining from student where name='"+strClass+ "'";
			stmt=connection.createStatement();
			ResultSet rs=stmt.executeQuery(strQuery);
			while (rs.next()) {
				map = new HashMap<String, String>();
				map.put("Name", rs.getString("name"));
				map.put("DATE_OF_BIRTH",rs.getString("DATE_OF_BIRTH"));
				map.put("CLASS",rs.getString("class"));
				map.put("id", rs.getString("id"));
				map.put("roll_number",rs.getString("roll_number"));
				map.put("mobile_number",rs.getString("mobile_number"));
				map.put("home_phone_number", rs.getString("home_phone_number"));
				map.put("year_of_joining",rs.getString("year_of_joining"));
				list.add(map);
			}
			Set s1=map.entrySet();
			Iterator itr=s1.iterator();
			while(itr.hasNext())
			{
				Map.Entry m1=(Map.Entry)itr.next();
				System.out.println(m1.getKey());
				System.out.println(m1.getValue());
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		}
	public static void searchByYearOfJoining(String strYOJ) {

		Connection connection = null;
		Statement stmt = null;
		ArrayList<Map<String, String>> list = new  ArrayList<>();
		try
		{
			Map<String, String> map = null;
			connection=getDBConnection();
			String strQuery="select name,date_of_birth,class,id,roll_number,mobile_number,home_phone_number,year_of_joining from student where name='"+strYOJ+ "'";
			stmt=connection.createStatement();
			ResultSet rs=stmt.executeQuery(strQuery);
			while (rs.next()) {
				map = new HashMap<String, String>();
				map.put("Name", rs.getString("name"));
				map.put("DATE_OF_BIRTH",rs.getString("DATE_OF_BIRTH"));
				map.put("CLASS",rs.getString("class"));
				map.put("id", rs.getString("id"));
				map.put("roll_number",rs.getString("roll_number"));
				map.put("mobile_number",rs.getString("mobile_number"));
				map.put("home_phone_number", rs.getString("home_phone_number"));
				map.put("year_of_joining",rs.getString("year_of_joining"));
				list.add(map);
			}
			Set s1=map.entrySet();
			Iterator itr=s1.iterator();
			while(itr.hasNext())
			{
				Map.Entry m1=(Map.Entry)itr.next();
				System.out.println(m1.getKey());
				System.out.println(m1.getValue());
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		}




		public static  Connection getDBConnection()
		{
		 Connection connection=null;
		 try
		 {
			 Class.forName("com.mysql.jdbc.Driver");
				connection = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/InstituteManager", "root",
						"system");

		 }
		 catch(SQLException e)
		 {
			 e.printStackTrace();
		 }
		 catch(ClassNotFoundException e)
		 {
		   e.printStackTrace();

		 }
		return connection;

	}

}
