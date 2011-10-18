package com.beanie.samples.viewpager;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

public class ListView2Page extends LinearLayout {

	public ListView2Page(Context context, AttributeSet attrs) {
		super(context, attrs);
		init();
	}

	public ListView2Page(Context context) {
		super(context);
		init();
	}

	private void init() {
		setBackgroundColor(Color.CYAN);
		ListView listView = new ListView(getContext());
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(),
				android.R.layout.simple_list_item_1);
		adapter.add("ListView 2 Item 1");
		adapter.add("ListView 2 Item 2");
		adapter.add("ListView 2 Item 3");
		adapter.add("ListView 2 Item 4");
		adapter.add("ListView 2 Item 5");
		adapter.add("ListView 2 Item 6");

		listView.setAdapter(adapter);
		
		LayoutParams params = new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT);
		addView(listView, params);
	}

}
