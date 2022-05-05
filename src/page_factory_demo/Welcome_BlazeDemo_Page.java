package page_factory_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Welcome_BlazeDemo_Page {

	WebDriver driver;

	public Welcome_BlazeDemo_Page(WebDriver driver) {
		this.driver=driver;
	}

	@FindBy(name = "fromPort")
	WebElement departure_city;	

	@FindBy (name = "toPort")
	WebElement destination_city;

	@FindBy (css = "input[type='submit']")
	WebElement find_flights_button;

	public void Welcome_Page() {
		departure_city.click();
		Select todropdown1 = new Select(departure_city);
		todropdown1.selectByValue("Portland");

		destination_city.click();
		Select todropdown2 = new Select(destination_city);
		todropdown2.selectByValue("Dublin");

		find_flights_button.click();
	}

}
