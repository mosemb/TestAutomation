package selinium;

// This is a testNg class. 
import org.testng.annotations.Test;



import org.testng.annotations.BeforeMethod;
import java.sql.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.WebElement;
import java.util.*;


// This is a testNg class

public class NewTest {
	WebDriver driver;
  @BeforeMethod
  public void beforeMethod() {
	System.setProperty("webdriver.chrome.driver","/home/mose/chromedriver_linux64/chromedriver");
	driver = new ChromeDriver();
  }
  
  @Test
  public void f() {
	  driver.get("https://testautomation.co/webelements/");
	  List <WebElement> browserRadio = driver.findElements(By.name("browser"));
	  browserRadio.get(1).click(); // We are storing all the buttons in a list, button number 2 is
	  // What we need, in the list its stored in position 1 counting from zero. 
	  for(WebElement radio:browserRadio) {
		  System.out.println(radio.getAttribute("value"));
		  
		  if(radio.getAttribute("value").equals("ie")) {
			  radio.click();
		  }
		  
	  }
  }

  @AfterMethod
  public void afterMethod() {
	  //driver.quit(); 
  }

}
