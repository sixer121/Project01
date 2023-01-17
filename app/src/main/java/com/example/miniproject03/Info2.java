package com.example.miniproject03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Info2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info2);

        Button next = findViewById(R.id.btn_info3);
        next.setOnClickListener(view -> {
            Utility.page(this, Info3.class);
        });


        Button backButton = findViewById(R.id.back2);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Info2.this, Info.class);
                startActivity(intent);
            }
/**************************************************************************************/
        });
    }
}