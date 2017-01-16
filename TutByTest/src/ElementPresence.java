import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementPresence {

	public static boolean isElementPresent(WebDriver driver, By by) {
		try {
			driver.findElement(by);
			
		} catch (NoSuchElementException e) {
			System.out.println("There is no such element");
			return false;

		}
		System.out.println("The element is present");
		return true;
	}
}
