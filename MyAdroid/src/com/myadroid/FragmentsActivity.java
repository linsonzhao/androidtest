package com.myadroid;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Display;
import android.view.WindowManager;

public class FragmentsActivity extends Activity{
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		
		FragmentManager fragmentManager = getFragmentManager();
		FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
		
		WindowManager vm = getWindowManager();
		Display d = vm.getDefaultDisplay();
		int orientation = getResources().getConfiguration().orientation;
		switch(orientation){
		case Configuration.ORIENTATION_LANDSCAPE:
			break;
		case Configuration.ORIENTATION_PORTRAIT:
			break;
		}
	}

}
