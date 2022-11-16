package org.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Programone {
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prem\\eclipse-workspace\\Selinei\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
	//	driver.switchTo().frame(0);
	//	driver.switchTo().frame("login_page");
		WebElement frame = driver.findElement(By.xpath("//frame[@name='login_page']"));
		driver.switchTo().frame(frame);
		WebElement customerid = driver.findElement(By.xpath("//input[@type='text']"));
		customerid.sendKeys("2347686");
	}
}
