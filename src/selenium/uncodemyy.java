package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class uncodemyy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://uncodemy.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		WebElement cat = driver.findElement(By.xpath("//span[@id=\"categoriesBtn\"]"));
		a.moveToElement(cat).perform();
		Thread.sleep(2000);
		WebElement soft = driver.findElement(By.xpath("//*[@id=\"categories-menu\"]/menuitem/menu/menuitem[3]/a"));
		a.moveToElement(soft).perform();

	}

}
