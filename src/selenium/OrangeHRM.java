package selenium;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class OrangeHRM {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement we1 = driver.findElement(By.xpath("//input[@name='username']"));
		we1.sendKeys("Admin");
		WebElement we2 = driver.findElement(By.xpath("//input[@name='password']"));
		we2.sendKeys("admin123");
		Thread.sleep(4000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File ds = new File("D:\\screenshot\\output1.png");
		FileUtils.copyFile(src,ds);
		System.out.println("screenshot is captured");
		WebElement we3 = driver.findElement(By.xpath("//button[@type='submit']"));
        we3.click();
        Thread.sleep(3000);
        TakesScreenshot ts1 = (TakesScreenshot) driver;
		File src1 = ts.getScreenshotAs(OutputType.FILE);
		File ds1 = new File("D:\\screenshot\\output2.png");
		FileUtils.copyFile(src1,ds1);
		System.out.println("screenshot is captured");
        WebElement we5 = driver.findElement(By.xpath("//a[@href=\"/web/index.php/buzz/viewBuzz\"]"));
        we5.click();
        Thread.sleep(2000);
        WebElement we6 = driver.findElement(By.xpath("//textarea[@class=\"oxd-buzz-post-input\"]"));
        we6.sendKeys("hello");
        WebElement we7 = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        we7.click();
       
        
        
        
        
      
	}

}
