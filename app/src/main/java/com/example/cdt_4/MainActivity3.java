package com.example.cdt_4;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    TextView count_4;
    CountDownTimer countDownTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        count_4 = findViewById(R.id.count_4);

        countDownTimer = new CountDownTimer(20000, 1000) {


            public void onTick(long millisUntilFinished) {
                int num = (int) (millisUntilFinished / 1000);
                count_4.setText("남은시간 " + Integer.toString(num + 1)+" 초");
            }

            public void onFinish() {

                Intent intent = new Intent(getApplicationContext(), MainActivity4.class);
                startActivity(intent);

            }
        }.start();
    }
}