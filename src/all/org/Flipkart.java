package all.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\prem\\eclipse-workspace\\Selinei\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.paytmbank.com/business-banking/nodal-account");
	WebElement fi = driver.findElement(By.xpath("//h2[text()='Powerful Dashboard']"));
	String text = fi.getText();
	System.out.println(text);
	WebElement element = driver.findElement(By.xpath("//div[text()='Download Account statements']"));
	String text2 = element.getText();
	System.out.println(text2);
	
}
}
