package com.example.lab08.vucutkitleindeksi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    RadioButton maleRadio;
    RadioButton femaleRadio;
    EditText height,weight;
    Button btnCalculate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        height = findViewById(R.id.txtHeight);
        weight = findViewById(R.id.txtWeight);
        btnCalculate = findViewById(R.id.button1);
        maleRadio = findViewById(R.id.man);
        femaleRadio = findViewById(R.id.woman);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                float hFloatValue=Float.parseFloat(height.getText().toString());
                float wFloatValue=Float.parseFloat(weight.getText().toString());
                float sonuc = wFloatValue/((hFloatValue / 100) * (hFloatValue / 100));
                float idealWeight = 0;

                if(maleRadio.isChecked()){
                    idealWeight = (float) ((hFloatValue-100)*0.89);
                    //Toast.makeText(getApplicationContext(), "Bay seçildi"+sonuc, Toast.LENGTH_SHORT).show();
                }
                else if(femaleRadio.isChecked()){
                    idealWeight = (float) ((hFloatValue-100)*0.94);
                    //Toast.makeText(getApplicationContext(), "Bayan seçildi"+sonuc, Toast.LENGTH_SHORT).show();
                }


                Intent myIntent = new Intent(MainActivity.this, TheSecond.class);
                myIntent.putExtra("myIdealWeight", Float.toString(idealWeight));
                myIntent.putExtra("myCurrentAverage", Float.toString(sonuc));
                startActivity(myIntent);



            }
        });
    }
}
