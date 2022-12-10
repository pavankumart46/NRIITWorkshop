package edu.co.nriit.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button submit;
    EditText personName;
    RadioGroup gender;
    Spinner country;
    String g, c;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit = findViewById(R.id.submit);
        personName = findViewById(R.id.personName);
        gender = findViewById(R.id.gender);
        country = findViewById(R.id.countries);
        textView = findViewById(R.id.textView);

        gender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                int id = radioGroup.getCheckedRadioButtonId();
                if (id == R.id.male) {
                    g = "Male";
                } else if (id == R.id.female) {
                    g = "Female";
                } else {
                    g = "Others";
                }
            }
        });


        country.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                c = adapterView.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // When the submit is clicked, what ever needs to happen, you should write the corresponding logic here.
                String n = personName.getText().toString();
                textView.setText(n+"\n"+g+"\n"+c);
                Toast.makeText(MainActivity.this, n + "\n" + g + "\n" + c, Toast.LENGTH_SHORT).show();
            }
        });

    }
}