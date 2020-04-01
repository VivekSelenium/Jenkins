package pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import projectBase.ProjectSpecificMethods;

public class SearchPage extends ProjectSpecificMethods {
	public SearchResultPage searchdata(String fromCity, String toCity) {
		
		driver.findElementByXPath("//a[@id='cookie-info-close']").click();
		driver.findElementById("TripTypeOneway").click();
        WebElement fromcity = driver.findElementById("departureOneway");
		fromcity.sendKeys(fromCity);
		List<WebElement> autosuggdrop = driver.findElementsByXPath("//div[@class='autocomplete-holder dropdown wrapper autocomplete-flights qa-departureOneway']//ul//li");
		autosuggdrop.get(0).click();
		fromcity.sendKeys(Keys.TAB);
		WebElement tocity = driver.findElementById("arrivalOneway");
		tocity.sendKeys(toCity);
		List<WebElement> autosugto = driver.findElementsByXPath("//div[@class='autocomplete-holder dropdown wrapper autocomplete-flights qa-arrivalOneway']//ul//li");
		autosugto.get(0).click();
		tocity.sendKeys(Keys.TAB);
		WebElement calender = driver.findElementByXPath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[4]/a");
	    calender.click();
		driver.findElementByXPath("//div[@class='wrap pax-widget custom-dropdown  ']").click();
		driver.findElementByXPath("//a[@class='plus']").click();
		driver.findElementByXPath("//button[@class='btn transaction qsf-search']").click();
		return new SearchResultPage();
	}

}
