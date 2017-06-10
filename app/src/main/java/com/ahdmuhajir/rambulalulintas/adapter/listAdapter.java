package com.ahdmuhajir.rambulalulintas.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.ahdmuhajir.rambulalulintas.R;

/**
 * Created by ahdmuhajir on 07/06/17.
 */

public class listAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] desc;
    private final Integer[] imageId;
    public listAdapter(Activity context, String[] desc, Integer[] imageId) {
        super(context, R.layout.item_list_rambu, desc);
        this.context = context;
        this.desc = desc;
        this.imageId = imageId;
    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.item_list_rambu, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.artist);

        ImageView imageView = (ImageView) rowView.findViewById(R.id.list_image);
        if (desc[position].length()<50){
            txtTitle.setText(desc[position]);
        }else {
            String zz=desc[position].substring(1,50)+"...";
            txtTitle.setText(zz);
        }

        imageView.setImageResource(imageId[position]);
        return rowView;
    }
}
