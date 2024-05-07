package qsp;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class veeru
{
	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Takescreenshot ts=(Takescreenshot)driver;
		Object outputTypeFILE = null;
		File temp=ts.getScreenshotAs(outputTypeFILE);
		File per=new File("C://Users//HP//Desktop//Defect//Defect1.jpeg");
	    FileHandler.copy(temp,per);
	}

}
