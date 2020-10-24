package com.project.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private TextView txtName, txtEmail;
    private EditText editFirstName, editLastName, editEmail;
    private CheckBox chkBox;
    private Spinner genderSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<String> genders = new ArrayList<>();

        genders.add("Male");
        genders.add("Female");

        ArrayAdapter<String> genderAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_dropdown_item,
                genders
        );
        genderSpinner = findViewById(R.id.gndrSpinner);
        genderSpinner.setAdapter(genderAdapter);
        txtName = findViewById(R.id.textFullName);
        txtEmail = findViewById(R.id.textEmail);
        editFirstName = findViewById(R.id.editTextFirstName);
        editLastName = findViewById(R.id.editTextLastName);
        editEmail = findViewById(R.id.editTextEmail);
        chkBox = findViewById(R.id.checkBox);


    }
    public void buttonAction (View view){

        if(editFirstName.getText().toString().isEmpty() || editLastName.getText().toString().isEmpty() || editEmail.getText().toString().isEmpty())
            Toast.makeText(this, "COMPLETE THE REGISTARTION", Toast.LENGTH_LONG).show();
        else if(chkBox.isChecked() == false)
            Toast.makeText(this, "You must be 18 or over to register !", Toast.LENGTH_SHORT).show();
        else if(genderSpinner.getSelectedItem().toString() == " ")
            Toast.makeText(this, "Please select your gender", Toast.LENGTH_SHORT).show();
        else {
            String fullName = editFirstName.getText().toString() + " " + editLastName.getText().toString();
            txtName.setText(fullName);
            txtEmail.setText(editEmail.getText().toString());
        }
    }

}