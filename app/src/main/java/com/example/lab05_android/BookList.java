package com.example.lab05_android;

import java.util.Arrays;
import java.util.List;

public class BookList {
    private static BookList instance;
    private List<Book> books;

    public BookList() {
        books = Arrays.asList(
                new Book(R.drawable.you_can_you_will, "You can you will"),
                new Book(R.drawable.vua_kiem_tien_vua_du_lich, "Du lịch kiếm tiền"),
                new Book(R.drawable.muon_lam_ong_chu_gioi, "Ông chủ"),
                new Book(R.drawable.luong_giac, "Lượng giác"),
                new Book(R.drawable.hieu_long_con_tre_tuoi, "Hiểu lòng con trẻ"),
                new Book(R.drawable.suc_manh_phi_thuong, "Sức  mạnh phi thường"),
                new Book(R.drawable.huong_noi, "Hường nội"),
                new Book(R.drawable.tim_kiem_cai_toi, "Tim kiem cai toi"),
                new Book(R.drawable.start_up, "Start Up"),
                new Book(R.drawable.song_kho_so, "Sống khổ sở")
        );
    }

    public static BookList getInstance() {
        if(instance == null)
            instance = new BookList();

        return instance;
    }

    public List<Book> getBooks() {
        return books;
    }
}
