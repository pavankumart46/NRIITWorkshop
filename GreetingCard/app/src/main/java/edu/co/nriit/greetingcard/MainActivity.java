package edu.co.nriit.greetingcard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editTextTextPersonName);

    }

    public void next(View view) {
        String n = editText.getText().toString();
        Intent i = new Intent(MainActivity.this,NextActivity.class);
        i.putExtra("KEY",n);
        startActivity(i);

    }

    public void openNext(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:0,0?q="+"NRI Institute of Technology"));
        startActivity(intent);
    }
}