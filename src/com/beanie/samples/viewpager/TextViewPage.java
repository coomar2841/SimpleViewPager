package com.beanie.samples.viewpager;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TextViewPage extends LinearLayout {

	public TextViewPage(Context context, AttributeSet attrs) {
		super(context, attrs);
		init();
	}

	public TextViewPage(Context context) {
		super(context);
		init();
	}

	private void init() {
		setBackgroundColor(Color.MAGENTA);
		TextView textView = new TextView(getContext());
		textView.setText("2nd Page");
		
		setGravity(Gravity.CENTER);

		LayoutParams params = new LayoutParams(LayoutParams.WRAP_CONTENT,
				LayoutParams.WRAP_CONTENT);
		addView(textView, params);
	}

}
