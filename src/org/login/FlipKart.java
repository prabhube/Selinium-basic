package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prem\\eclipse-workspace\\Selinei\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://greenstech.in/selenium-course-content.html");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement scrolldown = driver.findElement(By.xpath("//h3[contains(text(), 'Certification')]"));
		js.executeScript("arguments[0].scrollIntoView(true)", scrolldown);
		Thread.sleep(3000);
//		driver.findElement(By.xpath(""))
	}
}
