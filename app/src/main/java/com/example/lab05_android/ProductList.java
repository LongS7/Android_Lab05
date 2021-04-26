package com.example.lab05_android;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductList {
    private static ProductList instance;
    private List<Product> products;

    public ProductList() {
        products = Arrays.asList(
                new Product(R.drawable.giacchuyen, "Cáp chuyển từ Cổng USB sang PS2", 4.3f, 15, 69900, 39),
                new Product(R.drawable.daynguon, "Dây nguồn cổng HDMI và USB", 3.5f, 10, 59900, 15),
                new Product(R.drawable.dauchuyendoipsps2, "Cáp chuyển từ Cổng USB sang PS2", 4.7f, 19, 80000, 25),
                new Product(R.drawable.dauchuyendoi, "Cáp chuyển từ Cổng USB sang PS2", 4.3f, 15, 69900, 39),
                new Product(R.drawable.carbusbtops2, "Cáp ăng ten kết hợp USB", 3.5f, 5, 36000, 10),
                new Product(R.drawable.daucam, "Đầu cắm", 4.0f, 9, 48900, 32)
        );
    }

    public static ProductList getInstance() {
        if(instance == null)
            instance = new ProductList();

        return instance;
    }

    public List<Product> getProducts() {
        return products;
    }
}
