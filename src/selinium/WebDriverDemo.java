package selinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDemo {
	
	public static void main(String []args) {
		
		System.setProperty("webdriver.chrome.driver","/home/mose/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		// From the api there are very many already implimented methods for the webdriver object
		driver.get("https://www.google.com");
		String titleString = driver.getTitle();
		System.out.println(titleString); // Gives us the title of the website. 
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource()); // This returns the page source for the page. (Html, css, js)
		driver.quit(); // This finishes the whole session. 
		
		
	
		
	}

}
