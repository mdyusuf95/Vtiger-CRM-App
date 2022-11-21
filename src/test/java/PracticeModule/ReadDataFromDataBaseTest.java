package PracticeModule;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

import com.mysql.jdbc.Driver;

public class ReadDataFromDataBaseTest {
	public static void main(String[] args) throws SQLException {
		//create obj for driver
		Driver driver = new Driver();
		//regester db
		DriverManager.registerDriver(driver);
		//get connect with database
	//	String query1="INSERT INTO STUDENT (SID,STUDENTNAME,PLACE) VALUES('1773','GAURAV','JEMSHEDPUR')";
		//ResultSet ry = DriverManager.getConnection("jdbc:mysql://localhost:3306/project1", "root", "root");.createStatement().executeQuery(query1);
		Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/project1", "root", "root");
		//create stament
		Statement statment = connect.createStatement();
		for(int i=0;i<26;i++)
		{
			Random r= new Random();
			int rm= r.nextInt()/100000;
		String query1="INSERT INTO STUDENT (SID,STUDENTNAME,PLACE) VALUES('"+rm+"','GAU"+rm/10+"','JEMSHE"+rm/10+"DPUR')";
		statment.executeUpdate(query1);
		}
		//statment.executeUpdate(query1);
		String query="select * from student;";
		//execute the qery
		ResultSet res = statment.executeQuery(query);
		
		while (res.next()) {
			System.out.println(res.getString(1)+"  "+res.getString(2)+" "+res.getString(3));
			
		}
		
		
	}

}
