package com.example.lab05_android;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BookListAdapter extends RecyclerView.Adapter<BookListAdapter.BookViewHolder> {
    private Context context;
    private List<Book> books;

    public BookListAdapter(Context context, List<Book> books) {
        this.context = context;
        this.books = books;
    }

    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.book_item, parent, false);

        return new BookViewHolder(itemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull BookViewHolder holder, int position) {
        holder.tvName.setText(books.get(position).getName());
        holder.ivProduct.setImageResource(books.get(position).getPhoto());
    }

    @Override
    public int getItemCount() {
        return books.size();
    }

    class BookViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView tvName;
        ImageView ivProduct;
        BookListAdapter adapter;

        public BookViewHolder(View itemView, BookListAdapter adapter) {
            super(itemView);
            this.adapter = adapter;
            tvName = itemView.findViewById(R.id.product_name);
            ivProduct = itemView.findViewById(R.id.image);

            itemView.setClickable(true);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int pos = getLayoutPosition();
            Log.d("Long", books.get(pos).getName());
        }
    }
}
