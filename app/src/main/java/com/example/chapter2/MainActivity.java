package com.example.chapter2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "MainActivity onCreate");
        initView();
    }

    private void initView() {

        findViewById(R.id.btn_recyclerview).setOnClickListener(this);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "MainActivity onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "MainActivity onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "MainActivity onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "MainActivity onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "MainActivity onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "MainActivity onDestroy");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btn_recyclerview:
                Intent intent5 = new Intent(this, RecyclerViewActivity.class);
                startActivity(intent5);
                break;

        }
    }

    private static final int REQUEST_CODE_1 = 1357;

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE_1) {
            if (resultCode == RESULT_OK && data != null) {
                String result = data.getStringExtra(GetResultActivity.KEY);
                Toast.makeText(this, result, Toast.LENGTH_LONG).show();
            } else if (resultCode == RESULT_CANCELED) {
                Toast.makeText(this, "没有获取到留言", Toast.LENGTH_LONG).show();
            }
        }
    }
}