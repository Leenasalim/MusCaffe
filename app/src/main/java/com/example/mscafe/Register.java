package com.example.mscafe;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Register extends AppCompatActivity {
    EditText name, registerEmail, registerPassword, confirmPassword;
    Button registration;
    TextView loginLink;
    ProgressBar pb;
    FirebaseAuth fba;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        fba = FirebaseAuth.getInstance();
        name = (EditText) findViewById(R.id.name1);
        registerEmail = (EditText) findViewById(R.id.email1);
        registerPassword = (EditText) findViewById(R.id.password1);
        confirmPassword = (EditText) findViewById(R.id.password2);
        registration = (Button) findViewById(R.id.register);
        loginLink = (TextView) findViewById(R.id.loginLink);
        pb=(ProgressBar) findViewById(R.id.progressBar3);

        registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registerNew();
            }
        });
        loginLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Register.this, LogIn.class);
                startActivity(intent);
                finish();
            }
        });
    }

    public void registerNew() {
        pb.setVisibility(View.VISIBLE);
        String username = name.getText().toString();
        String userEmail = registerEmail.getText().toString();
        String userPassword = registerPassword.getText().toString();
        String userConfirmPassword = confirmPassword.getText().toString();
        String reg = registration.getText().toString();
        String log = loginLink.getText().toString();
        if (TextUtils.isEmpty(userEmail)) {
            Toast.makeText(getApplicationContext(), "Enter email", Toast.LENGTH_LONG).show();
            ;
            return;
        }
        if (TextUtils.isEmpty(userPassword)) {
            Toast.makeText(getApplicationContext(), "Enter password", Toast.LENGTH_LONG).show();
            ;
            return;
        }
        fba.createUserWithEmailAndPassword(userEmail, userPassword).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    Toast.makeText(getApplicationContext(),
                            "register succeeded", Toast.LENGTH_LONG).show();
                    pb.setVisibility(View.VISIBLE);
                    Intent lt = new Intent(Register.this, LogIn.class);
                    startActivity(lt);
                } else {
                    Toast.makeText(getApplicationContext(),
                            "Failed , try again", Toast.LENGTH_LONG).show();
                    pb.setVisibility(View.GONE);
                }
            }
        });


    }}



