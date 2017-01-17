
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TutByAndGmailTest {

	public static void main(String[] args) throws InterruptedException {

		RunGmailTest gTest = new RunGmailTest();
		RunTutByTest tTest = new RunTutByTest();
		
		System.setProperty("webdriver.gecko.driver", "./src/Recources/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		gTest.runGmailTest(driver);

		tTest.runTutByTest(driver);

	}

}
