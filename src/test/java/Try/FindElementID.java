package Try;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindElementID {
  
 
  	ChromeDriver driver;
  	
  	
  	@BeforeTest 
  	public void openURL() {
  		
  		String ChromePath=System.getProperty("user.dir")+"\\Resourcs\\chromedriver.exe";
  		
  		System.setProperty("webdriver.chrome.driver", ChromePath);
  	 //  WebDriverManager.chromeDriver().setup();
  		
  	     driver=new ChromeDriver();
  		
  		driver.navigate().to("https://www.facebook.com/");
  		
  	}
  	
  	@Test
  	public void loginFacebookFindElementById() {

  		WebElement username= driver.findElement(By.id("email"));
  		WebElement password=driver.findElement(By.id("pass"));
  		
  		System.out.println(username.getTagName());
  		System.out.println(password.getTagName());
  		
  		
  	}
  	
  	/*@AfterTest
  	public void closeDriver() {
  		
  		driver.quit();
  	}
  	*/

  }


