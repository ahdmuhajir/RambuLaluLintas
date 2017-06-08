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

public class larangan  extends AppCompatActivity {
    final Context context = this;
    ListView list;
    String [] desc = {
            "rambu lalu lintas rambu larangan berjalan terus, wajib berhenti sesaat dan meneruskan perjalanan setelah mendapat kepastian aman meneruskan dari lalu lintas arah lainnya",
            "rambu lalu lintas rambu larangan berjalan terus apabila mengakibatkan rintangan/hambatan/gangguan bagi lalu lintas dari arah lain yang wajib didahulukan",
            "dilarang berjalan terus pada persilangan-persilangan sebidang kereta api jalur tunggal, wajib berhenti sesaat untuk mendapatkan kepastian keamanan. ",
            "berjalan terus pada persilangan-persilangan sebidang kereta api jalur ganda, wajib berhenti sesaat untuk mendapatkan kepastian keamanan.",
            "rambu lalu lintas rambu larangan berjalan terus, wajib berhenti sesaat dan meneruskan perjalanan setelah melaksanakan suatu kegiatan kewajiban tertentu ( contoh untuk pemeriksaan cukai).",
            "rambu laranganberjalan terus, wajib berhenti sesaat sebelum bagian jalan tertentu dan meneruskan perjalanan setelah mendahulukan kendaraan yang datang dari arah depan secara bersamaan.",
            "rambu larangan masuk bagi semua kendaraan bermotor maupun tidak bermotor dari kedua arah.",
            "rambu larangan masuk bagi semua kendaraan bermotor maupun tidak bermotor.",
            "rambu larangan masuk bagi kendaraan bermotor roda empat dan lebih.",
            "rambu larangan masuk bagi kendaraan bermotor roda tiga.",
            "rambu larangan masuk bagi kendaraan bermotor roda dua.",
            "rambu larangan masuk bagi kendaraan bermotor.",
            "rambu larangan masuk bagi bus.",
            "rambu larangan masuk bagi mobil barang.",
            "rambu larangan masuk bagi kendaraan bermotor dengan kereta gandeng.",
            "rambu larangan masuk bagi kendaraan bermotor dengan kereta temple.",
            "rambu larangan masuk bagi kendaraan untuk keperluan khusus antara lain forklift, penggilas jalan, traktor.",
            "rambu larangan masuk bagi delman dan sejenisnya.",
            "rambu larangan masuk bagi gerobak pedati dan sejenisnya.",
            "rambu larangan masuk bagi gerobak dorong dan sejenisnya.",
            "rambu larangan masuk bagi gerobak dan dokar.",
            "rambu larangan masuk bagi semua kendaraan tidak bermotor.",
            "rambu larangan masuk bagi sepeda.",
            "rambu larangan masuk bagi becak.",
            "rambu larangan masuk bagi sepeda dan becak.",
            "rambu larangan masuk bagi pejalan kaki.",
            "rambu larangan berhenti sampai jarak 15m dari pemasangan rambu menurut arah lalu lintas, kecuali dinyatakan lain dengan adanya papan tambahan.",
            "rambu larangan parker sampai jarak 15m dari pemasangan rambu menurut arah lalu lintas, kecuali dinyatakan lain dengan adanya papan tambahan.",
            "rambu larangan berbelok ke kiri bagi kendaraan bermotor maupun tidak bermotor untuk masuk jalan simpangan atau berpindah jalur searah lalu lintas.",
            "rambu larangan berbelok ke kanan bagi kendaraan bermotor maupun tidak bermotor untuk masuk jalan simpangan atau berpindah jalur searah lalu lintas.",
            "rambu larangan berbalik arah bagi bermotor maupun tidak bermotor",
            "rambu larangan mendahului kendaraan lain yang berjalan di depan.",
            "rambu larangan menggunakan isyarat suara.",
            "rambu larangan masuk bagi kendaraan panjang lebih dari …meter.",
            "rambu larangan masuk bagi kendaraan lebar lebih dari …meter.",
            "rambu larangan masuk bagi kendaraan tinggi lebih dari …meter.",
            "rambu larangan masuk bagi kendaraan tidak bermotor dengan panjang lebih dari ,.,.meter.",
            "rambu larangan masuk bagi kendaraan yang seluruh berat termasuk muatannya lebih dari 5ton.",
            "rambu larangan masuk bagi kendaraan dengan muatan sumbu lebih dari 8 ton.",
            "rambu larangan masuk bagi kendaraan dengan muatan sumbu terberat (mst) lebih besar dari 10 ton atau ukuran lebar tidak melebihi 2500 milimeter atau ukuran panjang tidak melebihi 1800 milimeter.",
            "rambu larangan masuk bagi kendaraan dengan muatan sumbu terberat (mst) lebih besar dari 8 ton atau ukuran lebar tidak melebihi 2500 milimeter atau ukuran panjang tidak melebihi 1800 milimeter.",
            "rambu larangan masuk bagi kendaraan dengan muatan sumbu terberat (mst) lebih besar dari 10 ton atau ukuran lebar tidak melebihi 2500 milimeter atau ukuran panjang tidak melebihi 1200 milimeter.",
            "rambu larangan masuk bagi kendaraan dengan muatan sumbu terberat (mst) lebih besar dari 10 ton atau ukuran lebar tidak melebihi 2100 milimeter atau ukuran panjang tidak melebihi 9000 milimeter.",
            "rambu larangan kecepatan kendaraan lebih dari 40km per jam.",
            "rambu larangan mengikuti kendaraan di depan kurang dari jarak 15meter.",
            "batas akhir kecepatan maksimum 40km perjam.",
            "batas akhir kendaraan mendahului kendaraan lain.",
            "batas akhir semua larangan setempat terhadap kendaraan bergerak.",
            "rambu larangan untuk mendahului."

    } ;
    Integer[] imageId = {

            R.drawable.lar1a,
            R.drawable.lar1b,
            R.drawable.lar1c,
            R.drawable.lar1d,
            R.drawable.lar1e,
            R.drawable.lar1f,
            R.drawable.lar2a,
            R.drawable.lar2b,
            R.drawable.lar3a,
            R.drawable.lar3b,
            R.drawable.lar3c,
            R.drawable.lar3d,
            R.drawable.lar3e,
            R.drawable.lar3f,
            R.drawable.lar3g,
            R.drawable.lar3h,
            R.drawable.lar3i,
            R.drawable.lar3j,
            R.drawable.lar3k,
            R.drawable.lar3l,
            R.drawable.lar3m,
            R.drawable.lar3n,
            R.drawable.lar3o,
            R.drawable.lar3p,
            R.drawable.lar3q,
            R.drawable.lar3r,
            R.drawable.lar4a,
            R.drawable.lar4b,
            R.drawable.lar5a,
            R.drawable.lar5b,
            R.drawable.lar5c,
            R.drawable.lar6,
            R.drawable.lar7,
            R.drawable.lar8a,
            R.drawable.lar8b,
            R.drawable.lar8c,
            R.drawable.lar8d,
            R.drawable.lar8e,
            R.drawable.lar8f,
            R.drawable.lar8g,
            R.drawable.lar8h,
            R.drawable.lar8i,
            R.drawable.lar8j,
            R.drawable.lar9,
            R.drawable.lar10,
            R.drawable.lar11a,
            R.drawable.lar11b,
            R.drawable.lar11c,
            R.drawable.lar12

    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_larangan);

        listAdapter adapter = new listAdapter(larangan.this,desc,imageId);
        list=(ListView) findViewById(R.id.larangan);
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
