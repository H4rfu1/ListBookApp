package com.kulitekno.listbook;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class detail extends AppCompatActivity {
    public static final String TITLE = "nothing";
    public static final String ISI = "falcon";
    public static final String penulis = "penulis";
    public static final String terbit = "9999";
    public static final String halaman = "999";
    public static final String genre = "nogenre";
    public static String img_data;
    TextView tvName, tvDetail, tvPenulis, tvTerbit, tvHalaman, tvGenre;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_view);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getData();
    }

    private void getData(){
        String judul = getIntent().getStringExtra(TITLE);
        String detailIsi = getIntent().getStringExtra(ISI);
        String pn = getIntent().getStringExtra(penulis);
        String tr = getIntent().getStringExtra(terbit);
        String hl = getIntent().getStringExtra(halaman);
        String gn = getIntent().getStringExtra(genre);
        int img = getIntent().getIntExtra(img_data,5);
        setImage(img);
        setIsi(judul, detailIsi, pn, hl, tr, gn);
        getSupportActionBar().setTitle(judul);
    }

    private void setImage(int img){
        ImageView imagePhoto = findViewById(R.id.image);
        Glide.with(this)
                .load(img)
                .into(imagePhoto);
    }

    private void setIsi(String judul, String detailIsi, String pn, String hl, String tr, String gn){
        tvName = findViewById(R.id.tv_item_name);
        tvDetail = findViewById(R.id.tv_item_detail);
        tvPenulis = findViewById(R.id.penulis);
        tvTerbit = findViewById(R.id.terbit);
        tvHalaman = findViewById(R.id.halaman);
        tvGenre = findViewById(R.id.genre);
        tvName.setText(judul);
        tvDetail.setText(detailIsi);
        tvPenulis.setText(pn);
        tvTerbit.setText(tr);
        tvHalaman.setText(hl);
        tvGenre.setText(gn);
    }
}
