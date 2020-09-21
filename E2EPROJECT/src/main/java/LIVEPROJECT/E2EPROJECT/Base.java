package LIVEPROJECT.E2EPROJECT;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class Base {
	public WebDriver driver;
	public Properties pro;
	public WebDriver intilizebrowser() throws IOException  
	{
		 pro=new Properties();
		FileInputStream fips=new FileInputStream("E:\\selenium\\workspace\\E2EPROJECT\\output\\data.properties");
		pro.load(fips);
		String bro=pro.getProperty("browser");
		System.out.println(bro);
		if(bro.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","E:\\selenium\\selenium softwares\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		else if(bro.equals("firefox"))
		{
			//firefox
		}
		else if(bro.equals("internetexplor"))
		{
			//internetexplore
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	
		
	}
	public  String getscreenshot(String filepath, WebDriver driver2) throws IOException
	{
		TakesScreenshot ts=((TakesScreenshot)driver2);
		File souce=ts.getScreenshotAs(OutputType.FILE);
		String destinationfile=System.getProperty("user.dir")+"\\reports\\"+filepath+".png";
	FileUtils.copyFile(souce,new File(destinationfile) );
	return destinationfile;
	}
	


}
