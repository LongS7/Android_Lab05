package com.example.lab05_android;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProductListAdapter extends RecyclerView.Adapter<ProductListAdapter.ProductViewHolder> {
    private Context context;
    private List<Product> products;

    public ProductListAdapter(Context context, List<Product> products) {
        this.context = context;
        this.products = products;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.item, parent, false);

        return new ProductViewHolder(itemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        holder.tvName.setText(products.get(position).getName());
        holder.tvPrice.setText(String.valueOf(products.get(position).getPrice()));
        holder.tvNumOfRating.setText(products.get(position).getNumOfRating() + "");
        holder.tvDiscount.setText(products.get(position).getDiscountPercent() + "%");
        holder.rating.setRating(products.get(position).getRating());
        holder.ivProduct.setImageResource(products.get(position).getPhoto());
    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView tvName;
        TextView tvPrice;
        TextView tvNumOfRating;
        TextView tvDiscount;
        RatingBar rating;
        ImageView ivProduct;
        ProductListAdapter adapter;

        public ProductViewHolder(View itemView, ProductListAdapter adapter) {
            super(itemView);
            this.adapter = adapter;
            tvName = itemView.findViewById(R.id.product_name);
            tvPrice = itemView.findViewById(R.id.price);
            tvNumOfRating = itemView.findViewById(R.id.numOfRating);
            tvDiscount = itemView.findViewById(R.id.discount);
            rating = itemView.findViewById(R.id.rating);
            ivProduct = itemView.findViewById(R.id.image);

            itemView.setClickable(true);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int pos = getLayoutPosition();
            Log.d("Long", products.get(pos).getName());
        }
    }
}
