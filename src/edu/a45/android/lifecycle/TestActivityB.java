package edu.a45.android.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class TestActivityB extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// Set the activity content from a layout resource.
		setContentView(R.layout.activityb);
		Log.e("Life Cycle B:: onCreate ", "The activity is being created.");
	}

	@Override
	protected void onStart() {
		super.onStart();
		Log.e("Life Cycle B:: onStart ",
				"The activity is about to become visible.");
	}

	@Override
	protected void onResume() {
		super.onResume();
		Log.e("Life Cycle B:: onResume ",
				"The activity has become visible (it is now 'resumed').");
	}

	@Override
	protected void onPause() {
		super.onPause();
		Log.e("Life Cycle B:: onPause ", "Another activity is taking focus "
				+ "(this activity is about to be 'paused').");
	}

	@Override
	protected void onStop() {
		super.onStop();
		Log.e("Life Cycle B:: onStop ",
				"The activity is no longer visible (it is now 'stopped').");
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.e("Life Cycle B:: onDestroy ",
				"The activity is about to be destroyed.");
	}
}
