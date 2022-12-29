import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google {
	public WebDriver driver;

	SoftAssert softassertProcess = new SoftAssert();

	@BeforeTest
	public void this_is_before_test() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
	}

	@Test
	public void TestTitle() {
		String ActualTitle = driver.getTitle();

		System.out.println(ActualTitle);

		softassertProcess.assertEquals(ActualTitle, PassParameters.theitem);

		softassertProcess.assertAll();

	}
}