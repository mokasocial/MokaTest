package com.mokasocial.androidtesting;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * A simple class that shows/hides a TextView on button tap. Used for
 * demonstrating various Android test cases.
 * 
 * @author Koa Metter <koa@mokasocial.com>
 * @since July 8, 2011 {@link} http://mokasocial.com
 */

public class AndroidTestingActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		// Let's get our button...
		Button button = (Button) findViewById(R.id.tap_this);

		// ...and our onClick event...
		button.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// Let's get our hidden view...
				TextView show_hide = (TextView) findViewById(R.id.show_hide_this);

				// If our view is hidden, show it, otherwise hide it!
				if (show_hide.getVisibility() == TextView.VISIBLE)
					show_hide.setVisibility(TextView.GONE);
				else
					show_hide.setVisibility(TextView.VISIBLE);
			}
		});
	}
}