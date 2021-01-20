package YDF.automation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class NewTest {
  @SuppressWarnings("unused")
@Test
  public void f() throws Exception {
	  WebDriver driver = new FirefoxDriver();
	  driver.get("https://www.yourdigitalfile.com/");
	  Thread.sleep(20000);
	  driver.findElement(By.xpath(("//*[@id=\"menu_login_bt\"]"))).click();
	  WebDriverWait wait= new WebDriverWait(driver,20);
	  WebElement element =wait.until(ExpectedConditions.elementToBeClickable(By.name("username")));
	  element.sendKeys("mail2satabdi@gmail.com");
	  WebElement password=driver.findElement(By.name("password"));
	  password.sendKeys("Test12345678");
	  WebElement login=driver.findElement(By.id("loginButton"));
	  login.click();
//	  Set <String> set1=driver.getWindowHandles();
//	  Iterator <String> win1=set1.iterator();
//	  String parent=win1.next();
//	  String child=win1.next();
//	  driver.switchTo().window(child);
	 WebElement Cross= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"closeOverlay\"]")));
	//  WebElement Cross = driver.findElement(By.id("overlay"));
	 Cross.click();
	 Thread.sleep(2000);
	 WebElement Logout=driver.findElement(By.cssSelector("#user_menu > ul:nth-child(1) > li:nth-child(2) > a:nth-child(1)"));
	 Logout.click();
	  // Switching to Alert        
     Alert alert = driver.switchTo().alert();		
     		
     // Capturing alert message.    
     String alertMessage= driver.switchTo().alert().getText();		
     		
     // Displaying alert message		
     System.out.println(alertMessage);	
     Thread.sleep(5000);
     		
     // Accepting alert		
     alert.accept();		
	  
  }
}
