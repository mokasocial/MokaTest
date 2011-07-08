package com.mokasocial.robotiumtest;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.Smoke;

import com.jayway.android.robotium.solo.Solo;
import com.mokasocial.androidtesting.MainActivity;

/**
 * @author Koa Metter <koa@mokasocial.com>
 * @since July 8, 2011 {@link} http://mokasocial.com
 */

public class AndroidRobotiumTest extends
		ActivityInstrumentationTestCase2<MainActivity> {

	private Solo solo;

	public AndroidRobotiumTest() {
		super("com.mokasocial.androidtesting", MainActivity.class);

	}

	public void setUp() throws Exception {
		solo = new Solo(getInstrumentation(), getActivity());
	}

	@Smoke
	public void testClickFirstButton() throws Exception {
		// Click our first button!
		solo.clickOnButton("Tap This!");

		boolean expected = true;
		boolean actual = solo.searchButton("Hidden Button!", true);

		// Assert that our hidden button is no longer hidden
		assertEquals("Our hidden button is still hidden!", expected, actual);
	}

	@Smoke
	public void testClickHiddenButton() throws Exception {
		// Click our first button!
		solo.clickOnButton("Tap This!");

		// Assert that our hidden button is no longer hidden.
		solo.searchButton("Hidden Button!", true);

		// Click our hidden button!
		solo.clickOnButton("Hidden Button!");

		// Assert that we arrived at our second activity.
		solo.assertCurrentActivity("Expected SecondActivity activity",
				"SecondActivity");

	}

	@Override
	public void tearDown() throws Exception {
		try {
			// Robotium will finish all the activities that have been opened
			solo.finalize();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		getActivity().finish();
		super.tearDown();
	}
}