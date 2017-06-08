package com.ahdmuhajir.rambulalulintas;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.ahdmuhajir.rambulalulintas.adapter.listAdapter;


/**
 * Created by ahdmuhajir on 31/05/17.
 */

public class semua extends AppCompatActivity {
    final Context context = this;
    ListView list;
    String [] desc = {
            "rambu lalu lintas rambu larangan berjalan terus, wajib berhenti sesaat dan meneruskan perjalanan setelah mendapat kepastian aman meneruskan dari lalu lintas arah lainnya",
            "rambu lalu lintas rambu larangan berjalan terus apabila mengakibatkan rintangan/hambatan/gangguan bagi lalu lintas dari arah lain yang wajib didahulukan",
            "dilarang berjalan terus pada persilangan-persilangan sebidang kereta api jalur tunggal, wajib berhenti sesaat untuk mendapatkan kepastian keamanan. ",
            "berjalan terus pada persilangan-persilangan sebidang kereta api jalur ganda, wajib berhenti sesaat untuk mendapatkan kepastian keamanan.",
            "rambu lalu lintas rambu larangan berjalan terus, wajib berhenti sesaat dan meneruskan perjalanan setelah melaksanakan suatu kegiatan kewajiban tertentu ( contoh untuk pemeriksaan cukai).",
            "rambu laranganberjalan terus, wajib berhenti sesaat sebelum bagian jalan tertentu dan meneruskan perjalanan setelah mendahulukan kendaraan yang datang dari arah depan secara bersamaan.",
            "rambu larangan masuk bagi semua kendaraan bermotor maupun tidak bermotor dari kedua arah."

    } ;
    Integer[] imageId = {
            R.drawable.larangan,
            R.drawable.peringatan,
            R.drawable.perintah,
            R.drawable.petunjuk,
            R.drawable.tambahan,
            R.drawable.larangan,
            R.drawable.petunjuk

    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semua_rambu);

        listAdapter adapter = new listAdapter(semua.this,desc,imageId);
        list=(ListView) findViewById(R.id.semuaRambu);
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
