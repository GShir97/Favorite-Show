package com.example.favshow;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;

    private ArrayList<CharactersData> dataSet;
    private customAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.SpongBobChar);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        dataSet = new ArrayList<>();

        recyclerView.setItemAnimator(new DefaultItemAnimator());

        for (int i=0; i < myData.nameArray.length; i++){
            dataSet.add(new CharactersData(
                    myData.nameArray[i],
                    myData.description[i],
                    myData.drawableArray[i]
            ));
        }

        adapter = new customAdapter(dataSet);
        recyclerView.setAdapter(adapter);
    }
}