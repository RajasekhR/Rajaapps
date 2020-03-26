package Rajaapps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Raja {
	public WebDriver driver;
	  @Test
	  public void f() {
		  
		  driver.findElement(By.name("username")).sendKeys("admin");
		  driver.findElement(By.name("password")).sendKeys("admin");
		  driver.findElement(By.name("submit")).click();
		  
		  driver.findElement(By.linkText("Registration")).click();
		  
		  driver.findElement(By.name("image")).sendKeys("C:\\Users\\Bgars\\Desktop\\baby#.jpg");	  
		  
		  driver.findElement(By.name("image")).click();
		  
		  
		  
		  
	  }
	  @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.gecko.driver", "C:\\Testing tools\\Testing software\\geckodriver.exe");
		  driver= new FirefoxDriver();
		  driver.get("http://www.computechis.com/DemoSite/");
		
	  }

	  @AfterTest
	  public void afterTest() {
	  }

	}
