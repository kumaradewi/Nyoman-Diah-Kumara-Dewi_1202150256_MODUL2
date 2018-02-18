package com.example.kumaradewi.nyomandiahkumara_1202150256_modul2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import java.util.LinkedList;

public class Menu extends AppCompatActivity {
    // untuk deklarasi objek
    private final LinkedList<String> foods = new LinkedList<>();
    private final LinkedList<Integer> priceses = new LinkedList<>();
    private final LinkedList<Integer> photos = new LinkedList<>();
    private int mCount = 0;

    private RecyclerView mRecyclerView;
    private MenuAdapter mAdapter;

    // method ketika dijalankan saat activity dibuat
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        dummiesData();
        // Get a handle to the RecyclerView.
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        // membuat adapter dan memanggil data yang akan ditampilkan
        mAdapter = new MenuAdapter(this, foods, priceses, photos);
        // menghubungkan adaptor dengan RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // memberikan RecyclerView sebagai pengelola tata letak default.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void dummiesData(){
        for (int i = 0;i < 3; i++){
            // memberi dan memanggil nama untuk data yang ditampilkan
            foods.add("Burger");
            foods.add("Bolognese");
            foods.add("Chicken wing");
            foods.add("Iga Bakar");
            foods.add("Sausage");

            // mamanggil harga
            priceses.add(30000);
            priceses.add(40000);
            priceses.add(35000);
            priceses.add(70000);
            priceses.add(25000);


            // memanggil foto yang ada di drawable
            photos.add(R.drawable.burger);
            photos.add(R.drawable.bolognese);
            photos.add(R.drawable.chicken_wing);
            photos.add(R.drawable.iga_bakar);
            photos.add(R.drawable.sausage);
        }
    }
}
