package com.fernferret.hellogallery;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Gallery;
import android.widget.Toast;

public class HelloGallery extends Activity {
	
	Toast mToast;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		Gallery g = (Gallery) findViewById(R.id.gallery);
		g.setAdapter(new ImageAdapter(this));
		
		g.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView parent, View v, int position, long id) {
				Toast.makeText(HelloGallery.this, "" + position, Toast.LENGTH_SHORT).show();
			}
		});
		g.setCallbackDuringFling(false);
		g.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
				if(mToast != null) {
					mToast.cancel();
				}
				mToast = Toast.makeText(HelloGallery.this, "You are now viewing image " + (position + 1), Toast.LENGTH_SHORT);
				mToast.show();
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
	}
}