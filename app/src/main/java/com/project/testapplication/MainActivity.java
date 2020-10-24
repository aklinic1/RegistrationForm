package com.project.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView txtName, txtEmail;
    private EditText editFirstName, editLastName, editEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void buttonAction (View view){
        txtName = findViewById(R.id.textFullName);
        txtEmail = findViewById(R.id.textEmail);
        editFirstName = findViewById(R.id.editTextFirstName);
        editLastName = findViewById(R.id.editTextLastName);
        editEmail = findViewById(R.id.editTextEmail);

        if(editFirstName.getText().toString().isEmpty() || editLastName.getText().toString().isEmpty() || editEmail.getText().toString().isEmpty())
            Toast.makeText(this, "COMPLETE THE REGISTARTION", Toast.LENGTH_LONG).show();
        else {
            String fullName = editFirstName.getText().toString() + " " + editLastName.getText().toString();
            txtName.setText(fullName);
            txtEmail.setText(editEmail.getText().toString());
        }
    }

}