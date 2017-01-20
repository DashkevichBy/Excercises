package EbayDrop;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void performDragAndDrop(Actions builder, WebElement dragElement, WebElement dropElement) {

				
	    builder.dragAndDrop(dragElement, dropElement).perform();
		
	}
}
