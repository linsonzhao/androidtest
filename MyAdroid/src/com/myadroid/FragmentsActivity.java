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
//		 Intent(android.content.Intent. ACTION_DIAL);
		 startActivity(i);
		 }

	public void onClickShowMap(View view) {
		 Intent i = new
		 Intent(android.content.Intent. ACTION_VIEW,
		 Uri. parse("geo:-33.877365, 150.897663"));
		 startActivity(i);
		 }
	
	public void onClickLaunchMyBrowser(View view){
//		Intent i = new Intent("com.myadroid.MyBrowserActivity");
		Intent i = new Intent(this, com.myadroid.MainActivity.class);
		i.setData(Uri.parse("http://www.amazon.com"));
		startActivity(i);
	}
}
