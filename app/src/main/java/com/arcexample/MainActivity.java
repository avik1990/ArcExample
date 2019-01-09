package com.arcexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    SemiCircleBG semi_bg;
    SemiCircleFront semi_front;
    TextView tv_complete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        semi_bg = findViewById(R.id.semi_bg);
        semi_front = findViewById(R.id.semi_front);
        tv_complete = findViewById(R.id.tv_complete);
        semi_bg.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
        semi_bg.setClipping(100);

        semi_front.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
        semi_front.setClipping(60);

        tv_complete.setText("60" + "%");

    }
}
