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

public class child
{
      WebDriver driver = new ChromeDriver();
      void navigate()
      {
    	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    	  
      }
      void logIn() throws InterruptedException, IOException
      {
        WebElement we1 = driver.findElement(By.xpath("//input[@name='username']"));
  		we1.sendKeys("Admin");
  		WebElement we2 = driver.findElement(By.xpath("//input[@name='password']"));
  		we2.sendKeys("admin123");
  		
  		TakesScreenshot scrShot = (TakesScreenshot)driver;
		   Thread.sleep(2000);
		   File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		   File DestFile=new File("D:\\screenshot\\output3.png");
		   Thread.sleep(2000);
		   FileUtils.copyFile(SrcFile, DestFile);
		   System.out.println("ScreenShot is Captured");
	   
		WebElement we3 = driver.findElement(By.xpath("//button[@type='submit']"));
		we3.click();
		Thread.sleep(2000);
		
		TakesScreenshot ss = (TakesScreenshot)driver;
		   Thread.sleep(2000);
		   File SrcFile1=ss.getScreenshotAs(OutputType.FILE);
		   File DestFile1=new File("D:\\screenshot\\output4.png");
		  Thread.sleep(2000);
		   FileUtils.copyFile(SrcFile1, DestFile1);
		   System.out.println("ScreenShot is Captured");
      }
      
     void buzz() throws InterruptedException, IOException
     {
       WebElement we4 = driver.findElement(By.xpath("//a[@href='/web/index.php/buzz/viewBuzz']"));
 		we4.click();
 		Thread.sleep(5000);
 		WebElement we5 = driver.findElement(By.xpath("//textarea[@placeholder=\"What's on your mind?\"]"));
 	    we5.sendKeys("Hello Everyone");
 	    Thread.sleep(1000);
 	   TakesScreenshot scrShot = (TakesScreenshot)driver;
	   Thread.sleep(2000);
	   File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	   File DestFile=new File("D:\\screenshot\\output5.png");
	   Thread.sleep(2000);
	   FileUtils.copyFile(SrcFile, DestFile);
	   System.out.println("ScreenShot is Captured");
   
 		WebElement we6 = driver.findElement(By.xpath("//button[@type='submit']"));
 		we6.click();
 		
 		TakesScreenshot ss1 = (TakesScreenshot)driver;
		   Thread.sleep(2000);
		   File Src=ss1.getScreenshotAs(OutputType.FILE);
		   File Dest=new File("D:\\screenshot\\output6.png");
		   Thread.sleep(2000);
		   FileUtils.copyFile(Src, Dest);
		   System.out.println("ScreenShot is Captured");
	   
     }
   
	

}
