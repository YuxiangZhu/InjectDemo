package com.ly.testt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity {


    @InjectView(R.id.tv)
    private TextView tv;
    @InjectView(R.id.iv)
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        TextView tv = findViewById(R.id.tv);

        InjectUtils.injectInit(this);
        tv.setText("我是你大爷");
        iv.getBaseline();


    }
}