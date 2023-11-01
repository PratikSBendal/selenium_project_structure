package creditfair_website_locator;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WebsiteFirstFormLocator {
	WebDriver driver;

	@FindBy(how = How.XPATH, using = "//*[@id=\"creditfairForm\"]/div[2]/div[2]/div/input")
	@CacheLookup
	WebElement applicationname;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"creditfairForm\"]/div[2]/div[3]/div/input")
	@CacheLookup
	WebElement applicationpan;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"creditfairForm\"]/div[2]/div[4]/div/input")
	@CacheLookup
	WebElement applicationaddhar;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"creditfairForm\"]/div[3]/div[2]/div/input")
	@CacheLookup
	WebElement applicationemail;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"mobile_number\"]")
	@CacheLookup
	WebElement applicationmobile;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"creditfairForm\"]/div[4]/div[2]/div/span")
	@CacheLookup
	WebElement purposeselect;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"select2-purpose-results\"]/li")
	@CacheLookup
	List<WebElement> purposelist;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"creditfairForm\"]/div[4]/div[3]/div/span")
	@CacheLookup
	WebElement selectmerchantlist;
	
	@FindBy(how = How.XPATH, using = "/html/body/span/span/span[1]/input")
	@CacheLookup
	WebElement passmercahntname;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"select2-src_merchant_name-results\"]")
	@CacheLookup
	WebElement clickmerchant;
	
	@FindBy (how = How.ID, using = "select2-src_merchant_center_name-container")
	@CacheLookup
	WebElement selectcenter;
	
	@FindBy (how = How.XPATH, using ="/html/body/span/span/span[1]/input")
	@CacheLookup
	WebElement passcentername;
	
	@FindBy (how = How.XPATH, using ="/html/body/span/span/span[2]")
	@CacheLookup
	WebElement clickcenter;
	
	@FindBy (how = How.ID, using ="product_name")
	@CacheLookup
	WebElement productname;
	
	@FindBy (how = How.ID, using = "unique_id_number")
	@CacheLookup
	WebElement uniqueid;
	
	@FindBy (how = How.ID, using = "durationyear")
	@CacheLookup
	WebElement durationyear;
	
	@FindBy (how = How.ID, using = "durationmonth")
	@CacheLookup
	WebElement durationmonth;
	
	@FindBy (how = How.NAME, using = "loanamount")
	@CacheLookup
	WebElement loanamount;
	
	@FindBy (how = How.XPATH, using = "/*[@id=\"creditfairForm\"]/div[7]/div[2]/div/div[2]/input")
	@CacheLookup
	WebElement emiselect;
	
	@FindBy (how = How.XPATH, using ="/html/body/main/div/section[1]/form/div[7]/div[2]/div/div[2]/ul/li")
	@CacheLookup
	List<WebElement> tenure;
	
	
	@FindBy (how = How.XPATH, using = "//*[@id=\"creditfairForm\"]/div[9]/div[1]/div/div[2]/input")
	@CacheLookup
	WebElement langaugeselect;
	
	@FindBy (how = How.XPATH, using = "/html/body/main/div/section[1]/form/div[9]/div[1]/div/div[2]/ul/li")
	@CacheLookup
	List<WebElement> langaugelist;
	
	@FindBy (how = How.XPATH, using = "//*[@id=\"creditfairForm\"]/div[9]/div[2]/div/div[2]/input")
	@CacheLookup
	WebElement hereaboutselect;
	
	@FindBy (how = How.XPATH, using = "/html/body/main/div/section[1]/form/div[9]/div[2]/div/div[2]/ul/li")
	@CacheLookup
	List<WebElement> hereaboutlist;

	public WebElement appliationName() {
		return  applicationname;
	}
	
	public WebElement applicationPan() {
		return  applicationpan;
	}
	
	public WebElement applicationAddhar() {
		return  applicationaddhar;
	}
	
	public WebElement applicationEmail() {
		return  applicationemail;
	}
	
	public WebElement applicationMobile() {
		return  applicationmobile;
	}
	
	public WebElement purposeSelect() {
		return  purposeselect;
	}
	
	public List<WebElement> purposeList() {
		return  purposelist;
	}
	
	
	public WebElement selectmerchantList() {
		return  selectmerchantlist;
	}
	
	public WebElement passmercahntName() {
		return  passmercahntname;
	}
	
	public WebElement clickMerchant() {
		return  clickmerchant;
	}
	
	public WebElement selectCenter() {
		return  selectcenter;
	}
	
	public WebElement passcenterName() {
		return  passcentername;
	}
	
	public WebElement clickCenter() {
		return  clickcenter;
	}
	
	public WebElement productName() {
		return  productname;
	}
	
	public WebElement uniqueId() {
		return  uniqueid;
	}
	
	public WebElement durationYear() {
		return  durationyear;
	}
	
	public WebElement durationMonth() {
		return  durationmonth;
	}
	
	public WebElement loanAmount() {
		return  loanamount;
	}
	
	public WebElement emiSelect() {
		return  emiselect;
	}
	
	public List<WebElement> Tenure() {
		return  tenure;
	}
	
	public WebElement langaugeSelect() {
		return  langaugeselect;
	}
	
	public WebElement hereaboutSelect() {
		return  hereaboutselect;
	}
	
	public List<WebElement> hereaboutList() {
		return  hereaboutlist;
	}
}
