package com.example.mscafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Update extends AppCompatActivity {
    TextView UpdateAdmin;
    EditText UpdateProName,UpdateProPrice;
    Button UpdateAllPro,BackLis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);
        UpdateAdmin=findViewById(R.id.upPro);
        UpdateProName=findViewById(R.id.proName11);
        UpdateProPrice=findViewById(R.id.proPrice11);
        UpdateAllPro=findViewById(R.id.UpClick);
        BackLis=findViewById(R.id.AdminListBack);
        BackLis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Update.this,Admin.class);
                startActivity(intent);
                finish();

            }
        });
    }
}