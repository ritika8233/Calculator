package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et1;
    Button zero, one, two, three, four, five, six, seven, eight, nine;
    Button add, diff, multi, divi, modulo;
    Button eq, point, delete, ac, si;
    Button bita, bito, bitx;
    String temp = "";
    double res = 0;
    int pflag = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.edt1);
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
        bita = (Button) findViewById(R.id.and);
        bito = (Button) findViewById(R.id.or);
        bitx = (Button) findViewById(R.id.xor);
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
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText() + six.getText().toString());
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText() + seven.getText().toString());
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText() + eight.getText().toString());
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText() + nine.getText().toString());
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String g = et1.getText().toString();
                if(g.length() == 1 && g.charAt(0) == '0')return;
                et1.setText(et1.getText() + zero.getText().toString());
            }
        });
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pflag == 0) {
                    String g = et1.getText().toString();
                    if (g.length() == 0) {
                        String t = "";
                        t += '0';
                        et1.setText(t);
                    }
                    et1.setText(et1.getText().toString() + ".");
                    pflag = 1;
                }
                else{
                    return;
                }
            }
        });
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText("");
                res = 0;
                pflag = 0 ;
            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = et1.getText().toString();
                if(temp.length() == 0)return;
                if(temp.length() == 1){
                    res = 0;
                    pflag = 0;
                    et1.setText("");
                }
                else {
                    String t1 = "";
                    for (int i = 0; i < temp.length() - 1; i++) {
                        t1 += temp.charAt(i);
                    }
                    et1.setText(t1);
                    if(temp.charAt(temp.length()-1) == '.'){
                        pflag = 0 ;
                    }
                    if((temp.charAt(temp.length()-1) == '+') && (temp.charAt(temp.length()-1) == '-') && (temp.charAt(temp.length()-1) == '*') &&
                            (temp.charAt(temp.length()-1) == '/') && (temp.charAt(temp.length()-1) == '%') && (temp.charAt(temp.length()-1) == '&') &&
                            (temp.charAt(temp.length()-1) == '^') && (temp.charAt(temp.length()-1) == '|')){
                        pflag = 1;
                    }
                }
            }
        });
        si.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "-";
                et1.setText(et1.getText().toString() + s);
            }
        });
        diff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String g = et1.getText().toString();
                if(g.length() == 0)return;
                if((g.charAt(g.length()-1) == '+') || (g.charAt(g.length()-1) == '-') ||
                        (g.charAt(g.length()-1) == '%') || (g.charAt(g.length()-1) == '/') || (g.charAt(g.length()-1) == '*') ||
                        (g.charAt(g.length()-1) == '&') || (g.charAt(g.length()-1) == '|') || (g.charAt(g.length()-1) == '^')){
                    return;
                }
                temp = "-";
                et1.setText(et1.getText().toString() + temp);
                pflag  = 0;
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String g = et1.getText().toString();
                if(g.length() == 0)return;
                if((g.charAt(g.length()-1) == '+') || (g.charAt(g.length()-1) == '-') ||
                        (g.charAt(g.length()-1) == '%') || (g.charAt(g.length()-1) == '/') || (g.charAt(g.length()-1) == '*') ||
                        (g.charAt(g.length()-1) == '&') || (g.charAt(g.length()-1) == '|') || (g.charAt(g.length()-1) == '^')){
                    return;
                }
                temp = "+";
                et1.setText(et1.getText().toString() + temp);
                pflag  = 0;
            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String g = et1.getText().toString();
                if(g.length() == 0)return;
                if((g.charAt(g.length()-1) == '+') || (g.charAt(g.length()-1) == '-') ||
                        (g.charAt(g.length()-1) == '%') || (g.charAt(g.length()-1) == '/') || (g.charAt(g.length()-1) == '*') ||
                        (g.charAt(g.length()-1) == '&') || (g.charAt(g.length()-1) == '|') || (g.charAt(g.length()-1) == '^')){
                    return;
                }
                temp = "*";
                et1.setText(et1.getText().toString() + temp);
                pflag  = 0;
            }
        });
        modulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String g = et1.getText().toString();
                if(g.length() == 0)return;
                if((g.charAt(g.length()-1) == '+') || (g.charAt(g.length()-1) == '-') ||
                        (g.charAt(g.length()-1) == '%') || (g.charAt(g.length()-1) == '/') || (g.charAt(g.length()-1) == '*') ||
                        (g.charAt(g.length()-1) == '&') || (g.charAt(g.length()-1) == '|') || (g.charAt(g.length()-1) == '^')){
                    return;
                }
                temp = "%";
                et1.setText(et1.getText().toString() + temp);
                pflag  = 0;
            }
        });
        divi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String g = et1.getText().toString();
                if(g.length() == 0)return;
                if((g.charAt(g.length()-1) == '+') || (g.charAt(g.length()-1) == '-') ||
                        (g.charAt(g.length()-1) == '%') || (g.charAt(g.length()-1) == '/') || (g.charAt(g.length()-1) == '*') ||
                        (g.charAt(g.length()-1) == '&') || (g.charAt(g.length()-1) == '|') || (g.charAt(g.length()-1) == '^')){
                    return;
                }
                temp = "/";
                et1.setText(et1.getText().toString() + temp);
                pflag  = 0;
            }
        });
        bita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String g = et1.getText().toString();
                if(g.length() == 0)return;
                if((g.charAt(g.length()-1) == '+') || (g.charAt(g.length()-1) == '-') ||
                        (g.charAt(g.length()-1) == '%') || (g.charAt(g.length()-1) == '/') || (g.charAt(g.length()-1) == '*') ||
                        (g.charAt(g.length()-1) == '&') || (g.charAt(g.length()-1) == '|') || (g.charAt(g.length()-1) == '^')){
                    return;
                }
                temp = "&";
                et1.setText(et1.getText().toString() + temp);
                pflag  = 0;
            }
        });
        bitx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String g = et1.getText().toString();
                if(g.length() == 0)return;
                if((g.charAt(g.length()-1) == '+') || (g.charAt(g.length()-1) == '-') ||
                        (g.charAt(g.length()-1) == '%') || (g.charAt(g.length()-1) == '/') || (g.charAt(g.length()-1) == '*') ||
                        (g.charAt(g.length()-1) == '&') || (g.charAt(g.length()-1) == '|') || (g.charAt(g.length()-1) == '^')){
                    return;
                }
                temp = "^";
                et1.setText(et1.getText().toString() + temp);
                pflag  = 0;
            }
        });
        bito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String g = et1.getText().toString();
                if(g.length() == 0)return;
                if((g.charAt(g.length()-1) == '+') || (g.charAt(g.length()-1) == '-') ||
                        (g.charAt(g.length()-1) == '%') || (g.charAt(g.length()-1) == '/') || (g.charAt(g.length()-1) == '*') ||
                        (g.charAt(g.length()-1) == '&') || (g.charAt(g.length()-1) == '|') || (g.charAt(g.length()-1) == '^')){
                    return;
                }
                temp = "|";
                et1.setText(et1.getText().toString() + temp);
                pflag  = 0;
            }
        });
        eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String g = et1.getText().toString();
                if (g.length() == 0) return;
                if((g.charAt(g.length()-1) == '+') || (g.charAt(g.length()-1) == '-') ||
                        (g.charAt(g.length()-1) == '%') || (g.charAt(g.length()-1) == '/') || (g.charAt(g.length()-1) == '*') ||
                        (g.charAt(g.length()-1) == '&') || (g.charAt(g.length()-1) == '|') || (g.charAt(g.length()-1) == '^')){
                    return;
                }
                int n = g.length();
                int i = 0;

                double f1 = 0, f2 = 0;
                char ch;
                int flag = 0;
                String t = "";
                if(g.charAt(i) == '-'){
                    t += g.charAt(i);
                    i++;
                }
                while((i < n) && (g.charAt(i) != '+') && (g.charAt(i) != '-') && (g.charAt(i) != '*') && (g.charAt(i) != '/') && (g.charAt(i) != '%')
                        && (g.charAt(i) != '|') && (g.charAt(i) != '&') && (g.charAt(i) != '^')){
                    t += g.charAt(i);
                    i++;
                }
                if(i == n){
                    return;
                }
                f1 = Double.parseDouble(t);
                ch = g.charAt(i);
                i++;
                t = "";

                while(i<n){
                    t = "";
                    while((i < n) && (g.charAt(i) != '+') && (g.charAt(i) != '-') && (g.charAt(i) != '*') && (g.charAt(i) != '/') && (g.charAt(i) != '%')
                            && (g.charAt(i) != '&') && (g.charAt(i) != '|') && (g.charAt(i) != '^')){
                        t += g.charAt(i);
                        i++;
                    }
                    f2 = Double.parseDouble(t);
                    if(ch == '+'){
                        res = f1 + f2;
                    }
                    else if(ch == '-'){
                        res = f1 - f2;
                    }
                    else if(ch == '*'){
                        res = f1 * f2;
                    }
                    else if(ch == '/'){
                        res = f1 / f2;
                    }
                    else if(ch == '%'){
                        res = f1 % f2;
                    }
                    else if(ch == '^'){
                        res = (int)f1 ^ (int)f2;
                    }
                    else if(ch == '&'){
                        res = (int)f1 & (int)f2;
                    }
                    else if(ch == '|'){
                        res = (int)f1 | (int)f2;
                    }
                    f1 = res;
                    res = 0;
                    if(i<n){
                        ch = g.charAt(i);
                        i++;
                    }
                }
                if(f1 == 0){
                    f1 = (int)0;
                }
                et1.setText(Double.toString(f1));
                pflag = 0;
                //Completed
            }
          });
        }
    }