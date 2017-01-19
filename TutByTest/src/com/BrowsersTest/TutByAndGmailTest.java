package com.BrowsersTest;

public class TutByAndGmailTest {
	
	static final int WAITING = 10;

	public static void main(String[] args) throws InterruptedException {

		BaseTest allTest = new BaseTest();

		allTest.runBaseTest(Browsers.FireFox);

		allTest.runBaseTest(Browsers.Chrome);

	}

}
