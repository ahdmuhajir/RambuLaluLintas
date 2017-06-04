package com.ahdmuhajir.rambulalulintas.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.ahdmuhajir.rambulalulintas.R;
import com.ahdmuhajir.rambulalulintas.model.Rambu;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ahdmuhajir on 19/05/17.
 */

public class RambuAdapter extends BaseAdapter{
    private Context context;
    private int layout;
    private List<Rambu> rambu ;

    public RambuAdapter(Context context,int layout, List<Rambu> rambu) {
        this.context = context;
        this.layout= layout;
        this.rambu = rambu;
    }

    @Override
    public int getCount() {
        return rambu.size();
    }

    @Override
    public Object getItem(int position) {
        return rambu.get(position);
    }

    @Override
    public long getItemId(int position) {
        return rambu.get(position).getId();
    }

    private class ViewHolder{
        ImageView imageView;
        TextView description;
    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        View row = view;
        ViewHolder holder = new ViewHolder();

        if(row==null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row= inflater.inflate(layout,null);

            holder.imageView=(ImageView) row.findViewById(R.id.list_image);
            holder.description=(TextView) row.findViewById(R.id.artist);
            row.setTag(holder);
        }else{
            holder=(ViewHolder) row.getTag();
        }

        Rambu xrambu = rambu.get(position);
        byte[] sign_img = xrambu.getImage();
        Bitmap bitmap = BitmapFactory.decodeByteArray(sign_img,0,sign_img.length);
        holder.imageView.setImageBitmap(bitmap);

        holder.description.setText(xrambu.getDefenition());
        //View v = View.inflate(context, R.layout.item_list_rambu,null);
        //ImageView singPic = (ImageView)v.findViewById(R.id.sign_image);
        //TextView signDefenition= (TextView)v.findViewById(R.id.sing_def);
        //PIcture Here
        //signDefenition.setText(mRambu.get(position).getDefenition());
        return row;
    }
}
