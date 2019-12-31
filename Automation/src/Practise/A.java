package Practise;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void openBrowser()
	{
	//String browser="Chrome";
		System.setProperty("webdriver.chrome.driver","D:\\Drivers/ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://secure.letterhub.com/signin");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			}
	@Test
	public void testLogin()
	{
		    driver.findElement(By.name("txtSignInEmail")).sendKeys("ramyachiluka5@gmail.com");
			driver.findElement(By.name("txtSignInPwd")).sendKeys("Abcdef@123");
			driver.findElement(By.xpath("//button[text()='Sign In']")).click();
	}
   @AfterTest
	public  void method2()
	{
	driver.findElement(By.xpath("//span[text()='Jobs']")).click();
	}


}

