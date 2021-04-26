package com.example.lab05_android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

public class HorizontalRecyclerViewActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView recyclerViewBook;
    private ProductListAdapter adapter;
    private BookListAdapter adapterBookList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horizontal_recycler_view);

        recyclerView = findViewById(R.id.recyclerViewHorizontal);
        recyclerViewBook = findViewById(R.id.recyclerViewGrid);

        adapter = new ProductListAdapter(this, ProductList.getInstance().getProducts());
        adapterBookList = new BookListAdapter(this, BookList.getInstance().getBooks());

        //Horizontal recycler view
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));

        //Horizontal recycler view books
        recyclerViewBook.setAdapter(adapterBookList);
        recyclerViewBook.setLayoutManager(new GridLayoutManager(this, 2, GridLayoutManager.HORIZONTAL, false));

    }
}