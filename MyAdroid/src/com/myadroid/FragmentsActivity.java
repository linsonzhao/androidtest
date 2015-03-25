package com.myadroid;

import com.fragments.Fragment1;
import com.fragments.Fragment2;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class FragmentsActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.main);

		// FragmentManager fragmentManager = getFragmentManager();
		// FragmentTransaction fragmentTransaction =
		// fragmentManager.beginTransaction();

		// WindowManager vm = getWindowManager();
		// Display d = vm.getDefaultDisplay();

		// detect current window is landscape or portrait.
		// int orientation = getResources().getConfiguration().orientation;
		// switch(orientation){
		// case Configuration.ORIENTATION_LANDSCAPE:
		// Fragment1 fragment1 = new Fragment1();
		// fragmentTransaction.replace(android.R.id.content, fragment1);
		// break;
		// case Configuration.ORIENTATION_PORTRAIT:
		// Fragment2 fragment2 = new Fragment2();
		// fragmentTransaction.replace(android.R.id.content, fragment2);
		// break;
		// }
		// fragmentTransaction.commit();
	}

	public void onClickWebBrowser(View view) {
		 Intent i = new
		 Intent(android.content.Intent. ACTION_VIEW,
		 Uri. parse("http://www.amazon.com"));
		 startActivity(i);
		 }

	public void onClickMakeCalls(View view) {
		 Intent i = new
		 Intent(android.content.Intent. ACTION_DIAL,
		 Uri. parse("tel:+651234567"));
		 startActivity(i);
		 }

	public void onClickShowMap(View view) {
		 Intent i = new
		 Intent(android.content.Intent. ACTION_VIEW,
		 Uri. parse("geo:37.827500,-122.481670"));
		 startActivity(i);
		 }
}
