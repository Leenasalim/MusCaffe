package com.example.mscafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Homepage extends AppCompatActivity {

    TextView press,tv;
    Button Logout,viewMen,AdminClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        press=(TextView) findViewById(R.id.ttV);
        tv=(TextView) findViewById(R.id.textView2);
        Logout=(Button) findViewById(R.id.button222);
        viewMen=(Button) findViewById(R.id.button22);
        AdminClick=findViewById(R.id.bAdmin);

        viewMen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Homepage.this, Menu.class);
                startActivity(intent);
            }
        });
        Logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Homepage.this, MainActivity.class);
                startActivity(intent);
            }
        });
        AdminClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Homepage.this, Admin.class);
                startActivity(intent);
                finish();
            }
        });

    }

    }





