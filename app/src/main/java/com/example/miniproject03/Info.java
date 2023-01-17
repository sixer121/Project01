package com.example.miniproject03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);


        Button next = findViewById(R.id.btn_info2);
        next.setOnClickListener(view -> {
            Utility.page(this, Info2.class);
        });


        Button backButton = findViewById(R.id.back1);
        backButton.setOnClickListener(new View.OnClickListener()

            {
                @Override
                public void onClick (View view){
                Intent intent = new Intent(Info.this, Home.class);
                startActivity(intent);
            }

/**************************************************************************************/
        });

        Button back1Button = findViewById(R.id.back0);
        back1Button.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                Intent intent = new Intent(Info.this, Home.class);
                startActivity(intent);
            }
        });
    }
}