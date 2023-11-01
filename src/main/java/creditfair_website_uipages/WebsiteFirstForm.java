package creditfair_website_uipages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import creditfair_website_locator.WebsiteFirstFormLocator;

public class WebsiteFirstForm extends WebsiteFirstFormLocator {
	WebDriver driver;
	
	public void WebsiteFirstForm (WebDriver driver) {
		this.driver = driver;

	}
	
	public void addFisrpage(WebDriver driver,WebElement applicationname,WebElement applicationpan,WebElement applicationaddhar,
			WebElement applicationemail,WebElement applicationmobile,WebElement purposeselect,List<WebElement> purposelist,WebElement selectmerchantlist,WebElement passmercahntname,
			WebElement clickmerchant,WebElement selectcenter,WebElement passcentername,WebElement clickcenter,WebElement productname,WebElement uniqueid,WebElement durationyear,
			WebElement durationmonth,WebElement loanamount,WebElement emiselect,List<WebElement> tenure,WebElement langaugeselect,List<WebElement> langaugelist,WebElement hereaboutselect,
			List<WebElement> hereaboutlist)
	{
		applicationname.sendKeys("pratik");
		applicationpan.sendKeys("ddhpf2322d");
		applicationaddhar.sendKeys("1234567891");
		applicationemail.sendKeys("pratik+52@creditfair.in");
		applicationmobile.sendKeys("5215215215");
		purposeselect.click();
		purposelist.get(4).click();
		selectmerchantlist.click();
		passmercahntname.sendKeys("prati");
		clickmerchant.click();
		selectcenter.click();
		passcentername.sendKeys("mumb");
		clickcenter.click();
		productname.sendKeys("test");
		uniqueid.sendKeys("1234");
		durationyear.sendKeys("1");
		durationmonth.sendKeys("2");
		loanamount.sendKeys("50000");
		emiselect.click();
		tenure.get(1).click();
		langaugeselect.click();
		langaugelist.get(1).click();
		hereaboutselect.click();
		hereaboutlist.get(2).click();
		}
}
