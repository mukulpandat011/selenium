package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Uncodemy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://uncodemy.com/");
		driver.manage().window().maximize();
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		WebElement abc = driver.findElement(By.xpath("//span[@class=\"mainc Mane\"]"));
		a.moveToElement(abc).perform();
		Thread.sleep(2000);
		WebElement xyz = driver.findElement(By.xpath("//*[@id=\"categories-menu\"]/menuitem/menu/menuitem[3]/a"));
		a.moveToElement(xyz).perform();
		
		
	
		

	}

}
