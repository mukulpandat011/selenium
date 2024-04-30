package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement un = driver.findElement(By.xpath("//input[@name=\"email\"]"));	
		un.sendKeys("pandatmukul1041@gmail.com");
		WebElement ps = driver.findElement(By.xpath("//input[@type='password']"));
		ps.sendKeys("123456789");
		WebElement fp = driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]"));
		action.moveToElement(fp).click().perform();
		Thread.sleep(2000);

	}

}
