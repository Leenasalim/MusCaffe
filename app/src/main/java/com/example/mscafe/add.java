package com.example.mscafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class add extends AppCompatActivity {
    TextView PageTitle;
    EditText AddName;
    Button AddClick,BackList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        PageTitle=findViewById(R.id.tvAddName);
        AddName=findViewById(R.id.etName);
        AddClick=findViewById(R.id.bAddItem);
        BackList=findViewById(R.id.bBackTo);
        BackList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(add.this, Admin.class);
                startActivity(intent);
                finish();
            }
        });
    }
}