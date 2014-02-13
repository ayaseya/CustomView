package com.example.customview;

import android.app.Activity;
import android.os.Bundle;

public class CustomViewActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_custom_view);
	}

	@Override
	public void onWindowFocusChanged(boolean hasFocus) {
		super.onWindowFocusChanged(hasFocus);
//		TrumpView card = new TrumpView(this);
//		card.setStr("1");
//		card.setSuit(getString(R.string.suit2));
//		card.invalidate();
//		Log.v("Test", "CheckPoint");
	}

}
