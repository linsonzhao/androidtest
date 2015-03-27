package com.myactionbar;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// *****************************************//
		// requestWindowFeature must be called before setContentView();
		// requestWindowFeature(Window.FEATURE_NO_TITLE);

		// set android:theme="@android:style/Theme.Holo.NoActionBar"
		// in AndroidManifest.xml has the same result.
		// But it will cause getActionBar
		// ********************************************//

		setContentView(R.layout.main);

		ActionBar actionBar = getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		// actionBar.hide();

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		// getMenuInflater().inflate(R.menu.main, menu);

		CreateMenu(menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		// int id = item.getItemId();
		// if (id == R.id.action_settings) {
		// return true;
		// }
		// return super.onOptionsItemSelected(item);

		return MenuChoice(item);
	}

	private void CreateMenu(Menu menu) {
		MenuItem mnu1 = menu.add(0, 0, 0, "Refresh");
		{
			// mnu1.setIcon(R.drawable.ic_launcher);
			mnu1.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
		}
		MenuItem mnu2 = menu.add(0, 1, 1, "Upload");
		{
			// mnu2.setIcon(R.drawable.ic_launcher);
			mnu2.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
		}
		MenuItem mnu3 = menu.add(0, 2, 2, "Track");
		{
			// mnu3.setIcon(R.drawable.ic_launcher);
			mnu3.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
		}
		MenuItem mnu4 = menu.add(0, 3, 3, "Detect");
		{
			mnu4.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
		}
		// MenuItem mnu5 = menu.add(0, 4, 4, "Item 5");
		// {
		// mnu5.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
		// }
	}

	private boolean MenuChoice(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			Toast.makeText(this, "you clicked on application icon",
					Toast.LENGTH_SHORT).show();
			Intent i = new Intent(this, MainActivity.class);
			/**
			 * The Intent.FLAG_ACTIVITY_CLEAR_TOP flag ensures that the series of
			 * activities in the back stack is cleared when the user clicks the
			 * application icon on the Action Bar. This way, if the user clicks
			 * the back button, the other activities in the application do not
			 * appear again.
			 */
			i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
			startActivity(i);
			return true;
		case 0:
			Toast.makeText(this, "You clicked on Item 1", Toast.LENGTH_SHORT)
					.show();
			return true;
		case 1:
			Toast.makeText(this, "You clicked on Item 2", Toast.LENGTH_SHORT)
					.show();
			return true;
		case 2:
			Toast.makeText(this, "You clicked on Item 3", Toast.LENGTH_SHORT)
					.show();
			return true;
		case 3:
			Toast.makeText(this, "You clicked on Item 4", Toast.LENGTH_SHORT)
					.show();
			return true;
		case 4:
			Toast.makeText(this, "You clicked on Item 5", Toast.LENGTH_SHORT)
					.show();
			return true;
		}
		return false;
	}
}
