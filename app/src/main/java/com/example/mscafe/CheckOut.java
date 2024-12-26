package com.example.mscafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CheckOut extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_out);
        String drinkName = getIntent().getStringExtra("productName");
        String drinkPrice = getIntent().getStringExtra("productPrice");


        TextView drinkNameClick = findViewById(R.id.tvCheck);
        TextView drinkPriceClick = findViewById(R.id.tvCheck2);
        Button confirmClick = findViewById(R.id.bCheck);
        Button backMenuClick= findViewById(R.id.bCheckOrder);

        drinkNameClick.setText(drinkName);
        drinkPriceClick.setText("Price: " + drinkPrice);

        backMenuClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CheckOut.this,Menu.class);
                startActivity(intent);
                finish();

            }
        });

        confirmClick.setOnClickListener(v -> {
            Toast.makeText(CheckOut.this, "Order Confirmed: " + drinkName, Toast.LENGTH_SHORT).show();
        });

    }

    }
