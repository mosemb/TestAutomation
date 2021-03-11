package selinium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class ElementById {
	WebDriver driver;
 
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver","/home/mose/chromedriver_linux64/chromedriver");
	  driver = new ChromeDriver();
	  
  }
  
  @Test
  public void testById() {
	  driver.get("https://testautomation.co/webelements/");
	  WebElement namElement = driver.findElement(By.id("legalname"));
	  namElement.sendKeys("John"); // We are trying to enter data into the form input field.
	  namElement.clear();
	  namElement.sendKeys("John Doe");
	  System.out.println(namElement.isSelected());
	  System.out.println(namElement.isDisplayed());
	  System.out.println(namElement.isEnabled());
  }
  
  

  @AfterMethod
  public void afterMethod() {
  }

}
