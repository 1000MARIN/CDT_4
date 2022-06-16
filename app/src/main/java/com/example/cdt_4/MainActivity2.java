package com.example.cdt_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private ImageView   box_be_1;
    private ImageView   box_be_2;
    private ImageView   box_be_3;
    private ImageView   box_be_4;
    private ImageView   box_be_5;
    private ImageView   box_be_6;
    private ImageView   box_bl_1;
    private ImageView   box_bl_2;
    private ImageView   box_bl_3;
    private ImageView   box_bl_4;
    private ImageView   box_bl_5;
    private ImageView   box_bl_6;
    private ImageView   box_q1;
    private ImageView   box_q2;
    private ImageView   box_a1;
    private ImageView   box_a2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        box_be_1 = findViewById(R.id.box_be_1);
        box_be_2 = findViewById(R.id.box_be_2);
        box_be_3 = findViewById(R.id.box_be_3);
        box_be_4 = findViewById(R.id.box_be_4);
        box_be_5 = findViewById(R.id.box_be_5);
        box_be_6 = findViewById(R.id.box_be_6);
        box_bl_1 = findViewById(R.id.box_bl_1);
        box_bl_2 = findViewById(R.id.box_bl_2);
        box_bl_3 = findViewById(R.id.box_bl_3);
        box_bl_4 = findViewById(R.id.box_bl_4);
        box_bl_5 = findViewById(R.id.box_bl_5);
        box_bl_6 = findViewById(R.id.box_bl_6);
        box_q1   = findViewById(R.id.box_q1);
        box_q2   = findViewById(R.id.box_q2);
        box_a1   = findViewById(R.id.box_a1);
        box_a2   = findViewById(R.id.box_a2);

        Handler h1 = new Handler();
        Handler h2 = new Handler();
        Handler h3 = new Handler();
        Handler h4 = new Handler();
        Handler h5 = new Handler();
        Handler h6 = new Handler();
        Handler h7 = new Handler();
        Handler h8 = new Handler();


        h1.postDelayed(new Runnable() {
            @Override
            public void run() {
                box_be_1.setVisibility(View.VISIBLE);
                box_be_2.setVisibility(View.INVISIBLE);
                box_be_3.setVisibility(View.VISIBLE);
                box_be_4.setVisibility(View.VISIBLE);
                box_be_5.setVisibility(View.VISIBLE);
                box_be_6.setVisibility(View.VISIBLE);
                box_bl_1.setVisibility(View.INVISIBLE);
                box_bl_2.setVisibility(View.VISIBLE);
                box_bl_3.setVisibility(View.INVISIBLE);
                box_bl_4.setVisibility(View.INVISIBLE);
                box_bl_5.setVisibility(View.INVISIBLE);
                box_bl_6.setVisibility(View.INVISIBLE);

                // 문제 정답
                box_q1.setVisibility(View.INVISIBLE);
                box_q2.setVisibility(View.INVISIBLE);
                box_a1.setVisibility(View.INVISIBLE);
                box_a2.setVisibility(View.INVISIBLE);
            }
        }, 2000);


        h2.postDelayed(new Runnable() {
            @Override
            public void run() {
                box_be_1.setVisibility(View.VISIBLE);
                box_be_2.setVisibility(View.VISIBLE);
                box_be_3.setVisibility(View.INVISIBLE);
                box_be_4.setVisibility(View.VISIBLE);
                box_be_5.setVisibility(View.VISIBLE);
                box_be_6.setVisibility(View.VISIBLE);
                box_bl_1.setVisibility(View.INVISIBLE);
                box_bl_2.setVisibility(View.INVISIBLE);
                box_bl_3.setVisibility(View.VISIBLE);
                box_bl_4.setVisibility(View.INVISIBLE);
                box_bl_5.setVisibility(View.INVISIBLE);
                box_bl_6.setVisibility(View.INVISIBLE);

                // 문제 정답
                box_q1.setVisibility(View.INVISIBLE);
                box_q2.setVisibility(View.INVISIBLE);
                box_a1.setVisibility(View.INVISIBLE);
                box_a2.setVisibility(View.INVISIBLE);
            }
        }, 4000);

        h3.postDelayed(new Runnable() {
            @Override
            public void run() {
                box_be_1.setVisibility(View.VISIBLE);
                box_be_2.setVisibility(View.VISIBLE);
                box_be_3.setVisibility(View.VISIBLE);
                box_be_4.setVisibility(View.INVISIBLE);
                box_be_5.setVisibility(View.VISIBLE);
                box_be_6.setVisibility(View.VISIBLE);
                box_bl_1.setVisibility(View.INVISIBLE);
                box_bl_2.setVisibility(View.INVISIBLE);
                box_bl_3.setVisibility(View.INVISIBLE);
                box_bl_4.setVisibility(View.VISIBLE);
                box_bl_5.setVisibility(View.INVISIBLE);
                box_bl_6.setVisibility(View.INVISIBLE);

                // 문제 정답
                box_q1.setVisibility(View.INVISIBLE);
                box_q2.setVisibility(View.INVISIBLE);
                box_a1.setVisibility(View.INVISIBLE);
                box_a2.setVisibility(View.INVISIBLE);
            }
        }, 6000);

        h4.postDelayed(new Runnable() {
            @Override
            public void run() {
                box_be_1.setVisibility(View.VISIBLE);
                box_be_2.setVisibility(View.VISIBLE);
                box_be_3.setVisibility(View.VISIBLE);
                box_be_4.setVisibility(View.VISIBLE);
                box_be_5.setVisibility(View.INVISIBLE);
                box_be_6.setVisibility(View.VISIBLE);
                box_bl_1.setVisibility(View.INVISIBLE);
                box_bl_2.setVisibility(View.INVISIBLE);
                box_bl_3.setVisibility(View.INVISIBLE);
                box_bl_4.setVisibility(View.INVISIBLE);
                box_bl_5.setVisibility(View.VISIBLE);
                box_bl_6.setVisibility(View.INVISIBLE);

                // 문제 정답
                box_q1.setVisibility(View.INVISIBLE);
                box_q2.setVisibility(View.INVISIBLE);
                box_a1.setVisibility(View.INVISIBLE);
                box_a2.setVisibility(View.INVISIBLE);
            }
        }, 8000);

        h5.postDelayed(new Runnable() {
            @Override
            public void run() {
                box_be_1.setVisibility(View.VISIBLE);
                box_be_2.setVisibility(View.VISIBLE);
                box_be_3.setVisibility(View.VISIBLE);
                box_be_4.setVisibility(View.VISIBLE);
                box_be_5.setVisibility(View.VISIBLE);
                box_be_6.setVisibility(View.INVISIBLE);
                box_bl_1.setVisibility(View.INVISIBLE);
                box_bl_2.setVisibility(View.INVISIBLE);
                box_bl_3.setVisibility(View.INVISIBLE);
                box_bl_4.setVisibility(View.INVISIBLE);
                box_bl_5.setVisibility(View.INVISIBLE);
                box_bl_6.setVisibility(View.VISIBLE);

                // 문제 정답
                box_q1.setVisibility(View.INVISIBLE);
                box_q2.setVisibility(View.INVISIBLE);
                box_a1.setVisibility(View.INVISIBLE);
                box_a2.setVisibility(View.INVISIBLE);
            }
        }, 10000);

        h6.postDelayed(new Runnable() {
            @Override
            public void run() {
                box_be_1.setVisibility(View.INVISIBLE);
                box_be_2.setVisibility(View.VISIBLE);
                box_be_3.setVisibility(View.VISIBLE);
                box_be_4.setVisibility(View.VISIBLE);
                box_be_5.setVisibility(View.VISIBLE);
                box_be_6.setVisibility(View.VISIBLE);
                box_bl_1.setVisibility(View.VISIBLE);
                box_bl_2.setVisibility(View.INVISIBLE);
                box_bl_3.setVisibility(View.INVISIBLE);
                box_bl_4.setVisibility(View.INVISIBLE);
                box_bl_5.setVisibility(View.INVISIBLE);
                box_bl_6.setVisibility(View.INVISIBLE);

                // 문제 정답
                box_q1.setVisibility(View.INVISIBLE);
                box_q2.setVisibility(View.INVISIBLE);
                box_a1.setVisibility(View.INVISIBLE);
                box_a2.setVisibility(View.INVISIBLE);
            }
        }, 12000);

        h7.postDelayed(new Runnable() {
            @Override
            public void run() {
                box_be_1.setVisibility(View.VISIBLE);
                box_be_2.setVisibility(View.VISIBLE);
                box_be_3.setVisibility(View.VISIBLE);
                box_be_4.setVisibility(View.VISIBLE);
                box_be_5.setVisibility(View.VISIBLE);
                box_be_6.setVisibility(View.VISIBLE);
                box_bl_1.setVisibility(View.INVISIBLE);
                box_bl_2.setVisibility(View.INVISIBLE);
                box_bl_3.setVisibility(View.INVISIBLE);
                box_bl_4.setVisibility(View.INVISIBLE);
                box_bl_5.setVisibility(View.INVISIBLE);
                box_bl_6.setVisibility(View.INVISIBLE);

                // 문제 정답
                box_q1.setVisibility(View.INVISIBLE);
                box_q2.setVisibility(View.INVISIBLE);
                box_a1.setVisibility(View.INVISIBLE);
                box_a2.setVisibility(View.INVISIBLE);

            }
        }, 14000);

        h8.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(), MainActivity3.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        }, 15000);
    }

}