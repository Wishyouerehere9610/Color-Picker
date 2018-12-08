package com.example.administrator.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.administrator.test.entity.User;

import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.SaveListener;

public class ReigistActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * email address
     */
    private EditText mEtMail;
    /**
     * username
     */
    private EditText mEtName;
    /**
     * password
     */
    private EditText mPwd;
    /**
     * login
     */
    private Button mBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reigist);
        initView();
    }

    private void initView() {
        mEtMail = (EditText) findViewById(R.id.et_mail);
        mEtName = (EditText) findViewById(R.id.et_name);
        mPwd = (EditText) findViewById(R.id.pwd);
        mBtn = (Button) findViewById(R.id.btn);
        mBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.btn:
                if(mEtMail.getText().toString().isEmpty()||mPwd.getText().toString().isEmpty()){
                    Toast.makeText(this,"fill information",Toast.LENGTH_SHORT);
                    return;
                }else {
                    signUp();
                }
                break;
        }
    }

    private void signUp() {
        final User user = new User();
        user.setUsername(mEtMail.getText().toString());
        user.setPassword(mPwd.getText().toString());
        user.signUp(new SaveListener<User>() {
            @Override
            public void done(User user, BmobException e) {
                if (e == null) {
                    Toast.makeText(ReigistActivity.this,"good to go!",Toast.LENGTH_SHORT);
                    finish();
                } else {
                    Toast.makeText(ReigistActivity.this,"fails"+e.getMessage(),Toast.LENGTH_SHORT);
                }
            }
        });
    }
}
