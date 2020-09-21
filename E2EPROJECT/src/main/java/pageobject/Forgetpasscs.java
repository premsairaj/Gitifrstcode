package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Forgetpasscs {
	public WebDriver driver;

	 public Forgetpasscs(WebDriver driver2) {
			// TODO Auto-generated constructor stub
		  this.driver=driver2;
}
	By send_me_inst=By.name("commit");

	public void  sendinstr() {
		// TODO Auto-generated method stub
		driver.findElement(send_me_inst).click();
	}

}
