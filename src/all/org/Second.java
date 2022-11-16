package all.org;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Second {
	public static void main(String[] args) throws IOException  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prem\\eclipse-workspace\\Selinei\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chennaimetrowater.tn.gov.in/");
		Actions a= new Actions(driver);
		WebElement about = driver.findElement(By.xpath("//a[text()=' ABOUT Us']"));
		a.moveToElement(about).perform();
		WebElement organis= driver.findElement(By.xpath("//a[text()='Organisation Chart']"));
		a.click(organis).perform();
		TakesScreenshot b=(TakesScreenshot)driver;
		File screenshotAs = b.getScreenshotAs(OutputType.FILE);
		System.out.println(screenshotAs);
		FileUtils.copyFile(screenshotAs, new File("D:\\organisation chart.jpg"));

	
	}
}
