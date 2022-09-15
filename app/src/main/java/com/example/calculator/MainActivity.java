package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView reslt_vw,input_vw;
    Button btn_ac,btn_B,btn_0,btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_minus,btn_plus,btn_mult,btn_div,
    btn_eq,btn_dot;
    Boolean Add,sub,mult,div;
    float res1,res2;
    String process;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Add=sub=mult=div=false;
        reslt_vw = findViewById(R.id.rsllt_view);
        input_vw = findViewById(R.id.inpt_view);
        btn_ac = findViewById(R.id.ac_btn);
        btn_B = findViewById(R.id.back_btn);
        btn_0 = findViewById(R.id.btn_0);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);
        btn_minus = findViewById(R.id.btn_minus);
        btn_plus = findViewById(R.id.btn_plus);
        btn_div  = findViewById(R.id.btn_div);
        btn_mult = findViewById(R.id.btn_mul);
        btn_eq = findViewById(R.id.btn_equal);
        btn_dot = findViewById(R.id.btn_dot);



        btn_dot.setOnClickListener(view -> {
            process = input_vw.getText().toString();
            input_vw.setText(process+".");
        });
        btn_ac.setOnClickListener(view -> {
            input_vw.setText(null);
            reslt_vw.setText(null);
        });

        btn_B.setOnClickListener(view -> {
            process = input_vw.getText().toString();
            int len = process.length();
            if(len > 0)
            {
                input_vw.setText(process.substring(0,len-1));
            }

        });
        btn_0.setOnClickListener(view -> {
            process = input_vw.getText().toString();
            input_vw.setText(process+"0");
        });
        btn_1.setOnClickListener(view -> {
            process = input_vw.getText().toString();
            input_vw.setText(process+"1");
        });
        btn_2.setOnClickListener(view -> {
            process = input_vw.getText().toString();
            input_vw.setText(process+"2");
        });
        btn_3.setOnClickListener(view -> {
            process = input_vw.getText().toString();
            input_vw.setText(process+"3");
        });
        btn_4.setOnClickListener(view -> {
            process = input_vw.getText().toString();
            input_vw.setText(process+"4");
        });
        btn_5.setOnClickListener(view -> {
            process = input_vw.getText().toString();
            input_vw.setText(process+"5");
        });
        btn_6.setOnClickListener(view -> {
            process = input_vw.getText().toString();
            input_vw.setText(process+"6");
        });
        btn_7.setOnClickListener(view -> {
            process = input_vw.getText().toString();
            input_vw.setText(process+"7");
        });
        btn_8.setOnClickListener(view -> {
            process = input_vw.getText().toString();
            input_vw.setText(process+"8");
        });
        btn_9.setOnClickListener(view -> {
            process = input_vw.getText().toString();
            input_vw.setText(process+"9");
        });
        btn_plus.setOnClickListener(view -> {
            int len = input_vw.length();
            if(len <= 0)
            {
                input_vw.setText("0");
            }
            else
            {
                res1 = Float.parseFloat(input_vw.getText()+"");
                Add =true;
                input_vw.setText(null);
            }
        });
        btn_minus.setOnClickListener(view -> {
            int len = input_vw.length();
            if(len <= 0)
            {
                input_vw.setText("0");
            }
            else
            {
                res1 = Float.parseFloat(input_vw.getText()+"");
                sub =true;
                input_vw.setText(null);
            }
        });
        btn_mult.setOnClickListener(view -> {
            int len = input_vw.length();
            if(len <=0)
            {
                input_vw.setText("0");
            }
            else
            {
                res1 = Float.parseFloat(input_vw.getText()+"");
                mult =true;
                input_vw.setText(null);

            }
        });
        btn_div.setOnClickListener(view -> {
            int len = input_vw.length();
            if(len <= 0)
            {
                input_vw.setText("0");
            }
            else
            {
                res1 = Float.parseFloat(input_vw.getText()+"");
                div =true;
                input_vw.setText(null);
            }
        });
        btn_eq.setOnClickListener(view -> {
            res2 = Float.parseFloat(input_vw.getText()+"");
            if(Add)
            {
                reslt_vw.setText(res1+res2+"");
                Add = false;
            }
            else if (sub)
            {
                reslt_vw.setText(res1-res2+"");
                sub = false;
            }
            else if(mult)
            {
                reslt_vw.setText(res1 * res2+"");
                mult = false;
            }
            else
            {
                reslt_vw.setText(res1 / res2+"");
                div = false;
            }


        });


    }
}