package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelect {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prem\\eclipse-workspace\\Selinei\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement findElement = driver.findElement(By.cssSelector("input#email"));
		findElement.sendKeys("prabhube");
		driver.findElement(By.cssSelector(""));
		
	}
}
