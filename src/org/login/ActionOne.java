package org.login;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionOne {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prem\\eclipse-workspace\\Selinei\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/");
		WebElement course = driver.findElement(By.xpath("//a[text()='COURSES']"));
	//	course.click();
		Actions a=new Actions(driver);
		a.moveToElement(course).perform();
		WebElement oracle = driver.findElement(By.xpath("//span[text()='Oracle Training']"));
		a.moveToElement(oracle).perform();
		a.click(oracle).perform();
		
		driver.navigate().to("https://demo.guru99.com/test/drag_drop.html");
		WebElement source = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement target = driver.findElement(By.xpath("//li[@class='placeholder']"));
		a.dragAndDrop(source, target).perform();
		WebElement source1 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement target1 = driver.findElement(By.xpath("(//ol[@align='center'])[2]"));
		a.clickAndHold(source1).moveToElement(target1).release().perform();
		
		WebElement source2 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement target2 = driver.findElement(By.xpath("//ol[@id='loan']"));
		a.clickAndHold(source2).moveToElement(target2).release().perform();
		WebElement source3 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement target3 = driver.findElement(By.id("amt8"));
		a.dragAndDrop(source3, target3).perform();
	}
}
