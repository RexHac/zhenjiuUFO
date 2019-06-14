package com.example.zhenjiuUFO;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class Level1Activity extends AppCompatActivity {
    private Board mBoardView;
    private int mCount = 0;
    private TextView mShowCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1);
        List<Block> blocks = BoardMap.parse("2,0,0,10,1,0,3,3,0,4,0,2,6,1,2,5,3,2,1,1,3,1,2,3,1,0,4,1,3,4");
        mBoardView = (Board) findViewById(R.id.main_Board);
        mBoardView.setlevel(1);
        mBoardView.setBlocks(blocks);
        mShowCount = (TextView) findViewById(R.id.showSteps);
    }

    public void back(View view) {
        finish();
    }

    public void next(View view) {
            Intent intent = new Intent();
            intent.setClass(Level1Activity.this, Level2Activity.class);
            if (MainActivity.levels[0]==true) {
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
        List<Block> blocks = BoardMap.parse("2,0,0,10,1,0,3,3,0,4,0,2,6,1,2,5,3,2,1,1,3,1,2,3,1,0,4,1,3,4");
        mBoardView.setBlocks(blocks);
    }

    public void recordSteps(View view) {
        mCount = mBoardView.mSteps;
        mShowCount.setText(Integer.toString(mCount));
    }
}
