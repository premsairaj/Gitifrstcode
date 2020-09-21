package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
	public WebDriver driver;
	By sign= By.xpath("//i[@class='fa fa-lock fa-lg']");
	By textsurface=By.xpath("//div[@class='text-center']//h2");
 By navibar=By.cssSelector(".navbar-collapse.collapse");
	public Homepage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	  this.driver=driver2;
	  
	}
public LOgin login()
  {
	   driver.findElement(sign).click();
	   LOgin lg=new LOgin(driver);
    return lg;
  }
public WebElement textpre()
  {
	  return driver.findElement(textsurface);
  }
public WebElement navbr()
{
	  return driver.findElement(navibar);
}
}