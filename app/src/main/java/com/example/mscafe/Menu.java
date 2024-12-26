package com.example.mscafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class Menu extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Button homButton = findViewById(R.id.bHome1);
        homButton.setOnClickListener(v ->{
            Intent intent = new Intent(Menu.this,Homepage.class);
            startActivity(intent);
            finish();
        });

        Button orderSweetButton = findViewById(R.id.bSweet);
        orderSweetButton.setOnClickListener(v ->{
            Intent intent = new Intent(Menu.this, CheckOut.class);
            intent.putExtra("productName", "Cheese cake");
            intent.putExtra("productPrice", "4.50 OMR");
            startActivity(intent);

        });
        Button orderColdButton = findViewById(R.id.bCold);
        orderColdButton.setOnClickListener(v -> {
            Intent intent = new Intent(Menu.this, CheckOut.class);
            intent.putExtra("productName", "Iced Amricano");
            intent.putExtra("productPrice", "1.50 OMR");
            startActivity(intent);

        });
    }








    }
