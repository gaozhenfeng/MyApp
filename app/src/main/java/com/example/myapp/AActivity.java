package com.example.myapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.ListView;

public class AActivity extends AppCompatActivity {

    private ListView list_item;
    private LinearLayout activity_a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        initView();
        Log.e("TAG","第一次修改");
    }

    private void initView() {
        list_item = (ListView) findViewById(R.id.list_item);
        activity_a = (LinearLayout) findViewById(R.id.activity_a);
    }
}
