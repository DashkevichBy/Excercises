package EbayDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class TestFlowDrop {

	public static void testFlowSteps(WebDriver driver) {

		driver.get("http://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0); 
		
		Actions builder = new Actions(driver);

		WebElement dragElement = driver.findElement(By.id("draggable"));
		
		WebElement dropElement = driver.findElement(By.id("droppable"));
		
		DragAndDrop.performDragAndDrop(builder, dragElement, dropElement);
		
		StatusChecking.checkStatus(driver.findElement(By.id("droppable")).getText());
		
		driver.close();

	}

}
