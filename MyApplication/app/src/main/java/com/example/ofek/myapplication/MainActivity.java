package com.example.ofek.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etUsername, etPassword, etConfirmPassword, etName;
    private Button btmSignup;
    private CheckBox cbAgree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etUsername = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);
        etConfirmPassword = (EditText) findViewById(R.id.etConfirmPassword);
        etName = (EditText) findViewById(R.id.etName);
        btmSignup = (Button) findViewById(R.id.btnSignup);
        cbAgree = (CheckBox) findViewById(R.id.cbAgree);
    }

    public void signup(View view) {
        //todo: get all data: username, password, conpassword, name
        String username, password, conpassword, name;
        username = etUsername.getText().toString();
        password = etPassword.getText().toString();
        conpassword = etConfirmPassword.getText().toString();
        name = etName.getText().toString();

        if (username.equals("admin")) {
            Toast.makeText(this, "User already exists!", Toast.LENGTH_SHORT).show();
            return;
        }
        if(password.equals(conpassword)) {
            Toast.makeText(this, "You have successfully registered!.", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "Passwords do not math!.", Toast.LENGTH_SHORT).show();
        }
    }
}

