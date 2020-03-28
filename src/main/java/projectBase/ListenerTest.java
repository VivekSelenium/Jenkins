package projectBase;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext ;		
import org.testng.ITestListener ;		
import org.testng.ITestResult ;		

public class ListenerTest extends ProjectSpecificMethods implements ITestListener						
{		

    @Override		
    public void onFinish(ITestContext arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onStart(ITestContext arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onTestFailure(ITestResult arg0) {					
    	File src = (File)((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File target= new File("C:\\Users\\Yaazhisai\\Documents\\ScreenShot\\Success.jpeg");
		try {
			FileUtils.copyFile(src, target);
		} catch (IOException e) {
			
			e.printStackTrace();
		}						
        		
    }		

    @Override		
    public void onTestSkipped(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onTestStart(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onTestSuccess(ITestResult arg0) {					
    	File src = (File)((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File target= new File("C:\\Users\\Yaazhisai\\Documents\\ScreenShot\\Fail.jpeg");
		try {
			FileUtils.copyFile(src, target);
		} catch (IOException e) {
			
			e.printStackTrace();
		}				
        		
    }		
}
