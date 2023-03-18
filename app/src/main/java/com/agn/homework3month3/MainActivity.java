package com.agn.homework3month3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.agn.homework3month3.reciclerView.ResturentAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList <String> arrayList;
    ResturentAdapter adapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initList();
    }

    private void initList() {
        arrayList = new ArrayList<>();
        arrayList.add("Plov");
        arrayList.add("Lagman");
        arrayList.add("Kurdak");
        arrayList.add("Borsh");
        arrayList.add("Sup");
        arrayList.add("Manty");
        arrayList.add("BestManty");
        arrayList.add("BeshBarmak");
        adapter = new ResturentAdapter(arrayList);

        recyclerView = findViewById(R.id.recycleView);
        recyclerView.setAdapter(adapter);
    }
}