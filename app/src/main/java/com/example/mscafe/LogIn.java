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

public class LogIn extends AppCompatActivity {
    EditText email, pass;
    Button login,TakeHome;
    TextView link;
    ProgressBar bp;
    FirebaseAuth fb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);


        fb=FirebaseAuth.getInstance();
        email = (EditText) findViewById(R.id.email2);
        pass = (EditText) findViewById(R.id.password3);
        login = (Button) findViewById(R.id.Button2);
        link = (TextView) findViewById(R.id.tv1);
        TakeHome=(Button) findViewById(R.id.homePa);
        bp=(ProgressBar)findViewById(R.id.progressBar);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginToUserAccount();
            }
        });


        TakeHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LogIn.this ,Homepage.class);
                startActivity(intent);
                finish();
            }
        });


        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LogIn.this ,Register.class);
                startActivity(intent);
                finish();
            }
        });


    }

    public void loginToUserAccount(){
        bp.setVisibility(View.VISIBLE);
        String UserEmail = email.getText().toString();
        String UserPassword = pass.getText().toString();


        if (TextUtils.isEmpty(UserEmail)) {
            Toast.makeText(getApplicationContext(), "Please enter your correct email"
                    , Toast.LENGTH_SHORT).show();
            return;
        }
        if (TextUtils.isEmpty(UserPassword)) {
            Toast.makeText(getApplicationContext(), "Your Password is required",
                    Toast.LENGTH_SHORT).show();
            return;
        }

        fb.signInWithEmailAndPassword(UserEmail,UserPassword).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Toast.makeText(getApplicationContext(), "register is completed",
                            Toast.LENGTH_SHORT).show();
                    bp.setVisibility(View.VISIBLE);
                    Intent le=new Intent(LogIn.this, Homepage.class);
                    startActivity(le);
                }
                else {
                    Toast.makeText(getApplicationContext(),"failed,please try again",Toast.LENGTH_LONG).show();
                    bp.setVisibility(View.GONE);
                }
            }
        });
    }
}







