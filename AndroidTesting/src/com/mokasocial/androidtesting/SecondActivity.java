package com.mokasocial.androidtesting;

import android.app.Activity;
import android.os.Bundle;

/**
 * @author Koa Metter <koa@mokasocial.com>
 * @since July 8, 2011 {@link} http://mokasocial.com
 */

public class SecondActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_two);
	}
}