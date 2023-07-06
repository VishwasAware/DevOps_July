package WebApp_July;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OHLoginJuly {
  @Test
  public void VerifyTitle() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
	  String Title = driver.getTitle();
	  System.out.println("Title is:- "+Title);
	  Thread.sleep(2000);
	  driver.close();
	  
  }
}
