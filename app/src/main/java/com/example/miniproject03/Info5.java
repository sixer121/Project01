package com.example.miniproject03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Info5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info5);

        Button next = findViewById(R.id.btn_info6);
        next.setOnClickListener(view -> {
            Utility.page(this, Info6.class);
        });


        Button backButton = findViewById(R.id.back5);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Info5.this, Info4.class);
                startActivity(intent);
            }
/**************************************************************************************/
        });
    }
}