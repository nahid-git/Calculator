package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView display;
    EditText firstInput, secondInput;
    Button sum, sub, mul,div;
    Double a, b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = (TextView) findViewById(R.id.display);
        firstInput = (EditText) findViewById(R.id.firstInput);
        secondInput = (EditText) findViewById(R.id.secondInput);
        sum = (Button) findViewById(R.id.sum);
        sub = (Button) findViewById(R.id.sub);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             a = Double.parseDouble(firstInput.getText().toString());
             b = Double.parseDouble(secondInput.getText().toString());
             display.setText(String.valueOf(a+b));
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Double.parseDouble(firstInput.getText().toString());
                b = Double.parseDouble(secondInput.getText().toString());
                display.setText(String.valueOf(a-b));
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Double.parseDouble(firstInput.getText().toString());
                b = Double.parseDouble(secondInput.getText().toString());
                display.setText(String.valueOf(a*b));
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Double.parseDouble(firstInput.getText().toString());
                b = Double.parseDouble(secondInput.getText().toString());
                display.setText(String.valueOf(a/b));
            }
        });
    }
}