package edu.co.nriit.roomdatabase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText fn, ln;
    TextView res;
    AppDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fn = findViewById(R.id.editTextTextPersonName);
        ln = findViewById(R.id.editTextTextPersonName2);
        res = findViewById(R.id.result);

        db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "database-name").
                allowMainThreadQueries().build();

    }


    public void saveData(View view) {
        String firstName = fn.getText().toString();
        String lastName = ln.getText().toString();
        User user = new User(firstName, lastName);
        db.userDao().insertAll(user);
        Toast.makeText(this, "Data saved!", Toast.LENGTH_SHORT).show();
    }

    public void loadData(View view) {
        List<User> users = db.userDao().getAll();
        res.setText("");
        for(int i = 0; i< users.size() ; i++){
            User u = users.get(i);
            res.append(u.getUid() + "\n"+ u.getFirstName()+"\n"+u.getLastName()+"\n\n");
        }
    }
}