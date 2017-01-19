package EbayDrop;

public class StatusChecking {

	public static void checkStatus(String inputStatus) {

		if (inputStatus.equals("Dropped!")) {
			
			System.out.println("The droppable status has been successfully changed to \"Dropped!\" ");
			
		} else {
			
			System.out.println("Something went wrong!");
			
		}
	}
}
