package com.example.mscafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Delete extends AppCompatActivity {
TextView DeleteProTitle;
EditText DeleteProName;
Button DeleteAll,BackLi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);
        DeleteProTitle=findViewById(R.id.delTitle11);
        DeleteProName=findViewById(R.id.DelPrice);
        DeleteAll=findViewById(R.id.DClick);
        BackLi=findViewById(R.id.AdminListBack);
        BackLi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Delete.this, Admin.class);
                startActivity(intent);
                finish();
            }
        });


    }
}