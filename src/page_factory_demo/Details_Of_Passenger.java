package page_factory_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Details_Of_Passenger {

	WebDriver driver;

	public Details_Of_Passenger(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(id = "inputName")
	WebElement name;

	@FindBy(id = "address")
	WebElement address;

	@FindBy(id = "city")
	WebElement city;

	@FindBy(id = "state")
	WebElement state;

	@FindBy(id = "zipCode")
	WebElement zip;

	@FindBy(id = "cardType")
	WebElement cardtype;

	@FindBy(id = "creditCardNumber")
	WebElement cardno;

	@FindBy(id = "creditCardMonth")
	WebElement cardmonth;

	@FindBy(id = "creditCardYear")
	WebElement cardyear;

	@FindBy(id = "nameOnCard")
	WebElement namecard;

	@FindBy(xpath = "(//input[@type='submit'])")
	WebElement purchesflightbutton;


	public void details(String uName, String uAddress, String uCity, String uState, String uZip, String uCardNo, String uCardMonth, String uCardYear, String uNameOnCard) {
		name.sendKeys(uName);
		address.sendKeys(uAddress);
		city.sendKeys(uCity);
		state.sendKeys(uState);
		zip.sendKeys(uZip);

		cardtype.click();
		Select carddropdown1 = new Select(cardtype);
		carddropdown1.selectByValue("dinersclub");

		cardno.sendKeys(uCardNo);
		cardmonth.sendKeys(uCardMonth);
		cardyear.sendKeys(uCardYear);
		namecard.sendKeys(uNameOnCard);
		purchesflightbutton.click();

	}
}
