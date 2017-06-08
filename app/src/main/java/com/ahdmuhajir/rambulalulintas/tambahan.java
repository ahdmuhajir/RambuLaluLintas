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

public class tambahan extends AppCompatActivity {
    final Context context = this;
    ListView list;
    String [] desc = {
            "Jarak dari rambu sampai awal bagian jalan yang berbahaya atau awal daerah dimana peraturan berlaku, sebagaimana contoh dimaksud",
            "Panjang bagian jalan yang berbahaya atau panjang daerah dimana peraturan berlaku sebagaimana contoh dimaksud",
            "Berlakunya rambu sesuai arah panah ke kiri 10 meter",
            "Berlakunya rambu sesuai arah panah kiri dan kanan 10 meter",
            "Berlakunya rambu sesuai arah panah ke kanan 10 meter",
            "Berlakunya rambu sesuai dengan keterangan pada papan tambahan",
            "Awal berlakunya rambu sesuai arah panah lalulintas ke depan",
            "Pengulangan berlakunya rambu sesuai arah panah lalulintas ke depan dan ke belakang",
            "Akhir berlakunya rambu sesuai arah panah",
            "Berlakunya rambu sesuai waktu yang ditentukan",
            "Berlakunya rambu bagi semua kendaraan kecuali bus",
            "Papan tambahan untuk menegaskan jenis bahaya yang dimaksud table I no. 23 (hati-hati)",
            "Bentuk Rambu Nomor Rute Jalan Nasional",
            "Bentuk Rambu Nomor Rute Jalan Propinsi"


    } ;
    Integer[] imageId = {

            R.drawable.tambahan1,
            R.drawable.tambahan2,
            R.drawable.tambahan3,
            R.drawable.tambahan4,
            R.drawable.tambahan5,
            R.drawable.tambahan6,
            R.drawable.tambahan7,
            R.drawable.tambahan8,
            R.drawable.tambahan9,
            R.drawable.tambahan10,
            R.drawable.tambahan11,
            R.drawable.tambahan12,
            R.drawable.nomor13,
            R.drawable.nomor14

    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambahan);

        listAdapter adapter = new listAdapter(tambahan.this,desc,imageId);
        list=(ListView) findViewById(R.id.tambahan);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                //Toast.makeText(semua.this, "You Clicked at " +desc[+ position], Toast.LENGTH_SHORT).show();

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
