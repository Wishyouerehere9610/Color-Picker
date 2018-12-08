package com.example.administrator.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.administrator.test.entity.User;

import cn.bmob.v3.Bmob;
import cn.bmob.v3.BmobUser;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.LogInListener;
import cn.bmob.v3.listener.SaveListener;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * email adrress
     */
    private EditText mUsername;
    /**
     * password
     */
    private EditText mPwd;
    /**
     * login
     */
    private Button mBtnLogin;
    /**
     * sign up
     */
    private Button mBtnRegist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bmob.initialize(this, "bc4d90cf44974999c38f7d600b11d82f");
        setContentView(R.layout.activity_login);

        initView();
    }

    private void initView() {
        mUsername = (EditText) findViewById(R.id.username);
        mUsername.setText("123456789@qq.com");
        mPwd = (EditText) findViewById(R.id.pwd);
        mPwd.setText("123456");

        mBtnLogin = (Button) findViewById(R.id.btn_login);
        mBtnLogin.setOnClickListener(this);
        mBtnRegist = (Button) findViewById(R.id.btn_regist);
        mBtnRegist.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.btn_login:
                loginByAccount();
                break;
            case R.id.btn_regist:
                Intent i = new Intent(LoginActivity.this,ReigistActivity.class);
                startActivity(i);
                break;
        }
    }

    private void login(final View view) {
        final User user = new User();

        user.setUsername(mUsername.getText().toString());

        user.setPassword(mPwd.getText().toString());
        user.login(new SaveListener<User>() {
            @Override
            public void done(User bmobUser, BmobException e) {
                if (e == null) {
                    User user = BmobUser.getCurrentUser(User.class);
                    Toast.makeText(LoginActivity.this,"login successfully",Toast.LENGTH_SHORT);
                    Intent i = new Intent(LoginActivity.this,MainActivity.class);
                    startActivity(i);
                } else {
                    Toast.makeText(LoginActivity.this,"Can`t login"+ e.getMessage(),Toast.LENGTH_SHORT);

                }
            }
        });
    }
    private void loginByAccount() {

        BmobUser.loginByAccount(mUsername.getText().toString(), mPwd.getText().toString(), new LogInListener<User>() {
            @Override
            public void done(User user, BmobException e) {
                if (e == null) {
                    Toast.makeText(LoginActivity.this,"login successfully",Toast.LENGTH_SHORT);
                    Intent i = new Intent(LoginActivity.this,MainActivity.class);
                    startActivity(i);

                } else {
                    Toast.makeText(LoginActivity.this,"Can`t login"+ e.getMessage(),Toast.LENGTH_LONG);

                }
            }
        });
    }

}
