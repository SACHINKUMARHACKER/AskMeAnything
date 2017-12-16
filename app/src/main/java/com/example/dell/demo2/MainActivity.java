package com.example.dell.demo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView ballView = (ImageView) findViewById(R.id.image_eightBall);
        final Button askButton = (Button) findViewById(R.id.askButton);
        final int[] askArray = {
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4

        };

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(3);
                ballView.setImageResource(askArray[number]);

            }
        });
    }
}
