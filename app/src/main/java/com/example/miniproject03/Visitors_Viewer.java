package com.example.miniproject03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class Visitors_Viewer extends AppCompatActivity {
//    private DBHelper db;
//    private List<String> Visitor_List = new ArrayList<>();
//    private ArrayAdapter<String> adapter;
//    private Spinner spinnerList = findViewById(R.id.spin_visit);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visitors);

//        Visitor_List.clear();
//        Visitor_List.addAll(db.getVisitor("name"));
//        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, android.R.id.text1, Visitor_List);
//        spinnerList.setAdapter(adapter);
//        adapter.notifyDataSetChanged();

        findViewById(R.id.BACK).setOnClickListener(view -> {
            Utility.page(this, Home.class);
        });
    }
}