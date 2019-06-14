package com.example.zhenjiuUFO;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class Level4Activity extends AppCompatActivity {
    private Board mBoardView;
    private int mCount = 0;
    private TextView mShowCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level4);
        List<Block> blocks = BoardMap.parse("2,0,0,10,1,0,1,3,0,1,3,1,6,0,2,7,2,2,8,0,3,9,2,3,1,0,4,1,3,4");
        mBoardView = (Board) findViewById(R.id.main_Board);
        mBoardView.setlevel(4);
        mBoardView.setBlocks(blocks);
        mShowCount = (TextView) findViewById(R.id.showSteps);
    }
    public void back(View view) {
        finish();
    }

    public void next(View view) {
        Toast.makeText(getApplicationContext(),"妹有新的辽！",Toast.LENGTH_LONG).show();
    }
    public void restart(View view) {
        mBoardView.mSteps = 0;
        mCount = mBoardView.mSteps;
        mShowCount.setText(Integer.toString(mCount));
        List<Block> blocks = BoardMap.parse("2,0,0,10,1,0,1,3,0,1,3,1,6,0,2,7,2,2,8,0,3,9,2,3,1,0,4,1,3,4");
        mBoardView.setBlocks(blocks);
    }
    public void recordSteps(View view) {
        mCount = mBoardView.mSteps;
        mShowCount.setText(Integer.toString(mCount));
    }
}
