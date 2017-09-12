package com.example.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        Log.e("TAG","第二此次该");
        initView();
        initData();
    }

    private void initData() {

    }

    private void initView() {

    }

    private void init() {

    }
}
