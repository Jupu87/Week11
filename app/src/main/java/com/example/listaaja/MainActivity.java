package com.example.listaaja;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Storage storage;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        storage = Storage.getInstance();
        recyclerView = findViewById(R.id.rvItemList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ItemListAdapter(getApplicationContext(), storage.getitems()));
    }

    public void switchToAddStudent(View view) {
        Intent intent = new Intent(this, AddItemActivity.class);
        startActivity(intent);
    }

    public void switchToListItems(View view) {
        Intent intent = new Intent(this, ItemListActivity.class);
        startActivity(intent);
    }
}