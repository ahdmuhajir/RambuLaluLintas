package com.ahdmuhajir.rambulalulintas;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.ahdmuhajir.rambulalulintas.adapter.listAdapter;

/**
 * Created by ahdmuhajir on 31/05/17.
 */

public class perintah  extends AppCompatActivity {
    final Context context = this;
    ListView list;
    String [] desc = {
            "Wajib mengikuti arah ke kiri",
            "Wajib mengikuti arah ke kanan",
            "Wajib mengikuti arah yang ditunjuk",
            "Wajib mengikuti arah yang ditunjuk",
            "Wajib berjalan lurus ke depan",
            "Wajib mengikuti arah yang ditentukan pada bundaran",
            "Wajib mengikuti salah satu arah yang ditunjuk",
            "Wajib mengikuti salah satu arah yang ditunjuk",
            "Lajur atau bagian jalan yang wajib dilewati",
            "Lajur atau bagian jalan yang wajib dilewati",
            "Wajib melewati salah satu lajur yang ditunjuk",
            "Wajib untuk pejalan kaki",
            "Wajib untuk lalulintas bersepeda",
            "Wajib untuk lalulintas becak",
            "Wajib untuk lalulintas pengendara berkuda",
            "Wajib untuk lalulintas dokar",
            "Wajib untuk lalulintas pedati",
            "Wajib untuk lalulintas pedati, gerobak dorong dan dokar",
            "Perintah kecepatan minimum yang diwajibkan",
            "Batas akhir kecepatan minumum yang diwajibkan",
            "Wajib memakai rantai pada ban",
            "Batas Ahkir memakai rantai pada ban"

    } ;
    Integer[] imageId = {
            R.drawable.perintahr01,
            R.drawable.perintahr02,
            R.drawable.perintahr03,
            R.drawable.perintahr04,
            R.drawable.perintahr05,
            R.drawable.perintahr06,
            R.drawable.perintahr07,
            R.drawable.perintahr08,
            R.drawable.perintahr09,
            R.drawable.perintahr10,
            R.drawable.perintahr11,
            R.drawable.perintahr12,
            R.drawable.perintahr13,
            R.drawable.perintahr14,
            R.drawable.perintahr15,
            R.drawable.perintahr16,
            R.drawable.perintahr17,
            R.drawable.perintahr18,
            R.drawable.perintahr19,
            R.drawable.perintahr20,
            R.drawable.perintahr21,
            R.drawable.perintahr22

    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perintah);

        listAdapter adapter = new listAdapter(perintah.this,desc,imageId);
        list=(ListView) findViewById(R.id.perintah);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.activity_dialogg);
                dialog.setTitle("Title...");

                // set the custom dialog components - text, image and button
                TextView text = (TextView) dialog.findViewById(R.id.text);
                text.setText(desc[+ position]);
                ImageView image = (ImageView) dialog.findViewById(R.id.image);
                image.setImageResource(imageId[+ position]);

                dialog.show();

            }
        });
    }
}
