package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class bhadra2 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("i phone 15 pro");
		search.submit();
		WebElement image=driver.findElement(By.className("s-image"));
		image.click();
		WebElement Back =driver.findElement(By.id("nav-logo-sprites"));
		Back.click();
		
	}

}
