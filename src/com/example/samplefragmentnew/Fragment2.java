package com.example.samplefragmentnew;

import android.app.Fragment;
import android.os.Bundle;
import android.util.EventLogTags.Description;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment2 extends Fragment {
	
	TextView textview;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		
		View view =  inflater.inflate(R.layout.fragment2_layout, container, false);
		textview = (TextView) view.findViewById(R.id.textView1);
		
		return view;
	}
	
	public void ChangeData(int position){
		
String[] details = getResources().getStringArray(R.array.detail_array);	
textview.setText(details[position]);
	}
}
