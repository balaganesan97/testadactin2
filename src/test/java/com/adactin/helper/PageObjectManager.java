package com.adactin.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.adactin.poms.Booking;
import com.adactin.poms.Confirm;
import com.adactin.poms.LoginPage;
import com.adactin.poms.Logsout;
import com.adactin.poms.Search;

public class PageObjectManager {
	
	public static WebDriver driver;
private LoginPage lp;
	private Search sp;
	private Booking bp;
	private Confirm cp;
	private Logsout lo;
	
	public PageObjectManager(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
			
	}
	public LoginPage getLp() {
		LoginPage lp=new LoginPage(driver);
		
		return lp;
	}
	public Search getSp() {
		Search sp=new Search(driver);
		return sp;
	}
	public Booking getBp() {
		Booking bp=new Booking(driver);
		return bp;
	}
	public Confirm getCp() {
		Confirm cp=new Confirm (driver);
		return cp;
	}
	public Logsout getLo() {
		Logsout lo=new Logsout(driver);
		return lo;
	}
	
	
	
	
	
	
	
	
	
}