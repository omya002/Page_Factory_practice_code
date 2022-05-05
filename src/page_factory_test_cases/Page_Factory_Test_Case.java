package page_factory_test_cases;

import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import page_factory_demo.Details_Of_Passenger;
import page_factory_demo.List_Of_Flights;
import page_factory_demo.Welcome_BlazeDemo_Page;

public class Page_Factory_Test_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Selenium\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		System.out.println("Browser Open...!");
		driver.manage().window().maximize();
		driver.get("https://blazedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Welcome_BlazeDemo_Page welcomepage = PageFactory.initElements(driver, Welcome_BlazeDemo_Page.class);
		System.out.println("Welcome...!");

		List_Of_Flights listofflights = PageFactory.initElements(driver, List_Of_Flights.class);
		System.out.println("List...!");

		Details_Of_Passenger passengerDetails = PageFactory.initElements(driver, Details_Of_Passenger.class);
		System.out.println("Details...!");

		welcomepage.Welcome_Page();
		listofflights.Flight_List();
		passengerDetails.details("test", "India", "Surat", "Gujrat", "789456", "4111111111111111", "04", "2028", "CardName");

		driver.quit();
		System.out.println("Browser Close...!");

	}

}
