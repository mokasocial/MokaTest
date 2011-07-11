package com.mokasocial.unittestingexample;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.TextView;

import com.mokasocial.androidtesting.MainActivity;

// Extend ActivityInstrumentationTestCase2, parameterized for your Activity like so

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

	// There will necessarily be more fields here for your testing purposes:
	private MainActivity mActivity;
	private TextView mView;
	private String resourceString;

	public MainActivityTest() {
		// Create
		super("com.mokasocial.androidtesting", MainActivity.class);

	}

	@Override
	public void setUp() throws Exception {
		super.setUp();
		mActivity = this.getActivity();
		mView = (Button) mActivity.findViewById(com.mokasocial.androidtesting.R.id.tap_this);
		resourceString = mActivity.getString(com.mokasocial.androidtesting.R.string.hello);
	}

	public void testPreconditions() {
		assertNotNull(mView);
	}

	public void testThisAlwaysFails() {
		assertTrue(false);
	}

	public void testThisAlwaysPasses() {
		assertTrue(true);
	}
}