package selinium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class ElementByXpath {
 
  WebDriver Driver = null;
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","/home/mose/chromedriver_linux64/chromedriver");
	  Driver = new ChromeDriver();  
	  
  }
  
  @Test
  public void testByXpath() {
	  Driver.get("https://testautomation.co/webelements/");
	  Driver.findElement(By.xpath("//*[@id=\"formsubmit\"]/table/tbody/tr[8]/td[1]/input")).click();
  }

  @AfterMethod
  public void afterMethod() {
  }

}
