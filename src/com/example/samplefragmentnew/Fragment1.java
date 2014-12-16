package com.example.samplefragmentnew;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Fragment1 extends Fragment implements OnItemClickListener{
	ListView listview;
	Comuunicator commmunicator;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.fragment1_layout, container, false);
		listview = (ListView)view.findViewById(R.id.listView1);
		ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(), R.array.list_array, android.R.layout.simple_list_item_1);
		listview.setAdapter(adapter);
		listview.setOnItemClickListener(this);
		return view;
	}
	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
commmunicator.respond(position);
	}
	
	public void setCommmunicator(Comuunicator commmunicator) {
		this.commmunicator = commmunicator;
	}
	
	
	public interface Comuunicator{
		
		public void respond(int index);		
			
		
	}
	
	
	
}
