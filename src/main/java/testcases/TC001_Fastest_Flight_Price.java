package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.SearchPage;
import pages.SearchResultPage;
import projectBase.ProjectSpecificMethods;

public class TC001_Fastest_Flight_Price extends ProjectSpecificMethods{
	@BeforeTest
	public void setData() {
		excelFileName = "Places";

	}

	@Test(dataProvider = "fetchData")
	public void fastestFlightPrice(String fromcity, String tocity) {
	try {
		

			new SearchPage().searchdata(fromcity, tocity);
			Thread.sleep(5000);
			new SearchResultPage().searchResultsPage();
		
	} catch (Exception e) {
		
		e.printStackTrace();
	}
}
}
