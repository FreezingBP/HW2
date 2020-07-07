package com.example.chapter2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FrameLayoutActivity extends AppCompatActivity {

    private static final String TAG = "TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_framelayout);
        Log.i(TAG, "FrameLayoutActivity onCreate");
        initView();
    }

    private void initView() {
        final TextView tv = findViewById(R.id.tv_num);
        Intent intent5 = getIntent();
        int pos = intent5.getIntExtra("pos",0);
        tv.setText("it is no." + pos);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "FrameLayoutActivity onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "FrameLayoutActivity onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "FrameLayoutActivity onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "FrameLayoutActivity onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "FrameLayoutActivity onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "FrameLayoutActivity onDestroy");
    }

}