package edu.co.nriit.greetingcard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        Intent i = getIntent();
        String n = i.getStringExtra("KEY");

        TextView tv = findViewById(R.id.textView);
        tv.setText(n);
    }
}