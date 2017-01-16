import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TutByTest {

	static enum Browsers {
		FireFox, Chrome
	}

	public static void main(String[] args) throws InterruptedException {

		Browsers browser = Browsers.FireFox;

		switch (browser) {
		case FireFox:
			
			WebDriver driver;
			
			System.setProperty("webdriver.gecko.driver", "./src/Recources/geckodriver.exe");

			driver = new FirefoxDriver();

			driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);

			TestFlow.testFlowSteps(driver);

			browser = Browsers.Chrome;
			//comment just to check push

		case Chrome:

			System.setProperty("webdriver.chrome.driver", "./src/Recources/chromedriver.exe");

			driver = new ChromeDriver();

			driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);

			TestFlow.testFlowSteps(driver);
			
			break;
		}

	}

}
