package com.example.miniproject03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


/**************************************************************************************/

/** NEXT TO PAGE 01 BUTTON **/


        Button next1 = findViewById(R.id.btn_info);
        next1.setOnClickListener(view -> {
            Utility.page(this, Info.class);
        });

        Button next2 = findViewById(R.id.btn_visitors);
        next2.setOnClickListener(view -> {
            Utility.page(this, Visitors_Viewer.class);
        });


/** BACK TO HOME BUTTON **/
        Button backButton = findViewById(R.id.BACK);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, login.class);
                startActivity(intent);
            }
/**************************************************************************************/
        });
    }

}