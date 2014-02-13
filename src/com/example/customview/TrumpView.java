package com.example.customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class TrumpView extends View {

	// 部品の幅
	private int width = 0;

	// 部品の高さ
	private int height = 0;

	private int color = 0xFF000000;

	private int size = 24;

	private String str = "1";
	private String suit = "1";

	private String mainText = "1";
	private String subText = "1";

	// コンストラクタ
	public TrumpView(Context context) {
		super(context);
	}

	public TrumpView(Context context, AttributeSet attrs) {
		super(context, attrs);

		// styleable から TypedArray の取得  
		TypedArray tArray =
				context.obtainStyledAttributes(
						attrs,
						R.styleable.TrumpView
						);

		// TypedArray から String を取得  
		mainText = tArray.getString(R.styleable.TrumpView_mainText);
		subText = tArray.getString(R.styleable.TrumpView_subText);

	}

	public TrumpView(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		canvas.drawColor(0xFFb0c4de);

		size = width / 2;

		Paint paint = new Paint();
		paint.setAntiAlias(true);
		paint.setColor(color);
		paint.setTextSize(size);

		//		canvas.drawText(str, size / 4, size, paint);
		//		canvas.drawText(suit, size / 4, size * 2, paint);

		canvas.drawText(mainText, size / 4, size, paint);
		canvas.drawText(subText, size / 4, size * 2, paint);
	}

	@Override
	protected void onSizeChanged(int w, int h, int oldw, int oldh) {

		super.onSizeChanged(w, h, oldw, oldh);

		width = w;
		height = h;

	}

	public void setStr(String str) {
		this.str = str;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

}
