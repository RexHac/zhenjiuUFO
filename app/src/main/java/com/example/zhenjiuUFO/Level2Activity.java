package com.example.zhenjiuUFO;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class Level2Activity extends AppCompatActivity {
    private Board mBoardView;
    private int mCount = 0;
    private TextView mShowCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2);
        List<Block> blocks = BoardMap.parse("2,0,0,10,1,0,1,3,0,1,3,1,6,0,2,1,2,2,1,3,2,3,0,3,7,1,3,4,3,3");
        mBoardView = (Board) findViewById(R.id.main_Board);
        mBoardView.setlevel(2);
        mBoardView.setBlocks(blocks);
        mShowCount = (TextView) findViewById(R.id.showSteps);
    }

    public void back(View view) {
        finish();
    }

    public void next(View view) {
        if (MainActivity.levels[1]==true) {
            Intent intent = new Intent();
            intent.setClass(Level2Activity.this, Level3Activity.class);
            startActivity(intent);
            finish();
        } else {
            Toast.makeText(getApplicationContext(),"得先通过这一关噢",Toast.LENGTH_LONG).show();
        }
    }

    public void restart(View view) {
        mBoardView.mSteps = 0;
        mCount = mBoardView.mSteps;
        mShowCount.setText(Integer.toString(mCount));
        List<Block> blocks = BoardMap.parse("2,0,0,10,1,0,1,3,0,1,3,1,6,0,2,1,2,2,1,3,2,3,0,3,7,1,3,4,3,3");
        mBoardView.setBlocks(blocks);
    }
    public void recordSteps(View view) {
        mCount = mBoardView.mSteps;
        mShowCount.setText(Integer.toString(mCount));
    }
}
