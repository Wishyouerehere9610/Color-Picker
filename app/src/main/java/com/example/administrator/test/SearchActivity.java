package com.example.administrator.test;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.List;

public class SearchActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText mEtSearch;
    private RelativeLayout mRlColor;
    /**
     * search
     */
    private Button mBtn;
    private List list = new ArrayList();
    private RelativeLayout mRlColor1;
    private RelativeLayout mRlColor2;
    private RelativeLayout mRlColor3;
    private RelativeLayout mRlColor4;
    private RelativeLayout mRlColor5;
    private RelativeLayout mRlColor6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        initView();
    }

    private void initView() {
        mEtSearch = (EditText) findViewById(R.id.etSearch);
        mEtSearch.setOnClickListener(this);
        mBtn = (Button) findViewById(R.id.btn);
        mBtn.setOnClickListener(this);
        mRlColor1 = (RelativeLayout) findViewById(R.id.rl_color1);
        mRlColor2 = (RelativeLayout) findViewById(R.id.rl_color2);
        mRlColor3 = (RelativeLayout) findViewById(R.id.rl_color3);
        mRlColor4 = (RelativeLayout) findViewById(R.id.rl_color4);
        mRlColor5 = (RelativeLayout) findViewById(R.id.rl_color5);
        mRlColor6 = (RelativeLayout) findViewById(R.id.rl_color6);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.etSearch:
                break;
            case R.id.btn:
                String name = mEtSearch.getText().toString();

                list = SpUtils.getDataList(SearchActivity.this
                        ,name);
                mRlColor1.setBackgroundColor(Color.parseColor(list.get(0).toString()));
                mRlColor2.setBackgroundColor(Color.parseColor(list.get(1).toString()));
                mRlColor3.setBackgroundColor(Color.parseColor(list.get(2).toString()));
                mRlColor4.setBackgroundColor(Color.parseColor(list.get(3).toString()));
                mRlColor5.setBackgroundColor(Color.parseColor(list.get(4).toString()));
                mRlColor6.setBackgroundColor(Color.parseColor(list.get(5).toString()));

                break;
        }
    }
}
