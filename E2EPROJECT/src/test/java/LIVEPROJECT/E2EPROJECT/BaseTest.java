package LIVEPROJECT.E2EPROJECT;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobject.Forgetpasscs;
import pageobject.Homepage;
import pageobject.LOgin;

public class BaseTest extends Base {
	private static org.apache.logging.log4j.Logger log=org.apache.logging.log4j.LogManager.getLogger(BaseTest.class.getName());
	
	public WebDriver driver;
	@BeforeTest
public void inti() throws IOException
{
	 driver=intilizebrowser() ;
	 log.info("driver is succefully invoked");
     driver.get("http://www.qaclickacademy.com/");
}
@Test(dataProvider="getdata")
public void  checklogin(String username,String password,String text) throws IOException {
	
	 driver.get("http://www.qaclickacademy.com/");
        Homepage hp=new Homepage(driver);
       LOgin lo =hp.login();
    
        lo.email().sendKeys(username);
        lo.pswd().sendKeys(password);
        System.out.println(text);
        lo.login().click();
        log.error("just for error message it is not a error in the test case");
        log.fatal("just for fatal message it is not a error in the test case");	
        Forgetpasscs fps =lo.foregetpass();
        lo.email().sendKeys("just fix it");
        fps.sendinstr();
}
@DataProvider
public Object[][] getdata()
{
	Object[][] data=new Object[2][3];
	//restricted data
	data[0][0]="premsairobo@gmail.com";
	data[0][1]="7386029083p";
	data[0][2]="restricted";
	//non restricted data
	data[1][0]="sairobo@gmail.com";
	data[1][1]="73860083p";
	data[1][2]="Nonrestricted";
	return data;
}
@AfterTest
public void testend()
{
	driver.close();//prem
}

}
