package com.beanie.samples.viewpager;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SimpleViewPagerforAndroidActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
		MyPagerAdapter adapter = new MyPagerAdapter(this);
		viewPager.setAdapter(adapter);

		final TextView tvHeader = (TextView) findViewById(R.id.textViewHeader);
		tvHeader.setText("Page 1");

		viewPager.setOnPageChangeListener(new OnPageChangeListener() {

			@Override
			public void onPageSelected(int page) {
				tvHeader.setText("Page " + (page + 1));
			}

			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onPageScrollStateChanged(int arg0) {

			}
		});

	}

	private class MyPagerAdapter extends PagerAdapter {

		private ArrayList<LinearLayout> views;

		public MyPagerAdapter(Context context) {
			views = new ArrayList<LinearLayout>();
			views.add(new ListView1Page(context));
			views.add(new TextViewPage(context));
			views.add(new ListView2Page(context));
			views.add(new ButtonPage(context));
		}

		@Override
		public void destroyItem(View collection, int arg1, Object object) {
			((ViewPager) collection).removeView((LinearLayout) object);
		}

		@Override
		public void finishUpdate(View arg0) {

		}

		@Override
		public int getCount() {
			return views.size();
		}

		@Override
		public Object instantiateItem(View collection, int position) {
			View view = views.get(position);
			((ViewPager) collection).addView(view);
			return view;
		}

		@Override
		public boolean isViewFromObject(View view, Object object) {
			return view == object;
		}

		@Override
		public void restoreState(Parcelable arg0, ClassLoader arg1) {

		}

		@Override
		public Parcelable saveState() {
			return null;
		}

		@Override
		public void startUpdate(View arg0) {

		}

	}
}