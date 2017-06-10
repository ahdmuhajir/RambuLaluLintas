package com.ahdmuhajir.rambulalulintas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import com.ahdmuhajir.rambulalulintas.adapter.gridAdapter;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> basicFields;
    gridAdapter adapter;
    GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        basicFields = new ArrayList<>();
        //basicFields.add("SEMUA");
        basicFields.add("LARANGAN");
        basicFields.add("PERINTAH");
        basicFields.add("PERINGATAN");
        basicFields.add("PETUNJUK");
        basicFields.add("TAMBAHAN");
        gridView = (GridView)findViewById(R.id.grid);
        adapter = new gridAdapter(this,basicFields);
        gridView.setAdapter(adapter);

    }
}

