package com.example.ubay.achmadirjikubay_1202154184_modul3;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.DrawableRes;

/**
 * Created by black on 2/25/2018.
 */

public class air {
    private String judul;
    private String info;
    private int gambar;
    static final String TITLE_KEY="Judul";
    static final String IMAGE_KEY="Gambar";
    public air(String judul,String info,int gambar){
        this.judul=judul;
        this.info=info;
        this.gambar=gambar;
    }

    public int getGambar(){
        return gambar;
    }
    public String getInfo() {
        return info;
    }

    public String getJudul() {
        return judul;
    }

    public static Intent starter(Context context, String title, @DrawableRes int imageResId) {
        Intent detailIntent = new Intent(context, detail.class);
        detailIntent.putExtra(TITLE_KEY, title);
        detailIntent.putExtra(IMAGE_KEY, imageResId);

        return detailIntent;
    }
}
