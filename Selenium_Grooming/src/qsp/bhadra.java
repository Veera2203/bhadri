package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class bhadra {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.flipkart.com/");
Thread.sleep(2000);
WebElement searchbox =driver.findElement(By.name("q"));
searchbox.sendKeys("i phone 15 pro");
searchbox.submit();
WebElement image=driver.findElement(By.className("MIXNux"));
image.click();



	}

}
