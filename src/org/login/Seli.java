package org.login;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seli {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prem\\eclipse-workspace\\Selinei\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
//		WebElement findElement = driver.findElement(By.className("_14Me7y"));
//		Thread.sleep(3000);
//		findElement.click();
		WebElement findElement2 = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		findElement2.sendKeys("9790288099");
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("9790288099");
		WebElement login = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		login.click();
		WebElement findElement3 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		findElement3.click();
		WebElement findElement4 = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		findElement4.click();
		WebElement findElement5 = driver.findElement(By.name("q"));
		findElement5.sendKeys("samsung m52");
		WebElement submit = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		submit.click();
		Thread.sleep(3000);
		WebElement phone = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[2]"));
		phone.click();
		
		String parent = driver.getWindowHandle();
		Set<String> allId = driver.getWindowHandles();
		for(String string : allId) {
			if(!parent.equals(string)) {
				driver.switchTo().window(string);
				WebElement addToCart = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
				addToCart.click();
			}
		}
	
		
		
	}
}
