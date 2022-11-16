package org.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Worldcup {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prem\\eclipse-workspace\\Selinei\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/cricket-series/3961/icc-mens-t20-world-cup-2022/points-table");
		
		WebElement icc = driver.findElement(By.xpath("(//h3[text()='ICC Mens T20 World Cup 2022 - Points Table'])[4]"));
		WebElement table = driver.findElement(By.xpath("(//table[contains(@class,'table cb-srs-pnts')])[18]"));
		List<WebElement> header = table.findElements(By.tagName("thead"));
		for(int k=0;k<header.size();k++) {
			WebElement tite = header.get(k);
			String headin = tite.getText();
			System.out.println(headin);
		}
		WebElement heading = table.findElement(By.tagName("tbody"));
		List<WebElement> rows = heading.findElements(By.tagName("tr"));
		for(int j=0;j<rows.size();j++)
		{
			WebElement row = rows.get(j);
		String head = row.getText();
		System.out.print(head+" ");
		}
	}
}
