package com.mokasocial.androidtesting;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * @author Koa Metter <koa@mokasocial.com>
 * @since July 8, 2011 {@link} http://mokasocial.com
 */

public class MainActivity extends Activity {

	private Context mContext;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {

		mContext = this;

		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		// Let's initialize our buttons...
		final Button button = (Button) findViewById(R.id.tap_this);
		final Button hidden_btn = (Button) findViewById(R.id.show_hide_this);

		// Our onClick event for our main button...
		button.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				// If our view is hidden, show it, otherwise hide it!
				if (hidden_btn.getVisibility() == Button.VISIBLE)
					hidden_btn.setVisibility(Button.GONE);
				else
					hidden_btn.setVisibility(Button.VISIBLE);
			}
		});

		// ... and our onClick event for our hidden button.
		hidden_btn.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(mContext, SecondActivity.class));
			}
		});
	}
}