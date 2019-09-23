package com.example.lesson16dynamiclayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ViewGroup.LayoutParams mLinearLayoutParams;
    ViewGroup.LayoutParams mlpView;

    LinearLayout.LayoutParams mleftMarginParams;
    LinearLayout.LayoutParams mRightGravityParams;

    TextView tv;

    Button btn, btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // creating LinearLayout
        LinearLayout mLinearLayout = new LinearLayout(this);
        // with vertical orientation
        mLinearLayout.setOrientation(LinearLayout.VERTICAL);
        // creating Layout params
        mLinearLayoutParams = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);

        mlpView = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        tv = new TextView(this);
        tv.setText("TextView");
        tv.setLayoutParams(mlpView);
        mLinearLayout.addView(tv);

        btn = new Button(this);
        btn.setText("Button");
        mLinearLayout.addView(btn, mlpView);

        mleftMarginParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        mleftMarginParams.leftMargin = 50;

        btn1 = new Button(this);
        btn1.setText("Button1");
        mLinearLayout.addView(btn1, mleftMarginParams);

        mRightGravityParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        mRightGravityParams.gravity = Gravity.RIGHT;

        btn2 = new Button(this);
        btn2.setText("Button2");
        mLinearLayout.addView(btn2, mRightGravityParams);

        setContentView(mLinearLayout, mLinearLayoutParams);
    }
}
