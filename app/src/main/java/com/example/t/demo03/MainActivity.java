package com.example.t.demo03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//这是添加的注释
public class MainActivity extends AppCompatActivity {

    //一般在此方法初始化控件
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}
