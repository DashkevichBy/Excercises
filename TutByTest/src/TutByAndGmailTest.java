
public class TutByAndGmailTest {

	public static void main(String[] args) throws InterruptedException {

		RunGmailTest gTest = new RunGmailTest();
		RunTutByTest tTest = new RunTutByTest();

		gTest.runGmailTest();
		tTest.runTutByTest();
	}

}
