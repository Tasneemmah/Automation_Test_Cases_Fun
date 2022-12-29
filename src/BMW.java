import java.util.List;

import javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.beust.jcommander.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.netty.handler.codec.http.HttpContentEncoder.Result;

public class BMW {
	public WebDriver driver;

	SoftAssert softassertProcess = new SoftAssert();

	@BeforeTest
	public void this_is_before_test() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	}

	@Test()

	public void check_if_all_results_contains_the_world_bmw() {
		driver.findElement(By.name("q")).sendKeys(PassParameters.theitem + Keys.ENTER);
		List<WebElement> bmwFirstResults = driver.findElements(By.tagName("h3"));

		for (int i = 0; i < bmwFirstResults.size(); i++) {
			String result = bmwFirstResults.get(i).getText();

			System.out.println(result);
		}
	}

	@Test()
	public void search_the_item_in_image() {
		driver.get("https://images.google.com/");

		PassParameters.make_the_item_name_in_upper();

		driver.findElement(By.name("q")).sendKeys(PassParameters.theitem);
	}
}