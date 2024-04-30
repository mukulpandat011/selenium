package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pyrops {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		Actions a = new Actions(driver);
		driver.get("https://test.pyrops.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement p1 = driver.findElement(By.xpath("//input[@name=\"txtUserId\"]"));
		p1.sendKeys("admin");
		WebElement p2 = driver.findElement(By.xpath("//input[@name=\"txtPassword\"]"));
		p2.sendKeys("A0m!n2024");
		WebElement p3 = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
		p3.click();
//		WebElement p4 = driver.findElement(By.xpath("//select[@name=\"ddlLocationCode\"]"));
//		p4.click();
		WebElement p5 = driver.findElement(By.xpath("//select[@name=\"ddlLocationCode\"]"));
		p5.sendKeys("PM01");
		WebElement p6 = driver.findElement(By.xpath("//input[@type=\"button\"]"));
		p6.click();
		Thread.sleep(2000);
		WebElement p7 = driver.findElement(By.xpath("/html/body/form/section/aside/nav/ul/li[5]/a/span[1]"));
		a.moveToElement(p7).click().perform();
		Thread.sleep(1000);
		WebElement p8 = driver.findElement(By.xpath("//span[normalize-space()='Other Masters']"));
		a.moveToElement(p8).click().perform();
		Thread.sleep(1000);
		WebElement p9 = driver.findElement(By.xpath("//span[normalize-space()='Country']"));
        p9.click();
       
        
        
        
        
//        driver.quit();

	}

}
