package com.project.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void buttonAction (View view){
        TextView txtName = findViewById(R.id.textFullName), txtEmail = findViewById(R.id.textEmail);

        txtName.setText( ((EditText)findViewById(R.id.editTextFirstName)).getText().toString() + " " +
                ((EditText)findViewById(R.id.editTextLastName)).getText().toString() );

        txtEmail.setText( ((EditText)findViewById(R.id.editTextEmail)).getText().toString() );
    }

}