package com.example.ofek.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText etName, etPassword;
    private Button btmSignup, btmLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etPassword = (EditText) findViewById(R.id.etPassword);
        etName = (EditText) findViewById(R.id.etName);
    }

    public void signup(View view) {
        //todo: get all data: name, password
        String password, name;
        password = etPassword.getText().toString();
        name = etName.getText().toString();

        if (!name.equals("admin")) {
            Toast.makeText(this, "User not exists!", Toast.LENGTH_SHORT).show();
            return;
        }
        if(password.equals(123)) {
            Toast.makeText(this, "You have successfully login!.", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "Worng password.", Toast.LENGTH_SHORT).show();
        }
        }
    }
}
