package com.example.akshat.akshatcalculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    Button one, two, three, four, five, six, seven, eight, nine, zero, add, sub, mul, div, clear, equal,dot;
    TextView disp;
    double a=0;
    double b=0;
    String operator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        zero = (Button) findViewById(R.id.zero);
        add = (Button) findViewById(R.id.plus);
        sub = (Button) findViewById(R.id.minus);
        mul = (Button) findViewById(R.id.multiply);
        div = (Button) findViewById(R.id.division);
        clear = (Button) findViewById(R.id.clear);
        equal = (Button) findViewById(R.id.equal);
        dot = (Button) findViewById(R.id.dot);
        disp = (TextView) findViewById(R.id.display);


    }


    public void onClickNumber(View view) {

        String str = disp.getText().toString();
        switch (view.getId())

        {
            case R.id.one:
                if (b != 0) {
                    b = 0;
                    disp.setText("");
                }
                str = str + "" + (one.getText().toString());
                disp.setText(str);
                break;
            case R.id.two:
                if (b != 0) {
                    b = 0;
                    disp.setText("");
                }
                str = str + "" + (two.getText().toString());
                disp.setText(str);
                break;
            case R.id.three:
                if (b != 0) {
                    b = 0;
                    disp.setText("");
                }
                str = str + "" + (three.getText().toString());
                disp.setText(str);
                break;
            case R.id.four:
                if (b != 0) {
                    b = 0;
                    disp.setText("");
                }
                str = str + "" + (four.getText().toString());
                disp.setText(str);
                break;
            case R.id.five:
                if (b != 0) {
                    b = 0;
                    disp.setText("");
                }
                str = str + "" + (five.getText().toString());
                disp.setText(str);
                break;
            case R.id.six:
                if (b != 0) {
                    b = 0;
                    disp.setText("");
                }
                str = str + "" + (six.getText().toString());
                disp.setText(str);
                break;
            case R.id.seven:
                if (b != 0) {
                    b = 0;
                    disp.setText("");
                }
                str = str + "" + (seven.getText().toString());
                disp.setText(str);
                break;
            case R.id.eight:
                if (b != 0) {
                    b = 0;
                    disp.setText("");
                }
                str = str + "" + (eight.getText().toString());
                disp.setText(str);
                break;
            case R.id.nine:
                if (b != 0) {
                    b = 0;
                    disp.setText("");
                }
                str = str + "" + (nine.getText().toString());
                disp.setText(str);
                break;
            case R.id.zero:
                if (b != 0) {
                    b = 0;
                    disp.setText("");
                }
                str = str + "" + (zero.getText().toString());
                disp.setText(str);
                break;
            case R.id.dot:
                if (b != 0) {
                    b = 0;
                    disp.setText("");
                }
                str = str + "" + (dot.getText().toString());
                disp.setText(str);
                break;
            case R.id.clear:
                str = "";
                a=0;
                b=0;
                disp.setText(str);
                break;
            case R.id.plus:
                operator = "+";
                if (a == 0) {
                    a = Double.parseDouble(disp.getText().toString());
                    disp.setText("");
                } else if (b != 0) {
                    b = 0;
                    disp.setText("");
                } else {
                    b = Double.parseDouble(disp.getText().toString());
                    disp.setText("");
                    a = a + b;
                    disp.setText(" " + Double.toString(a));
                }
                break;
            case R.id.minus:
                operator = "-";
                if (a == 0) {
                    a = Double.parseDouble(disp.getText().toString());
                    disp.setText("");
                } else if (b != 0) {
                    b = 0;
                    disp.setText("");
                } else {
                    b = Double.parseDouble(disp.getText().toString());
                    disp.setText("");
                    a = a - b;
                    disp.setText(" " + Double.toString(a));
                }
                break;

            case R.id.multiply:
                operator = "*";
                if (a == 0) {
                    a = Double.parseDouble(disp.getText().toString());
                    disp.setText("");
                } else if (b != 0) {
                    b = 0;
                    disp.setText("");
                } else {
                    b = Double.parseDouble(disp.getText().toString());
                    disp.setText("");
                    a = a * b;
                    disp.setText(" " + Double.toString(a));
                }
                break;

            case R.id.division:
                operator = "/";
                if (a == 0) {
                    a = Double.parseDouble(disp.getText().toString());
                    disp.setText("");
                } else if (b != 0) {
                    b = 0;
                    disp.setText("");
                } else {
                    b = Double.parseDouble(disp.getText().toString());
                    disp.setText("");
                    a = a / b;
                    disp.setText(" " + Double.toString(a));
                }
                break;
            case R.id.equal:
                if (!operator.equals(null)) {
                    if (b != 0) {
                        if (operator.equals("+")) {
                            disp.setText(""); /*a = a + b;*/
                            disp.setText(" " + Double.toString(a));
                        }
                        else if (operator.equals("-")) {
                            disp.setText("");
                            disp.setText(" " + Double.toString(a));

                        }
                        else if (operator.equals("*")) {
                            disp.setText("");
                            disp.setText(" " + Double.toString(a));
                        }
                        else if (operator.equals("/")) {
                            disp.setText("");
                            disp.setText(" " + Double.toString(a));
                        }
                    }
                        else {
                            myCalculation();
                        }
                    }
                    break;


                }
        }

    public void myCalculation(){
        if(operator.equals("+"))
        {
            b = Double.parseDouble(disp.getText().toString());
            disp.setText("");
            a = a + b;
            disp.setText("" + Double.toString(a));
        }
        else if(operator.equals("-"))
        {
            b = Double.parseDouble(disp.getText().toString());
            disp.setText("");
            a = a - b;
            disp.setText("" + Double.toString(a));
        }
        else if(operator.equals("*"))
        {
            b = Double.parseDouble(disp.getText().toString());
            disp.setText("");
            a = a * b;
            disp.setText("" + Double.toString(a));
        }
        else
        if(operator.equals("/"))
        {
            b = Double.parseDouble(disp.getText().toString());
            disp.setText("");
            a = a / b;
            disp.setText("" + Double.toString(a));
        }
    }

}
