package com.example.mscafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LogOut extends AppCompatActivity {
    Button LoggingOutAdmin,AdList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_out);
        LoggingOutAdmin=findViewById(R.id.AdminLogOut);
        AdList=findViewById(R.id.bLogOutAdmin2);
        LoggingOutAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LogOut.this, MainActivity.class);
                startActivity(intent);
            }
        });
        AdList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LogOut.this, Admin.class);
                startActivity(intent);
            }
        });
 
    }
}