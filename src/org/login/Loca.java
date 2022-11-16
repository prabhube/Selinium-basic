package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loca {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prem\\eclipse-workspace\\Selinei\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		WebElement findElement = driver.findElement(By.id("email"));
		findElement.sendKeys("prabhubw");
		WebElement findElement2 = driver.findElement(By.id("pass"));
		findElement2.sendKeys("prem@1817");
		WebElement findElement3 = driver.findElement(By.name("login"));
		findElement3.click();
	}
}
