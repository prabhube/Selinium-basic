package org.login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prem\\eclipse-workspace\\Selinei\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://cosmocode.io/automation-practice-webtable/");
	WebElement table = driver.findElement(By.tagName("table"));
	WebElement heading = table.findElement(By.tagName("tbody"));
	List<WebElement> rows = heading.findElements(By.tagName("tr"));
	for(int j=0;j<rows.size();j++)
	{
		WebElement row = rows.get(j);
	
	List<WebElement> headingElements = row.findElements(By.tagName("td"));
	for(int i=0;i<headingElements.size();i++)
	{
		WebElement webElement = headingElements.get(i);
		String text = webElement.getText();
		System.out.println(text);
	}
	}
	//WebElement content = table.findElement(By.tagName("tbody"));
	}
}
