package com.example.mscafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Admin extends AppCompatActivity {
    Button AddAdminPro1,DeleteAdminPro1,UpdateAdminPro1,LogOutAdmin1,BackHome1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        AddAdminPro1= findViewById(R.id.bAdd);
        DeleteAdminPro1=findViewById(R.id.bDelete);
        UpdateAdminPro1=findViewById(R.id.bUpdate);
        LogOutAdmin1=findViewById(R.id.bLogOut);
        BackHome1=findViewById(R.id.bBackHome);

        AddAdminPro1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Admin.this, add.class);
                startActivity(intent);
            }
        });
        DeleteAdminPro1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Admin.this, Delete.class);
                startActivity(intent);
            }
        });
        UpdateAdminPro1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Admin.this, Update.class);
                startActivity(intent);
            }
        });
        LogOutAdmin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Admin.this, LogOut.class);
                startActivity(intent);
            }
        });
        BackHome1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Admin.this, Homepage.class);
                startActivity(intent);
                finish();

            }
        });



    }
}