package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dummy2 
{
	public static void main(String[] args)
	{
    System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
    ChromeDriver driver=new ChromeDriver();
    driver.get("file:///C:/Users/HP/Documents/Dummy.html");
    WebElement un=driver.findElement(By.id("veera"));
    un.sendKeys("abcd");
    
    
		
    

    
    
    
    
    
    
    
    
    
	}

}
