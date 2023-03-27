package com.example.myrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyleview);

        List<item> items = new ArrayList<item>();

        items.add(new item("gina", "ghina@gmail.com", R.drawable.gambar3));
        items.add(new item("abu", "wak_abau@gmail.com", R.drawable.gambar2));
        items.add(new item("kila", "kila_1@gmail.com", R.drawable.gambar3));
        items.add(new item("jakni", "jani@gmail.com", R.drawable.gambar1));
        items.add(new item("suryanto", "wak_labu@gmail.com", R.drawable.sunok));
        items.add(new item("irwandi", "mak_lebam@gmail.com", R.drawable.images));
        items.add(new item("atankeling", "pak_itam@gmail.com", R.drawable.gambar1));
        items.add(new item("siti zubaidah", "makcik_kiitang@gmail.com", R.drawable.gambar2));
        items.add(new item("zainuddin", "long_tam@gmail.com", R.drawable.images));
        items.add(new item("kirana", "makcik_idah@gmail.com", R.drawable.gambar3));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new adaptercok(getApplicationContext(), items));
    }
}