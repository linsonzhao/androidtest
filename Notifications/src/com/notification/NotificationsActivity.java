package com.notification;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;

public class NotificationsActivity extends Activity{
	
	int notificationID = 1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.main);
		
	}
	
	public void onClick(View view){
		displayNotification();
	}
	
	public void displayNotification(){
		//pending Intent to launch this activity if the user select this notification.
		Intent i = new Intent(this, com.notification.NotificationView.class);
		i.putExtra("notificationID", notificationID);
		
		PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, i, 0);
		
		NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
		
		NotificationCompat.Builder builder = new NotificationCompat.Builder(getBaseContext());
		Notification notification = null;
	    CharSequence from = "System alarm";
	    CharSequence message = "Meeting with customer at 3pm.";

		    builder.setContentIntent(pendingIntent)
		    .setSmallIcon(R.drawable.ic_launcher)
		    .setWhen(System.currentTimeMillis())
		    .setContentTitle(from)
		    .setTicker(message)
		    .setContentText("Reminder: meeting starts in 5 minutes.");
		    notification = builder.build();
		    notification.flags = Notification.DEFAULT_LIGHTS | Notification.FLAG_AUTO_CANCEL;
 
		    notification.vibrate = new long[]{100, 250, 100, 500};
		    nm.notify(notificationID, notification);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
