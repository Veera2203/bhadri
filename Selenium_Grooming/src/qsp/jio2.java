package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jio2 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
	    WebElement usn=driver.findElement(By.id("email"));
	    usn.sendKeys("veera");
	    Thread.sleep(2000);
	    WebElement psw=driver.findElement(By.id("pass"));
	    psw.sendKeys("veeras@13");
	    Thread.sleep(2000);
	    WebElement login=driver.findElement(By.name("login"));
		login.click();
	    
	}

}
