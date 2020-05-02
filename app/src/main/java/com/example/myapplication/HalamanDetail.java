package com.example.myapplication;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class HalamanDetail extends AppCompatActivity {
    public static final String EXTRA_URL = "image_url";
    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_DETAIL = "extra_detail";
    public static final String EXTRA_NIM = "extra_nim";
    public static final String EXTRA_PROGDI = "extra_progdi";
    public static final String EXTRA_ANGKATAN = "extra_angkatan";
    public static final String EXTRA_NUMBER = "extra_number";
    private String title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_detail);

        TextView tvItemName = findViewById(R.id.tv_item_name);
        TextView tvItemDetail = findViewById(R.id.tv_item_detail);
        TextView tvItemNim = findViewById(R.id.tv_item_nim);
        TextView tvItemProgdi = findViewById(R.id.tv_item_progdi);
        TextView tvItemAngkatan = findViewById(R.id.tv_item_angkatan);
        TextView tvItemNumber = findViewById(R.id.tv_item_number);
        ImageView imgItemPhoto = findViewById(R.id.choose_item_photo);

        String name = getIntent().getStringExtra(EXTRA_NAME);
        String detail = getIntent().getStringExtra(EXTRA_DETAIL);
        String nim = getIntent().getStringExtra(EXTRA_NIM);
        String progdi = getIntent().getStringExtra(EXTRA_PROGDI);
        int angkatan = getIntent().getIntExtra(EXTRA_ANGKATAN, 0);
        int photo = getIntent().getIntExtra(EXTRA_URL, 0);
        String number = getIntent().getStringExtra(EXTRA_NUMBER);

        String heroname = "Nama : " + name;
        tvItemName.setText(heroname);

        String heronim = "Nim : " + nim;
        tvItemNim.setText(heronim);

        String heroprogdi = "Progdi : " + progdi;
        tvItemProgdi.setText(heroprogdi);

        String heroangkatan = "Angkatan : " + angkatan;
        tvItemAngkatan.setText(heroangkatan);

        String herodetail = "Deskripsi diri saya : \n" + detail;
        tvItemDetail.setText(herodetail);

        String numberdetail = "Telepone : " + number;
        tvItemNumber.setText(numberdetail);

        Glide.with(this)
                .load(photo)
                .apply(new RequestOptions().override(350, 550))
                .into(imgItemPhoto);


        title = "Biodata " + name;
        setActionBarTitle(title);

    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }
}
