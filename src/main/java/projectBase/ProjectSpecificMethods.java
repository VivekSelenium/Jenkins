package projectBase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import utils.ReadExcel;

public class ProjectSpecificMethods {
	public String excelFileName;
	public static ChromeDriver driver;
	public static String PartyID;
	public static ExtentHtmlReporter reporter;
	public static ExtentReports extent;
	public static ExtentTest test, node;
	
	public String testcaseName, testcaseDec, author, category;
	
	
	@Parameters({"url"})
	@BeforeMethod
	public void startApp(String url) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver1.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	@AfterMethod(/*alwaysRun=true*/)
	public void closeApp() {
		driver.close();

	}
	@DataProvider(name = "fetchData")
	public Object[][] getData() throws IOException {
		return ReadExcel.readExcelData(excelFileName);

	}


}





