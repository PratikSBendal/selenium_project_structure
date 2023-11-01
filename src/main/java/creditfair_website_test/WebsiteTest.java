package creditfair_website_test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import creditfair_website_locator.WebsiteFirstFormLocator;
import creditfair_website_uipages.WebsiteFirstForm;


public class WebsiteTest extends WebsiteHelper{
@Test
	public void testRun()
	{
		try
		{
			WebsiteFirstForm fistappform = PageFactory.initElements(driver, WebsiteFirstForm.class);
			WebsiteFirstFormLocator firstformlocator = PageFactory.initElements(driver,WebsiteFirstFormLocator.class);
			fistappform.addFisrpage(driver,firstformlocator.appliationName(),firstformlocator.applicationPan(),firstformlocator.applicationAddhar(),firstformlocator.applicationEmail(),
					firstformlocator.applicationMobile(),firstformlocator.purposeSelect(),firstformlocator.purposeList(),firstformlocator.selectmerchantList(),firstformlocator.passmercahntName(),
					firstformlocator.clickMerchant(),firstformlocator.selectCenter(),firstformlocator.passcenterName(),firstformlocator.clickCenter(),firstformlocator.productName(),firstformlocator.uniqueId(),
					firstformlocator.durationYear(),firstformlocator.durationMonth(),firstformlocator.loanAmount(),firstformlocator.emiSelect(),firstformlocator.Tenure(),firstformlocator.langaugeSelect(),firstformlocator.hereaboutList(),
					firstformlocator.hereaboutSelect(),firstformlocator.hereaboutList());
			
		}
		catch (Exception e)
		{
			
		}
		
	}
	
}
