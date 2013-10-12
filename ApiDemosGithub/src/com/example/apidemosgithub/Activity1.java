package com.example.apidemosgithub;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity1 extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		TextView hello_tv = (TextView) findViewById(R.id.hello_tv);
		hello_tv.setText("Activity1");
	}
}
