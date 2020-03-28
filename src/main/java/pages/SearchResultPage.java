package pages;

import org.testng.Assert;

import projectBase.ProjectSpecificMethods;

public class SearchResultPage extends ProjectSpecificMethods {
	public SearchResultPage searchResultsPage() throws InterruptedException {
		String currency=null;
		String price=null;
		System.out.println(currency + price);
		Thread.sleep(1000);
		try {
		currency = driver.findElementByXPath("//span[text()='Fastest']//parent::a//esky-price//span[1]").getText();
		price = driver.findElementByXPath("//span[text()='Fastest']//parent::a//esky-price//span[3]").getText();}
		catch(Exception e){
			System.out.println(currency + price);
			e.printStackTrace();
			
		}
		finally {
		
		if((currency!=null) && (price !=null)) {
			System.out.println("The Fastest Flight price is: "+ currency + price);
			Assert.assertTrue(true);
		}
		else {Assert.assertFalse(true);}}
		
		return this;
	}
}
