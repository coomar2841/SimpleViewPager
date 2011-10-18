package com.beanie.samples.viewpager;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

public class ListView1Page extends LinearLayout {

	public ListView1Page(Context context, AttributeSet attrs) {
		super(context, attrs);
		init();
	}

	public ListView1Page(Context context) {
		super(context);
		init();
	}

	private void init() {
		setBackgroundColor(Color.GREEN);
		
		ListView listView = new ListView(getContext());
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(),
				android.R.layout.simple_list_item_1);
		adapter.add("ListView 1 Item 1");
		adapter.add("ListView 1 Item 2");
		adapter.add("ListView 1 Item 3");
		adapter.add("ListView 1 Item 4");
		adapter.add("ListView 1 Item 5");
		adapter.add("ListView 1 Item 6");

		listView.setAdapter(adapter);
		
		LayoutParams params = new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT);
		addView(listView, params);
	}

}
