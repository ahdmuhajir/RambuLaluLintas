package com.ahdmuhajir.rambulalulintas;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import com.ahdmuhajir.rambulalulintas.adapter.RambuAdapter;
import com.ahdmuhajir.rambulalulintas.database.DatabaseHelper;
import com.ahdmuhajir.rambulalulintas.model.Rambu;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by ahdmuhajir on 31/05/17.
 */

public class semua extends AppCompatActivity {
    ListView listView;
    List<Rambu> list;
    RambuAdapter adapter= null;
    DatabaseHelper helper;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semua_rambu);
        helper= new DatabaseHelper(this);
        listView = (ListView) findViewById(R.id.semuaRambu);
        list = new ArrayList<>();

        File database = getApplicationContext().getDatabasePath(DatabaseHelper.DBNAME);

        if (!database.exists()){
            helper.getReadableDatabase();
            if (CopyDB(this)){
                Toast.makeText(this,"Copy databases Success",Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(this,"Copy databases FAIL",Toast.LENGTH_SHORT).show();
                return;
            }

        }
        list=helper.getListData();
        adapter = new RambuAdapter(this, R.layout.item_list_rambu,list);
        listView.setAdapter(adapter);

    }
    private boolean CopyDB(Context context){
        try{
            InputStream inputStream = context.getAssets().open(DatabaseHelper.DBNAME);
            String outFilename = DatabaseHelper.DBLOCATION + DatabaseHelper.DBNAME;
            OutputStream outputStream = new FileOutputStream(outFilename);
            byte [] buff = new byte[1024];
            int length = 0;
            while ((length=inputStream.read(buff))>0){
                outputStream.write(buff,0,length);
            }
            outputStream.flush();
            outputStream.close();
            Log.w("MainActivity","DB COPIED");
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }

    }
}
