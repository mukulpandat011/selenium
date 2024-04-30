package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Firstcry {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions a = new Actions(driver);
		driver.get("https://firstcrystore.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement f1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[1]/div[3]/ul/a[1]/li/span"));
		f1.click();
		Thread.sleep(2000);
		WebElement f2 = driver.findElement(By.xpath("//a[@href=\"#/signup\"]"));
		f2.click();
		WebElement f3 = driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
		f3.sendKeys("Mukul");
		WebElement f4 = driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
		f4.sendKeys("pandat");
		WebElement f5 = driver.findElement(By.xpath("//input[@name=\"email\"]"));
		f5.sendKeys("pandatmukul104@gmail.com");
		WebElement f6 = driver.findElement(By.xpath("//input[@name=\"password\"]"));
		f6.sendKeys("Mukul0011");
		WebElement f7 = driver.findElement(By.xpath("//input[@name=\"confirmpassword\"]"));
		f7.sendKeys("Mukul0011");
		Thread.sleep(2000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File ds = new File("D:\\screenshot\\output.png");
		FileUtils.copyFile(src,ds);
		System.out.println("screenshot is captured");
		WebElement f8 = driver.findElement(By.xpath("//button[@class=\"submit-btn\"]"));
		a.moveToElement(f8).click().perform();
		Thread.sleep(2000);
//		Alert A = driver.switchTo().alert();
//		System.out.println(A.getText());
		
		
		
		
		
		
		
		
		
//		A.accept();
		
		
		
		
		
		

	}

}
