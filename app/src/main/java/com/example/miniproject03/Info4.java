package com.example.miniproject03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Info4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info4);

        Button next = findViewById(R.id.btn_info5);
        next.setOnClickListener(view -> {
            Utility.page(this, Info5.class);
        });


        Button backButton = findViewById(R.id.back4);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Info4.this, Info3.class);
                startActivity(intent);
            }
/**************************************************************************************/
        });
    }
}