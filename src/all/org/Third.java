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

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class Third {
	public static void main(String[] args) throws IOException  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prem\\eclipse-workspace\\Selinei\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chennaimetrowater.tn.gov.in/");
		Actions a= new Actions(driver);
		WebElement contact = driver.findElement(By.xpath("//a[text()='Contact Us']"));
		a.moveToElement(contact).perform();
		WebElement feedback = driver.findElement(By.xpath("//a[text()='Feedback']"));
		a.click(feedback).perform();;
		TakesScreenshot s=(TakesScreenshot)driver;
		File screenshotAs = s.getScreenshotAs(OutputType.FILE);
		System.out.println(screenshotAs);
		FileUtils.copyFile(screenshotAs, new File("D:\\feedback.jpg"));
//		AShot s= new AShot();
//		s.takeScreenshot(driver, feedback);
		
		
	}
}
