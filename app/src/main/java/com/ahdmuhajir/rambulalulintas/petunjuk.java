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

public class petunjuk  extends AppCompatActivity {
    final Context context = this;
    ListView list;
    String [] desc = {"Rambu pendahulu petunjuk jurusan pada persimpangan di depan",
            "Rambu pendahulu petunjuk jurusan yang menunjuk arah daerah",
            "Rambu pendahulu petunjuk jurusan yang menentukan arah yang harus ditempuh pada suatu daerah",
            "Rambu pendahulu petunjuk jurusan yang menyatakan arah untuk mencapai suatu tempat keluar dari jalan Tol",
            "Rambu pendahulu petunjuk jurusan yang menyatakan lajur kiri yang harus dilewati untuk jurusan yang dituju",
            "Rambu pendahulu petunjuk jurusan yang menyatakan lajur kanan yang harus dilewati untuk jurusan yang dituju",
            "Rambu pendahulu petunjuk jurusan yang menyatakan adanya pilihan lajur sesuai jurusan pada persimpangan",
            "Rambu petunjuk jurusan Purwakarta dengan jarak 70 km",
            "Rambu petunjuk jurusan menuju jalan tol jagorawi",
            "Rambu petunjuk jurusan ke pelabuhan udara",
            "Rambu petunjuk jurusan untuk ke arah perkemahan",
            "Rambu petunjuk jurusan untuk wisata ke arah pesanggrahan pemuda",
            "Rambu petunjuk jurusan daerah wisata Dieng dengan jarak 10 km",
            "Rambu petunjuk jurusan ke daerah Taman Nasional",
            "Jalan ini menuju ke Tomohon 3 km dan ke Tondano 15 km",
            "Awal batas wilayah kota Kediri",
            "Keluar batas wilayah kota Kediri",
            "Awal batas wilayah jalan Tol Jagorawi",
            "Akhir batas wilayah jalan Tol Jagorawi",
            "Tempat penyeberangan orang",
            "Jalan satu arah kanan",
            "Jalan satu arah kiri",
            "Jalan satu arah lurus",
            "Rambu petunjuk tempat berbalik arah",
            "Jalan buntu",
            "Jalan buntu",
            "Jalan tol",
            "Batas akhir jalan tol",
            "Khusus kendaraan bermotor",
            "Batas akhir jalan yang khusus untuk kendaraan bermotor",
            "Tempat pemberhentian bus",
            "Awal lajur bus",
            "Bagian lajur yang dapat digunakan lalulintas lainnya",
            "Rambu yang menjelaskan bahwa akan memasuki jalan yang mempunyai lajur khusus bus",
            "Lajur bus searah dengan arah lalulintas",
            "Lajur bus berlawanan arah dengan arah lalulintas",
            "Akhir lajur bus",
            "Tempat pemberhentian kendaraan dengan lintas tetap (trem, kereta api, aero movel)",
            "Memasuki daerah penggunaan sabuk pengaman",
            "Mendapat prioritas atas lalulintas dari depan",
            "Tempat parkir",
            "Rumah Sakit",
            "Balai pertolongan pertama",
            "Bengkel perbaikan kendaraan",
            "Telepon umum",
            "Pompa bahan bakar",
            "Hotel/Motel",
            "Rumah makan",
            "Kedai kopi",
            "Tempat wisata",
            "Tempat berjalan kaki",
            "Tempat berkemah",
            "Tempat kereta kemah",
            "Tempat berkemah dan kereta kemah",
            "Pesanggrahan pemuda",
            "Rumah ibadat umat Islam",
            "Rumah ibadat umat Kristen",
            "Rumah Ibadat umat Hindu",
            "Rumah ibadat umat Budha",
            "Museum",
            "Stadion/Lapangan terbuka",
            "Lapangan gantole",
            "Gedung/bangsal olahraga",
            "Papan nama jalan"
    } ;
    Integer[] imageId = {
            R.drawable.pet1a,
            R.drawable.pet1b,
            R.drawable.pet1c,
            R.drawable.pet1d,
            R.drawable.pet1e,
            R.drawable.pet1f,
            R.drawable.pet1g,
            R.drawable.pet2a,
            R.drawable.pet2b,
            R.drawable.pet2c,
            R.drawable.pet2d,
            R.drawable.pet2e,
            R.drawable.pet2f,
            R.drawable.pet2g,
            R.drawable.pet3,
            R.drawable.pet4a,
            R.drawable.pet4b,
            R.drawable.pet4c,
            R.drawable.pet4d,
            R.drawable.pet5,
            R.drawable.pet6a,
            R.drawable.pet6b,
            R.drawable.pet6c,
            R.drawable.pet6d,
            R.drawable.pet6e,
            R.drawable.pet6f,
            R.drawable.pet6g,
            R.drawable.pet6h,
            R.drawable.pet6i,
            R.drawable.pet6j,
            R.drawable.pet6k,
            R.drawable.pet6l,
            R.drawable.pet6m,
            R.drawable.pet6n,
            R.drawable.pet6o,
            R.drawable.pet6p,
            R.drawable.pet6q,
            R.drawable.pet6r,
            R.drawable.pet6s,
            R.drawable.pet7,
            R.drawable.pet8,
            R.drawable.pet9a,
            R.drawable.pet9b,
            R.drawable.pet9c,
            R.drawable.pet9d,
            R.drawable.pet9e,
            R.drawable.pet9f,
            R.drawable.pet9g,
            R.drawable.pet9h,
            R.drawable.pet9i,
            R.drawable.pet9j,
            R.drawable.pet9k,
            R.drawable.pet9l,
            R.drawable.pet9m,
            R.drawable.pet9n,
            R.drawable.pet9p,
            R.drawable.pet9q,
            R.drawable.pet9r,
            R.drawable.pet9s,
            R.drawable.pet9t,
            R.drawable.pet9u,
            R.drawable.pet9v,
            R.drawable.pet9w
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petunjuk);

        listAdapter adapter = new listAdapter(petunjuk.this,desc,imageId);
        list=(ListView) findViewById(R.id.petunjuk);
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
