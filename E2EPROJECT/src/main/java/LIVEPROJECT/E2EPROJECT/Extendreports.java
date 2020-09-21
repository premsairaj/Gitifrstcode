package LIVEPROJECT.E2EPROJECT;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class Extendreports {
	static ExtentReports extent;
	public static  ExtentReports getreportObject()
	{

	String path = System.getProperty("user.dir") + "\\report\\index.html";
	ExtentSparkReporter reports = new ExtentSparkReporter(path);
	reports.config().setReportName("extentreportone");
	reports.config().setDocumentTitle("PREM SAI ROBO");
	extent = new ExtentReports();
	extent.attachReporter(reports);
	extent.setSystemInfo("Test", "PREm");
return extent;
	
}
}
