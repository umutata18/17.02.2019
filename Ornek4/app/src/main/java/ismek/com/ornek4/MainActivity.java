package ismek.com.ornek4;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import ismek.com.ornek4.databinding.MainActivityBinding;

public class MainActivity extends AppCompatActivity implements


    MainActivityBinding activityMainBinding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.main_activity);

        activityMainBinding.btn0.setOnClickListener(this);
        activityMainBinding.btn1.setOnClickListener(this);
        activityMainBinding.btn2.setOnClickListener(this);
        activityMainBinding.btn3.setOnClickListener(this);
        activityMainBinding.btn4.setOnClickListener(this);
        activityMainBinding.btn5.setOnClickListener(this);
        activityMainBinding.btn6.setOnClickListener(this);
        activityMainBinding.btn7.setOnClickListener(this);
        activityMainBinding.btn8.setOnClickListener(this);
        activityMainBinding.btn9.setOnClickListener(this);
        activityMainBinding.btn0.setOnClickListener(this);
        activityMainBinding.btnArti.setOnClickListener(this);
        activityMainBinding.btnEksi.setOnClickListener(this);





    }

    @Override
    public void onClick(View view) {


    }
}
