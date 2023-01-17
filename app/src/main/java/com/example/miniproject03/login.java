package com.example.miniproject03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText input_data = findViewById(R.id.input_name);
        Button submit_data = findViewById(R.id.btn_submit);
        Button submit_ano = findViewById(R.id.btn_ano);

        try(DBHelper db = new DBHelper(this)){
            submit_data.setOnClickListener(v -> {
                String data = input_data.getText().toString();
                if(data.equalsIgnoreCase("")){
                    input_data.setError("Please enter a name.");
                }else{
                    db.addVisitor(new Visitor(data, Utility.get_ts()));
                    input_data.setText("");
                    Utility.page(this, Home.class);
                }
            });
            submit_ano.setOnClickListener(v -> {
                db.addVisitor(new Visitor("Anonymous", Utility.get_ts()));
                input_data.setText("");
                Utility.page(this, Home.class);
            });
        }
    }
}