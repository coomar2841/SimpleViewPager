package com.beanie.samples.viewpager;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;

public class ButtonPage extends LinearLayout {

	public ButtonPage(Context context, AttributeSet attrs) {
		super(context, attrs);
		init();
	}

	public ButtonPage(Context context) {
		super(context);
		init();
	}

	private void init() {
		setBackgroundColor(Color.RED);
		Button button = new Button(getContext());
		button.setText("4th Page");

		setGravity(Gravity.CENTER);

		LayoutParams params = new LayoutParams(LayoutParams.WRAP_CONTENT,
				LayoutParams.WRAP_CONTENT);
		addView(button, params);
	}

}
