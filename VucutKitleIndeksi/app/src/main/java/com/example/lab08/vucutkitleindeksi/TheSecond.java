package com.example.lab08.vucutkitleindeksi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TheSecond extends AppCompatActivity {


    TextView tvSonuc;
    TextView tvAciklama;
    private Button btn1;
    private Button btn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_second);

        float idealWeight = 0;
        float myAverage = 0;
        tvSonuc = (TextView) findViewById(R.id.textView1);
        tvAciklama = (TextView) findViewById(R.id.textView2);
        idealWeight = Float.parseFloat(getIntent().getStringExtra("myIdealWeight"));
        myAverage = Float.parseFloat(getIntent().getStringExtra("myCurrentAverage"));

        if(idealWeight > 0){
            tvSonuc.setText(getString(R.string.idealWeight)+"; "+Math.round(idealWeight));
        }else{
            tvSonuc.setText(getString(R.string.val001));
        }

        if(Math.round(myAverage) >0 && Math.round(myAverage)<18.49){
            tvAciklama.setText(getString(R.string.val002));
        }else if(Math.round(myAverage) >18.49 && Math.round(myAverage)<24.99){
            tvAciklama.setText(getString(R.string.val003));
        }else if(Math.round(myAverage) >24.99 && Math.round(myAverage)<29.99){
            tvAciklama.setText(getString(R.string.val004));
        }else if(Math.round(myAverage) >29.99 && Math.round(myAverage)<34.99){
            tvAciklama.setText(getString(R.string.val005));
        }else if(Math.round(myAverage) >34.99 && Math.round(myAverage)<44.99){
            tvAciklama.setText(getString(R.string.val006));
        }else if(Math.round(myAverage) >44.99){
            tvAciklama.setText(getString(R.string.val007));
        }


        btn2=(Button) findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TheSecond.super.onBackPressed();
            }
        });
    }
}
