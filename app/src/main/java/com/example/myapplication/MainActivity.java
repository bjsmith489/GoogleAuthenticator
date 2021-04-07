package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);
    }
    public void btnOnClick(View view){
        TextView txtFirstName = findViewById(R.id.textViewFirstName);
        TextView txtLastName = findViewById(R.id.textViewLastName);
        TextView txtEmail = findViewById(R.id.textViewEmail);

        EditText edtFirstName = findViewById(R.id.edtTextFirstName);
        EditText edtLastName = findViewById(R.id.edtTextLastName);
        EditText edtEmail = findViewById(R.id.edtTextEmail);

        txtFirstName.setText("First Name: " + edtFirstName.getText().toString());
        txtLastName.setText("Last Name: " + edtLastName.getText().toString());
        txtEmail.setText("Email: " + edtEmail.getText().toString());


    }
}