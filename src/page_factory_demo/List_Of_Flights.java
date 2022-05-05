package page_factory_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class List_Of_Flights {
	
	WebDriver driver;
	public List_Of_Flights(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy (xpath = "((//input[@type='submit'])[3])")
	WebElement choose_this_flight_button;
	
	public void Flight_List() {
		choose_this_flight_button.click();
	}

}
