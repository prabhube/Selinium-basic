package org.login;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotKey {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\prem\\eclipse-workspace\\Selineium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	driver.manage().window().maximize();

	Robot r=new Robot();
	WebElement findElement = driver.findElement(By.id("email"));
	findElement.click();
	
	r.keyPress(KeyEvent.VK_SHIFT);
	r.keyPress(KeyEvent.VK_R);;
	r.keyRelease(KeyEvent.VK_R);
	r.keyPress(KeyEvent.VK_S);
	r.keyRelease(KeyEvent.VK_S);
	r.keyPress(KeyEvent.VK_A);
	r.keyRelease(KeyEvent.VK_A);
	r.keyRelease(KeyEvent.VK_SHIFT);
	WebElement findElement2 = driver.findElement(By.id("pass"));
	findElement2.click();
	r.keyPress(KeyEvent.VK_SHIFT);
	r.keyPress(KeyEvent.VK_P);;
	r.keyRelease(KeyEvent.VK_P);
	r.keyPress(KeyEvent.VK_R);
	r.keyRelease(KeyEvent.VK_R);
	r.keyPress(KeyEvent.VK_E);
	r.keyRelease(KeyEvent.VK_E);
	r.keyRelease(KeyEvent.VK_SHIFT);
}
}
