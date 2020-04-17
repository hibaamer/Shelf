package com.example.shelf;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.shelf.Adapter.SearchAdapter;

import java.util.ArrayList;

public class Activity_main2 extends AppCompatActivity {
RecyclerView recyclerView ;
RecyclerView.LayoutManager layoutManager;
SearchAdapter adapter;
MaterialSearchBar materialSearchBar;
List<String> suggestList = new ArrayList<>();
Database database;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        recyclerView = (RecyclerView)findViewById(R.id.recycler_search);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        materialSearchBar=(MaterialSearchBar) findViewById(R.id.search_bar);
        database = new Database (this);
        materialSearchBar.setHint("Search");
        materialSearchBar.setCardViewElevation(10);
        loadSuggestList();






    }
    private  void loadSuggestList(){
        suggestList = database.get
    }
}
