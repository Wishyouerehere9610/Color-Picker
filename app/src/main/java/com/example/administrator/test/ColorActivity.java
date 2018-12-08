package com.example.administrator.test;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class ColorActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mTvColor;
    private RelativeLayout mRl1;
    private RelativeLayout mRl2;
    private RelativeLayout mRl3;
    private RelativeLayout mRl4;
    private RelativeLayout mRl5;
    private RelativeLayout mRl6;
    private Button mBtnCreateColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);
        initView();


    }

    private String colorRandom() {
        String red;

        String green;

        String blue;
        //get random object
        Random random = new Random();
        //get red color value
        red = Integer.toHexString(random.nextInt(256)).toUpperCase();
        //get green color value
        green = Integer.toHexString(random.nextInt(256)).toUpperCase();
        //get blue color value
        blue = Integer.toHexString(random.nextInt(256)).toUpperCase();

        //test length
        red = red.length() == 1 ? "0" + red : red;

        green = green.length() == 1 ? "0" + green : green;

        blue = blue.length() == 1 ? "0" + blue : blue;
        //GET 16BAND color value
        String color = "#" + red + green + blue;


        return color;
    }

    private void initView() {

        mRl1 = (RelativeLayout) findViewById(R.id.rl1);
        mRl2 = (RelativeLayout) findViewById(R.id.rl2);
        mRl3 = (RelativeLayout) findViewById(R.id.rl3);
        mRl4 = (RelativeLayout) findViewById(R.id.rl4);
        mRl5 = (RelativeLayout) findViewById(R.id.rl5);
        mRl6 = (RelativeLayout) findViewById(R.id.rl6);
        mBtnCreateColor = (Button) findViewById(R.id.btn_createColor);
        mBtnCreateColor.setOnClickListener(this);
        mRl1.setOnClickListener(this);
        mRl2.setOnClickListener(this);
        mRl3.setOnClickListener(this);
        mRl4.setOnClickListener(this);
        mRl5.setOnClickListener(this);
        mRl6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;

            case R.id.btn_createColor:
              /*  String color1 = colorRandom();
                String color2 = colorRandom();
                String color3 = colorRandom();
                String color4 = colorRandom();
                String color5 = colorRandom();
                String color6 = colorRandom();
                List<String> list = new ArrayList<>();
                list.add(color1);
                list.add(color2);
                list.add(color3);
                list.add(color4);
                list.add(color5);
                list.add(color6);

                SharePreference.*/
                mRl1.setBackgroundColor(Color.parseColor(colorRandom()));
                mRl2.setBackgroundColor(Color.parseColor(colorRandom()));
                mRl3.setBackgroundColor(Color.parseColor(colorRandom()));
                mRl4.setBackgroundColor(Color.parseColor(colorRandom()));
                mRl5.setBackgroundColor(Color.parseColor(colorRandom()));
                mRl6.setBackgroundColor(Color.parseColor(colorRandom()));

                break;
            case R.id.rl1:
                break;
            case R.id.rl2:
                break;
            case R.id.rl3:
                break;
            case R.id.rl4:
                break;
            case R.id.rl5:
                break;
            case R.id.rl6:
                break;
        }
    }
}
