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

public class peringatan extends AppCompatActivity {
    final Context context = this;
    ListView list;
    String [] desc = {
            "Tikungan ke kiri",
            "Tikungan ke kanan",
            "Tikungan tajam ke kiri",
            "Tikungan tajam ke kanan",
            "Tikungan Ganda, tikungan pertama ke kiri",
            "Tikungan Ganda, tikungan pertama ke kanan",
            "Banyak tikungan atau urutan beberapa tikungan, tikungan pertama ke kiri ",
            "Banyak tikungan atau urutan beberapa tikungan, tikungan pertama ke kanan",
            "Pengarah tikungan ke kanan",
            "Pengarah tikungan ke kiri",
            "Turunan",
            "Turunan curam",
            "Tanjakan",
            "Tanjakan terjal",
            "Penyempitan di kiri dan kanan jalan",
            "Penyempitan di kiri jalan",
            "Penyempitan di kanan jalan",
            "Jembatan atau penyempitan di jembatan",
            "Pengurangan lajur kiri",
            "Pengurangan lajur kanan",
            "Jembatan angkat",
            "Jalan menuju tepian air, tepian jurang",
            "Jalan tidak datar, bergelombang atau berbukit-bukit",
            "Jalan cembung atau jembatan cembung",
            "Jalan cekung",
            "Jalan licin",
            "Kerikil lepas",
            "Longsoran tanah atau batu yang berjatuhan dari sebelah kiri jalan",
            "Longsoran tanah atau batu yang berjatuhan dari sebelah kanan jalan",
            "Penyeberangan orang",
            "Banyak anak-anak",
            "Banyak orang bersepeda dan sering menyeberang jalan",
            "Banyak satwa jinak dan sering menyeberang jalan",
            "Banyak satwa liar dan sering menyeberang jalan",
            "Ada pekerjaan di jalan",
            "Lampu pengatur lalulintas",
            "Lintasan pesawat terbang",
            "Angin dari samping",
            "Lalulintas dua arah",
            "Awal bangunan pemisah untuk lalulintas dua arah",
            "Akhir bangunan pemisah untuk lalulintas dua arah",
            "Awal bangunan pemisah untuk lalulintas satu arah",
            "Persimpangan empat",
            "Persimpangan tiga sisi kiri",
            "Persimpangan tiga sisi kanan",
            "Persimpangan tiga serong kiri",
            "Persimpangan tiga serong kiri",
            "Persimpangan tiga serong kanan",
            "Persimpangan tiga serong kanan",
            "Persimpangan tiga tipe T",
            "Persimpangan tiga tipe Y",
            "Persimpangan ganda kiri kanan",
            "Persimpangan ganda kanan kiri",
            "Persimpangan tiga ganda kiri",
            "Persimpangan tiga ganda kanan",
            "Persimpangan tiga dengan prioritas",
            "Persimpangan tiga sisi kiri dengan prioritas",
            "Persimpangan tiga sisi kanan dengan prioritas",
            "Persimpangan tiga serong kiri dengan prioritas",
            "Persimpangan tiga serong kanan dengan prioritas",
            "Persimpangan bundaran dengan prioritas",
            "Tinggi ruang bebas … m",
            "Lebar ruang bebas … m",
            "Persilangan datar dengan lintasan kereta api berpintu",
            "Persilangan datar dengan lintasan kereta api tanpa pintu",
            "Hati-hati",
            "Rambu tambahan menyatakan jarak 450 m",
            "Rambu tambahan menyatakan jarak 300 m",
            "Rambu tambahan menyatakan jarak 150 m",
            "Peringatan tentang bahaya tanah longsor di musim hujan"


    } ;
    Integer[] imageId = {R.drawable.peringatan1a,
            R.drawable.peringatan1b,
            R.drawable.peringatan1c,
            R.drawable.peringatan1d,
            R.drawable.peringatan1e,
            R.drawable.peringatan1f,
            R.drawable.peringatan1g,
            R.drawable.peringatan1h,
            R.drawable.peringatan1i,
            R.drawable.peringatan1j,
            R.drawable.peringatan2a,
            R.drawable.peringatan2b,
            R.drawable.peringatan2c,
            R.drawable.peringatan2d,
            R.drawable.peringatan3a,
            R.drawable.peringatan3b,
            R.drawable.peringatan3c,
            R.drawable.peringatan3d,
            R.drawable.peringatan3e,
            R.drawable.peringatan3f,
            R.drawable.peringatan4,
            R.drawable.peringatan5,
            R.drawable.peringatan6a,
            R.drawable.peringatan6b,
            R.drawable.peringatan6c,
            R.drawable.peringatan7,
            R.drawable.peringatan8,
            R.drawable.peringatan9a,
            R.drawable.peringatan9b,
            R.drawable.peringatan10,
            R.drawable.peringatan11,
            R.drawable.peringatan12,
            R.drawable.peringatan13a,
            R.drawable.peringatan13b,
            R.drawable.peringatan14,
            R.drawable.peringatan15,
            R.drawable.peringatan16,
            R.drawable.peringatan17,
            R.drawable.peringatan18a,
            R.drawable.peringatan18b,
            R.drawable.peringatan18c,
            R.drawable.peringatan18d,
            R.drawable.peringatan19a,
            R.drawable.peringatan19b,
            R.drawable.peringatan19c,
            R.drawable.peringatan19d,
            R.drawable.peringatan19e,
            R.drawable.peringatan19f,
            R.drawable.peringatan19g,
            R.drawable.peringatan19h,
            R.drawable.peringatan19i,
            R.drawable.peringatan19j,
            R.drawable.peringatan19k,
            R.drawable.peringatan19l,
            R.drawable.peringatan19m,
            R.drawable.peringatan20a,
            R.drawable.peringatan20b,
            R.drawable.peringatan20c,
            R.drawable.peringatan20d,
            R.drawable.peringatan20e,
            R.drawable.peringatan20f,
            R.drawable.peringatan21a,
            R.drawable.peringatan21b,
            R.drawable.peringatan22a,
            R.drawable.peringatan22b,
            R.drawable.peringatan23,
            R.drawable.peringatan24a,
            R.drawable.peringatan24b,
            R.drawable.peringatan24c,
            R.drawable.peringatan25

    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peringatan);

        listAdapter adapter = new listAdapter(peringatan.this,desc,imageId);
        list=(ListView) findViewById(R.id.peringatan);
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
