package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestMySelinium {
	
	public static void main(String []args) {
		System.setProperty("webdriver.chrome.driver","/home/mose/chromedriver_linux64/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https:www.chrome.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement searchElement = driver.findElement(By.xpath("//input[@title='Search' and @type='text']"));
		searchElement.sendKeys("TestAutomation.co");
		WebElement searchBtnElement = driver.findElement(By.name("btnK"));
		searchBtnElement.submit();
		
		driver.quit();
		
		
	}

}
