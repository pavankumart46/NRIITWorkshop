package edu.co.nriit.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.editTextNumber);
        num2 = findViewById(R.id.editTextNumber2);
        result = findViewById(R.id.textView);
    }

    public void add(View view) {
        int a = Integer.parseInt(num1.getText().toString());
        int b = Integer.parseInt(num2.getText().toString());
        result.setText(String.valueOf(a+b));
    }

    public void sub(View view) {
        int a = Integer.parseInt(num1.getText().toString());
        int b = Integer.parseInt(num2.getText().toString());
        result.setText(String.valueOf(a-b));
    }

    public void mul(View view) {
        int a = Integer.parseInt(num1.getText().toString());
        int b = Integer.parseInt(num2.getText().toString());
        result.setText(String.valueOf(a*b));
    }

    public void div(View view) {
        int a = Integer.parseInt(num1.getText().toString());
        int b = Integer.parseInt(num2.getText().toString());
        result.setText(String.valueOf(a/b));
    }
}