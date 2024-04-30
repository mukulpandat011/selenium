package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class OrangeHRM2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
//		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement xyz = driver.findElement(By.xpath("//input[@name=\"username\"]"));
		xyz.sendKeys("Admin");
		WebElement abc = driver.findElement(By.xpath("//input[@name=\"password\"]"));
		abc.sendKeys("admin123");
		WebElement efg = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		efg.click();
		Thread.sleep(2000);
		
		WebElement hi = driver.findElement(By.xpath("//a[@href='/web/index.php/buzz/viewBuzz']"));
		hi.click();
		WebElement hlo = driver.findElement(By.xpath("//textarea[@class=\"oxd-buzz-post-input\"]"));
		hlo.sendKeys("hello");
//		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		driver.quit();	
	}

}
