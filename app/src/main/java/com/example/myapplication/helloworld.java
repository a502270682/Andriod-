package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.*;

public class helloworld extends AppCompatActivity {
    EditText totalAmount,totalNum;
    TextView perAmount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helloworld);
        totalAmount=  (EditText) findViewById(R.id.et_total);
        totalNum=(EditText)findViewById(R.id.et_num);
        perAmount=(TextView)findViewById(R.id.txt_amount);
    }
    public void btn_submit(View v)
    {
        double total=Double.parseDouble(totalAmount.getText().toString());
        double num=Double.parseDouble(totalNum.getText().toString());
        double perpay=total/num;
        perpay=Double.valueOf(Math.round(perpay*100));
        perpay=perpay/100;
        perAmount.setText(String.valueOf(perpay));
    }
}
