/**
 * This example is based on Android Activities
 * 
 * Which Covers 
 * 		-Activity Life Cycle (lifecycle callbacks)
 * 
 * for more info visit the google android developer site 
 * http://developer.android.com/guide/components/activities.html#Lifecycle
 * 
 **/

package edu.a45.android.lifecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MLifeCycleActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// Set the activity content from a layout resource.
		setContentView(R.layout.main);
		Log.i("Life Cycle A:: onCreate ", "The activity is being created.");

		Button btnNext = (Button) findViewById(R.id.btn_next);
		btnNext.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MLifeCycleActivity.this,
						TestActivityB.class);
				startActivity(intent);
			}
		});
	}

	@Override
	protected void onStart() {
		super.onStart();
		Log.i("Life Cycle A:: onStart ",
				"The activity is about to become visible.");
	}

	@Override
	protected void onResume() {
		super.onResume();
		Log.i("Life Cycle A:: onResume ",
				"The activity has become visible (it is now 'resumed').");
	}

	@Override
	protected void onPause() {
		super.onPause();
		Log.i("Life Cycle A:: onPause ", "Another activity is taking focus "
				+ "(this activity is about to be 'paused').");
	}

	@Override
	protected void onStop() {
		super.onStop();
		Log.i("Life Cycle A:: onStop ",
				"The activity is no longer visible (it is now 'stopped').");
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.i("Life Cycle A:: onDestroy ",
				"The activity is about to be destroyed.");
	}

}
