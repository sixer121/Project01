package com.example.miniproject03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Info3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info3);

        Button next = findViewById(R.id.btn_info4);
        next.setOnClickListener(view -> {
            Utility.page(this, Info4.class);
        });


        Button backButton = findViewById(R.id.back3);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Info3.this, Info2.class);
                startActivity(intent);
            }
/**************************************************************************************/
        });
    }
}