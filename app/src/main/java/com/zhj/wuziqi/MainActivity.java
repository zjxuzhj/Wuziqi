package com.zhj.wuziqi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private WuziqiPanel wuziqi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wuziqi = (WuziqiPanel) findViewById(R.id.id_wuziqi);
    }
    public void restart(View v){
        wuziqi.start();
    }
}
