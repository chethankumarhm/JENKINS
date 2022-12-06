package testDataSample;

import java.util.concurrent.TimeUnit;

import org.automation.base.Base_Test;
import org.automation.element_repository.Tricentis_MotorCycle_Page;
import org.automation.generic_utilities.ReadTestData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tricentis_SearchBox_TestScript extends Base_Test{


@Test
public void searchbox() throws InterruptedException {
	String text="Motorcycle";

	Tricentis_MotorCycle_Page page=new Tricentis_MotorCycle_Page(driver);
	page.searchbox(text);
	page.search_icon().click();
}
}
