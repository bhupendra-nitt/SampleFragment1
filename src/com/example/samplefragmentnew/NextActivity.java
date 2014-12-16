package com.example.samplefragmentnew;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class NextActivity extends FragmentActivity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.next_layout);
		
		Intent intent=getIntent();
		int index = intent.getIntExtra("index",0);
		Fragment2 f2 = (Fragment2) getFragmentManager().findFragmentById(R.id.frag2);
		if(f2!=null){
		f2.ChangeData(index);
		}
		
	}
}
