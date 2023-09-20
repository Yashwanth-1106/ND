package com.example.test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainRec extends AppCompatActivity {
    ArrayList<Data> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_rec);

        RecyclerView recyclerView = findViewById(R.id.rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrayList.add(new Data("Yash",R.drawable.baseline_perm_contact_calendar_24));
        arrayList.add(new Data("Yash",R.drawable.baseline_perm_contact_calendar_24));
        arrayList.add(new Data("Yash",R.drawable.baseline_perm_contact_calendar_24));
        arrayList.add(new Data("Yash",R.drawable.baseline_perm_contact_calendar_24));
        arrayList.add(new Data("Yash",R.drawable.baseline_perm_contact_calendar_24));
        arrayList.add(new Data("Yash",R.drawable.baseline_perm_contact_calendar_24));
        arrayList.add(new Data("Yash",R.drawable.baseline_perm_contact_calendar_24));
        arrayList.add(new Data("Yash",R.drawable.baseline_perm_contact_calendar_24));
        arrayList.add(new Data("Yash",R.drawable.baseline_perm_contact_calendar_24));
        arrayList.add(new Data("Yash",R.drawable.baseline_perm_contact_calendar_24));
        arrayList.add(new Data("Yash",R.drawable.baseline_perm_contact_calendar_24));
        arrayList.add(new Data("Yash",R.drawable.baseline_perm_contact_calendar_24));
        arrayList.add(new Data("Yash",R.drawable.baseline_perm_contact_calendar_24));
        arrayList.add(new Data("Yash",R.drawable.baseline_perm_contact_calendar_24));


        MyAdapter myAdapter = new MyAdapter(arrayList);

        recyclerView.setAdapter(myAdapter);





    }
}