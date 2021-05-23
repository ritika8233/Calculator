package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView et1;
    Button zero, one, two, three, four, five, six, seven, eight, nine;
    Button add, diff, multi, divi, modulo;
    Button eq, point, delete, ac, si;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (TextView) findViewById(R.id.tv1);
        zero = (Button) findViewById(R.id.b0);
        one = (Button) findViewById(R.id.b1);
        two = (Button) findViewById(R.id.b2);
        three = (Button) findViewById(R.id.b3);
        four = (Button) findViewById(R.id.b4);
        five = (Button) findViewById(R.id.b5);
        six = (Button) findViewById(R.id.b6);
        seven = (Button) findViewById(R.id.b7);
        eight = (Button) findViewById(R.id.b8);
        nine = (Button) findViewById(R.id.b9);
        add = (Button) findViewById(R.id.sum);
        diff = (Button) findViewById(R.id.sub);
        multi = (Button) findViewById(R.id.mul);
        divi = (Button) findViewById(R.id.div);
        modulo = (Button) findViewById(R.id.mod);
        eq = (Button) findViewById(R.id.equal);
        point = (Button) findViewById(R.id.dot);
        delete = (Button) findViewById(R.id.del);
        ac = (Button) findViewById(R.id.reset);
        si = (Button) findViewById(R.id.sign);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               et1.setText(et1.getText() + one.getText().toString());
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText() + two.getText().toString());
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText() + three.getText().toString());
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText() + four.getText().toString());
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText() + five.getText().toString());
            }
        });six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText() + six.getText().toString());
            }
        });seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText() + seven.getText().toString());
            }
        });eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText() + eight.getText().toString());
            }
        });nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText() + nine.getText().toString());
            }
        });zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText() + zero.getText().toString());
            }
        });point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText() + point.getText().toString());
            }
        });
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText("");
            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = et1.getText().toString();
                String t1 = "";
                for(int i = 0; i < temp.length()-1; i++){
                    t1 += temp.charAt(i);
                }
                et1.setText(t1);
            }
        });
        diff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                util1();
                et1.setText(et1.getText() + diff.getText().toString());
                opeartor();
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                util1();
                et1.setText(et1.getText() + add.getText().toString());
                opeartor();
            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                util1();
                et1.setText(et1.getText() + multi.getText().toString());
                opeartor();
            }
        });
        modulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                util1();
                et1.setText(et1.getText() + modulo.getText().toString());
                opeartor();
            }
        });
        divi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                util1();
                et1.setText(et1.getText() + divi.getText().toString());
                opeartor();
            }
        });
        eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               util2();
            }
        });
        }
    float f1 = 0, f2 = 0;
    String ope = "";
    float res = 0;
        public void util1(){
          f1 = Float.parseFloat(et1.getText().toString());
          et1.setText("");
        }
        public void opeartor(){
            ope = et1.getText().toString();
            et1.setText("");
        }
        public void util2(){
            f2 = Float.parseFloat(et1.getText().toString());
            et1.setText("");
            if(ope == "+"){
                res = f1 + f2;
            }
            else if(ope == "-"){
                res = f1 - f2;
            }
            else if(ope == "X"){
                res = f1 * f2;
            }
            else if(ope == "%"){
                res = f1 % f2;
            }
            else if(ope == "/"){
                res = f1 / f2;
            }
            et1.setText(f1 + " " + ope + " " + f2 + " = " + res);
        }
}