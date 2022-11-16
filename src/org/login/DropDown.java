package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prem\\eclipse-workspace\\Selinei\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	
	driver.get("https://www.facebook.com/");
	WebElement createaccount = driver.findElement(By.xpath("//a[text()='Create New Account']"));
	createaccount.click();
	WebElement day = driver.findElement(By.id("day"));
	Select s=new Select(day);
	s.selectByIndex(10);
	WebElement month = driver.findElement(By.id("month"));
	s.selectByValue("4");
	WebElement year = driver.findElement(By.id("year"));
	s.selectByVisibleText("2018");
	

	
	}

		
	}

