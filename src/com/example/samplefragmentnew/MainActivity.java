package com.example.samplefragmentnew;

import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends FragmentActivity implements Fragment1.Comuunicator {

	Fragment1 f1;
	Fragment2 f2;
	FragmentManager manager;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		manager=getFragmentManager();
		f1=(Fragment1) manager.findFragmentById(R.id.frag1);
		f1.setCommmunicator(this);
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

	@Override
	public void respond(int index) {
		f2 = (Fragment2) manager.findFragmentById(R.id.frag2); 		
		
		if(f2!=null&&f2.isVisible()){
			f2.ChangeData(index);
			
		}
		else{
			
			Intent intent = new Intent(this, NextActivity.class);
			intent.putExtra("index", index);
			startActivity(intent);
		}
	}
}
