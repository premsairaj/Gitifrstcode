package LIVEPROJECT.E2EPROJECT;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import junit.framework.Assert;
import pageobject.Homepage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Gettext extends Base {
	public static Logger log= LogManager.getLogger(Gettext.class.getName());
public WebDriver driver;
	@BeforeTest
public void intil() throws IOException
{
	driver=intilizebrowser() ;
    driver.get(pro.getProperty("url"));
}
@Test
public void  navigatepage() throws IOException  {
	
        
        Homepage hp=new Homepage(driver);
        hp.textpre().getText();
       // Assert.assertEquals("FEATURED COURSES", hp.textpre().getText());
        Assert.assertFalse(hp.navbr().isDisplayed());
        log.info("navigation is displaying ");
        
	}
@AfterTest
public void testsend()
{
	driver.close();
	log.info("browser is closed");
}
}
