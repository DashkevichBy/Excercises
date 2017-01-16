
public class EqualTitle {
	
	public static boolean assertEquals(String actualTitle, String expectedTitle) {

		if (actualTitle.equals(expectedTitle)) {
			
			System.out.println("Titles are equal");
			
			return true;
			
		} else {
			System.out.println("Title are not correct");
			
			return false;
		}

	}
}
