package com.example.administrator.test;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.administrator.test.colorpicker.ColorPickerDialog;
import com.example.administrator.test.colorpicker.OnColorPickerListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * Name
     */
    private EditText mEditText;
    /**
     * Button
     */
    private Button mButton2;
    private String colorName;
    private RelativeLayout mColor;
    /**
     * Name
     */
    private EditText mEditText3;
    /**
     * Button
     */
    private Button mButton3;
    private RelativeLayout mColor3;
    /**
     * Name
     */
    private EditText mEditTextRed;
    /**
     * Name
     */
    private EditText mEditTextY;

    /**
     * Name
     */
    private EditText mEditTextB;
    private ColorPickerDialog mColorPickerDialog;
    private boolean supportAlpha;

    private int red;
    private int green;
    private int blue;
    /**
     * search saved color group
     */
    private Button mBtnFind;
    /**
     * show color pick disk
     */
    private Button mBtnColorShow;
    /**
     * random show color
     */
    private Button mBtnColorUI;
    private RelativeLayout mColor4;
    private RelativeLayout mColor5;
    private RelativeLayout mColor6;
    private RelativeLayout mColor7;
    private RelativeLayout mColor8;
    /**
     * color bar 1
     */
    private Button mBtn11;
    /**
     * color bar 2
     */
    private Button mBtn22;
    /**
     * color bar3
     */
    private Button mBtn33;
    /**
     * color bar 4
     */
    private Button mBtn44;
    /**
     * color bar 5
     */
    private Button mBtn55;
    /**
     * color bar 6
     */
    private Button mBtn66;

    private String color1;
    private String color2;
    private String color3;
    private String color4;
    private String color5;
    private String color6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    private void initView() {
        mEditText = (EditText) findViewById(R.id.editText);
        mEditText.setOnClickListener(this);
   /*     mColor = (RelativeLayout) findViewById(R.id.color);
        mColor.setOnClickListener(this);*/
        mButton3 = (Button) findViewById(R.id.button3);
        mButton3.setOnClickListener(this);
        mColor3 = (RelativeLayout) findViewById(R.id.color3);
        mEditTextRed = (EditText) findViewById(R.id.editTextRed);
        mEditTextY = (EditText) findViewById(R.id.editTextY);
        mEditTextB = (EditText) findViewById(R.id.editTextB);
        mColor3.setOnClickListener(this);
        mEditTextRed.setOnClickListener(this);
        mEditTextY.setOnClickListener(this);
        mEditTextB.setOnClickListener(this);
        mBtnFind = (Button) findViewById(R.id.btn_find);
        mBtnFind.setOnClickListener(this);
        mBtnColorShow = (Button) findViewById(R.id.btn_colorShow);
        mBtnColorShow.setOnClickListener(this);
        mBtnColorUI = (Button) findViewById(R.id.btn_colorUI);
        mBtnColorUI.setOnClickListener(this);
        mColor4 = (RelativeLayout) findViewById(R.id.color4);
        mColor5 = (RelativeLayout) findViewById(R.id.color5);
        mColor6 = (RelativeLayout) findViewById(R.id.color6);
        mColor7 = (RelativeLayout) findViewById(R.id.color7);
        mColor8 = (RelativeLayout) findViewById(R.id.color8);
        mColor4.setOnClickListener(this);
        mColor5.setOnClickListener(this);
        mColor6.setOnClickListener(this);
        mColor7.setOnClickListener(this);
        mColor8.setOnClickListener(this);
        mBtn11 = (Button) findViewById(R.id.btn11);
        mBtn11.setOnClickListener(this);
        mBtn22 = (Button) findViewById(R.id.btn22);
        mBtn22.setOnClickListener(this);
        mBtn33 = (Button) findViewById(R.id.btn33);
        mBtn33.setOnClickListener(this);
        mBtn44 = (Button) findViewById(R.id.btn44);
        mBtn44.setOnClickListener(this);
        mBtn55 = (Button) findViewById(R.id.btn55);
        mBtn55.setOnClickListener(this);
        mBtn66 = (Button) findViewById(R.id.btn66);
        mBtn66.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;

            case R.id.editText:

                break;

            case R.id.button3:
                if (mEditText.getText().toString().isEmpty()) {
                    Toast.makeText(this, "fill out ID", Toast.LENGTH_SHORT);
                    return;
                }
                List list = new ArrayList();
                list.add(color1);
                list.add(color2);
                list.add(color3);
                list.add(color4);
                list.add(color5);
                list.add(color6);
                SpUtils.setDataList(MainActivity.this,mEditText.getText().toString(),list);
//                red = Integer.parseInt(mEditTextRed.getText().toString());
//                green = Integer.parseInt(mEditTextY.getText().toString());
//                blue = Integer.parseInt(mEditTextB.getText().toString());
//                int[] array = new int[]{red, green, blue};
//                mColor3.setBackgroundColor(Color.rgb(red, green, blue));
//                String colornum1 = ColorUtils.rgb2Hex(array);
//                Log.i("info", "onClick: " + colornum1);
//                SpUtils.put(this, mEditText.getText().toString(), colornum1);

                break;
            case R.id.color3:
                break;
            case R.id.editTextRed:
                break;
            case R.id.editTextY:
                break;
            case R.id.editTextB:
                break;
            case R.id.btn_find:
                Intent i = new Intent(this, SearchActivity.class);
                startActivity(i);
                break;
            case R.id.btn_colorShow:
                mColorPickerDialog = new ColorPickerDialog(MainActivity.this, getResources().getColor(R.color.colorPrimary), supportAlpha, mOnColorPickerListener).show();
                supportAlpha = !supportAlpha;
                break;
            case R.id.btn_colorUI:
                Intent i1 = new Intent(this, ColorActivity.class);
                startActivity(i1);
                break;
            case R.id.color4:

                break;
            case R.id.color5:
                break;
            case R.id.color6:
                break;
            case R.id.color7:
                break;
            case R.id.color8:
                break;
            case R.id.btn11:
                red = Integer.parseInt(mEditTextRed.getText().toString());
                green = Integer.parseInt(mEditTextY.getText().toString());
                blue = Integer.parseInt(mEditTextB.getText().toString());
                int[] array1 = new int[]{red, green, blue};
                mColor3.setBackgroundColor(Color.rgb(red, green, blue));
                color1 = ColorUtils.rgb2Hex(array1);
                break;
            case R.id.btn22:
                red = Integer.parseInt(mEditTextRed.getText().toString());
                green = Integer.parseInt(mEditTextY.getText().toString());
                blue = Integer.parseInt(mEditTextB.getText().toString());
                int[] array2 = new int[]{red, green, blue};
                mColor4.setBackgroundColor(Color.rgb(red, green, blue));
                color2 = ColorUtils.rgb2Hex(array2);

                break;
            case R.id.btn33:
                red = Integer.parseInt(mEditTextRed.getText().toString());
                green = Integer.parseInt(mEditTextY.getText().toString());
                blue = Integer.parseInt(mEditTextB.getText().toString());
                int[] array3 = new int[]{red, green, blue};
                mColor5.setBackgroundColor(Color.rgb(red, green, blue));
                color3 = ColorUtils.rgb2Hex(array3);


                break;
            case R.id.btn44:
                red = Integer.parseInt(mEditTextRed.getText().toString());
                green = Integer.parseInt(mEditTextY.getText().toString());
                blue = Integer.parseInt(mEditTextB.getText().toString());
                int[] array4 = new int[]{red, green, blue};
                mColor6.setBackgroundColor(Color.rgb(red, green, blue));
                color4 = ColorUtils.rgb2Hex(array4);

                break;
            case R.id.btn55:
                red = Integer.parseInt(mEditTextRed.getText().toString());
                green = Integer.parseInt(mEditTextY.getText().toString());
                blue = Integer.parseInt(mEditTextB.getText().toString());
                int[] array5 = new int[]{red, green, blue};
                mColor7.setBackgroundColor(Color.rgb(red, green, blue));
                color5 = ColorUtils.rgb2Hex(array5);

                break;
            case R.id.btn66:
                red = Integer.parseInt(mEditTextRed.getText().toString());
                green = Integer.parseInt(mEditTextY.getText().toString());
                blue = Integer.parseInt(mEditTextB.getText().toString());
                int[] array6 = new int[]{red, green, blue};
                mColor8.setBackgroundColor(Color.rgb(red, green, blue));
                color6= ColorUtils.rgb2Hex(array6);

                break;
        }
    }

    private OnColorPickerListener mOnColorPickerListener = new OnColorPickerListener() {
        @Override
        public void onColorCancel(ColorPickerDialog dialog) {

        }

        @Override
        public void onColorChange(ColorPickerDialog dialog, int color) {
            //mColor3.setBackgroundColor(color);


        }

        @Override
        public void onColorConfirm(ColorPickerDialog dialog, int color,int num) {
            if (mBtnColorShow != null) {
                mBtnColorShow.setBackgroundColor(color);
                switch (num){
                    case 1:
                        mColor3.setBackgroundColor(color);
                         color1 = ColorUtils.int2Hex(color);
                        break;

                    case 2:
                        mColor4.setBackgroundColor(color);
                         color2 = ColorUtils.int2Hex(color);

                        break;

                    case 3:
                        mColor5.setBackgroundColor(color);
                         color3 = ColorUtils.int2Hex(color);

                        break;
                    case 4:
                        mColor6.setBackgroundColor(color);
                         color4= ColorUtils.int2Hex(color);

                        break;
                    case 5:
                        mColor7.setBackgroundColor(color);
                         color5 = ColorUtils.int2Hex(color);

                        break;
                    case 6:
                        mColor8.setBackgroundColor(color);
                         color6 = ColorUtils.int2Hex(color);

                        break;
                }
            }
        }
    };
}
