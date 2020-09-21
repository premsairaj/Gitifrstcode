package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LOgin {
	public WebDriver driver;

	 public LOgin(WebDriver driver2) {
			// TODO Auto-generated constructor stub
		  this.driver=driver2;
}
	 By email=By.name("email");
	 By password=By.name(" password");
	 By loginclick=By.name("commit");
	 By forgetpassword=By.cssSelector(".link-below-button");
	 public WebElement email()
	 {
		 return driver.findElement(email);
	 }
	 public WebElement pswd()
	 {
		 return driver.findElement(password);
	 }
	 public WebElement login()
	 {
		 
				
	return  driver.findElement(loginclick);
	 }
	 public Forgetpasscs foregetpass()
	 {
		 driver.findElement(forgetpassword).click();;
		 Forgetpasscs fp=new Forgetpasscs(driver);
		 return fp;
		 
	 }
	 
	 
 }
