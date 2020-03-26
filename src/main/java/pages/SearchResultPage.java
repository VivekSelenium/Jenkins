package pages;

import projectBase.ProjectSpecificMethods;

public class SearchResultPage extends ProjectSpecificMethods {
	public SearchResultPage searchResultsPage() throws InterruptedException {
		Thread.sleep(10000);
		String currency = driver.findElementByXPath("//span[text()='Fastest']//parent::a//esky-price//span[1]").getText();
		String price = driver.findElementByXPath("//span[text()='Fastest']//parent::a//esky-price//span[3]").getText();
		System.out.println("The Fastest Flight price is: "+ currency + price);
		return this;
	}

}
