package selenium;

import java.io.IOException;

public class parent {
	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		child c = new child();
		c.navigate();
		Thread.sleep(2000);
		c.logIn();
		Thread.sleep(2000);
		c.buzz();

	
		
	}
	
}
	


