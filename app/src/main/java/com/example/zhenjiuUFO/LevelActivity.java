package com.example.zhenjiuUFO;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class LevelActivity extends AppCompatActivity {

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);
    }


    public void exit(View view) {
        finish();
    }


    public void goLevel1(View view) {
        Intent intent = new Intent();
        intent.setClass(LevelActivity.this, Level1Activity.class);
        startActivity(intent);
    }

    public void goLevel2(View view) {
        Intent intent = new Intent();
        intent.setClass(LevelActivity.this, Level2Activity.class);
        startActivity(intent);
    }

    public void goLevel3(View view) {
        Intent intent = new Intent();
        intent.setClass(LevelActivity.this, Level3Activity.class);
        startActivity(intent);
    }

    public void goLevel4(View view) {
        Intent intent = new Intent();
        intent.setClass(LevelActivity.this, Level4Activity.class);
        startActivity(intent);
    }
}
