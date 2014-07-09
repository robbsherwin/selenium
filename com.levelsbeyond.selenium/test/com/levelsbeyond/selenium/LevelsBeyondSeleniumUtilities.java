package com.levelsbeyond.selenium;

import static org.junit.Assert.assertTrue;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LevelsBeyondSeleniumUtilities {
	
	public static String baseURL = "http://localhost:8080";
	public static String userName = "system";
	public static String userPassword = "password";
	public static String baseDatabaseUrl = "jdbc:postgresql://qa-postgres1.levelsbeyond.net:5432/AdDelivery";
	public static String baseDatabaseUser = "postgres";
	public static String baseDatabasePassword = "password";
	
	private Statement getDatabaseConnection() throws SQLException {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException ex) {
			System.out.println("Error: unable to load driver class!");
		}

		String url = baseDatabaseUrl + "?user=" + baseDatabaseUser
				+ "&password=" + baseDatabasePassword;

		Connection conn = DriverManager.getConnection(url);

		Statement stmt = conn.createStatement();
		return stmt;
	}
	
	public boolean isElementPresent(WebDriver driver, By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
}

