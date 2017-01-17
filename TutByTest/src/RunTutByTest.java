import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunTutByTest {

	BrowsersList.Browsers browser = BrowsersList.Browsers.FireFox;

	public void runTutByTest(WebDriver driver) throws InterruptedException {

		switch (browser) {

		case FireFox:

			System.setProperty("webdriver.gecko.driver", "./src/Recources/geckodriver.exe");

			driver = new FirefoxDriver();

			driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);

			TestFlowTutBy.testFlowSteps(driver);

			browser = BrowsersList.Browsers.Chrome;

		case Chrome:

			System.setProperty("webdriver.chrome.driver", "./src/Recources/chromedriver.exe");

			driver = new ChromeDriver();

			driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);

			TestFlowTutBy.testFlowSteps(driver);

			break;
		}

	}
}
