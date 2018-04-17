package com.example.a16004798.demoactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnDone = (Button)findViewById(R.id.button);
        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Get the edit Text that user keys in name
                EditText etName = (EditText)findViewById(R.id.editTextName);

                //Get the edit Text that user keys in age
                EditText etAge = (EditText)findViewById(R.id.editTextAge);

                //put the name and age into an array
                String[] info = {etName.getText().toString(), etAge.getText().toString()};

                //Create an intent to start another activity called DemoActivities (which we would create later)
                Intent i = new Intent(MainActivity.this, DemoActivities.class);

                //Pass the string array holding the name and age to the new activity
                i.putExtra("info", info);

                //Start the new activity
                startActivity(i);
            }
        });
    }
}
