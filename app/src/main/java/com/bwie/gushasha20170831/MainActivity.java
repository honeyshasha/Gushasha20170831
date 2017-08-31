package com.bwie.gushasha20170831;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener{
    private Button but;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化控件
        initView();
    }
    /**
     * 控件名
     */
    private void initView() {
        but= (Button) findViewById(R.id.but);
        but.setOnTouchListener(this);
    }
    /**
     * 点击按下松开效果
     * @param view
     * @param motionEvent
     * @return
     */
    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        switch (motionEvent.getAction()){
            case MotionEvent.ACTION_DOWN:
//                but.setText("已经按下按钮");
                Toast.makeText(MainActivity.this,"已经按下按钮",Toast.LENGTH_SHORT).show();
                break;
            case MotionEvent.ACTION_UP:
//                but.setText("已经松开按钮");
                Toast.makeText(MainActivity.this,"已经松开按钮",Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}
/**
 * 简单题：
 * String是基本的数据类型吗？
 * 答：不是
 *动画有哪两类：帧动画和补间动画
 *           答：帧动画是在时间轴的每帧上逐个绘制不同的类容，使其在连续播放而成动画。
 *           答：补间动画是动画主要功能是在绘制动画前设置动画绘制的轨迹，包括时间，位置等。
 */
