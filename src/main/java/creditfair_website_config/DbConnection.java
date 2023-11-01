package creditfair_website_config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Logger;

import com.jcraft.jsch.JSch;

import creditfair_admin_maven_config.DbConnection;

public class DbConnection {
	String appid = null;
	String otp = null;
	private final static Logger LOGGER = Logger.getLogger(DbConnection.class.getName());
	
	public DbConnection() throws Exception {
		super();
		// TODO Auto-generated constructor stub

	}

	public String pullOtp()
	{
		try {
			 JSch jsch = new JSch(); 
			Class.forName("com.mysql.jdbc.Driver");

			System.out.println("Driver loaded");

//			Connection con = DriverManager.getConnection(
//					"jdbc:mysql://localhost:9090/cfwebbeta", "pratik",
//					"r<)SDv0hvXtzH");
			Connection con = DriverManager.getConnection(
					"data base url server", "username ",
					"userpassword");
			System.out.println("Connected to prod DB");

			Statement smt = con.createStatement();
			ResultSet rsotp = smt.executeQuery(
					"write query here");
			while (rsotp.next()) {

				otp = rsotp.getString("otp");
			}
			System.out.println(otp);

		}
		catch (Exception e) {
			e.printStackTrace();
		}
//		

		return otp;
		
	}
	
}
