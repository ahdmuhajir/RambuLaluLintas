package com.ahdmuhajir.rambulalulintas.adapter;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.support.v4.app.NotificationCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.ahdmuhajir.rambulalulintas.R;
import com.ahdmuhajir.rambulalulintas.larangan;
import com.ahdmuhajir.rambulalulintas.peringatan;
import com.ahdmuhajir.rambulalulintas.perintah;
import com.ahdmuhajir.rambulalulintas.petunjuk;
import com.ahdmuhajir.rambulalulintas.semua;
import com.ahdmuhajir.rambulalulintas.tambahan;

import java.util.ArrayList;


public class gridAdapter extends BaseAdapter {
    ArrayList names;
    public static Activity activity;

    public gridAdapter(Activity activity, ArrayList names) {
        this.activity = activity;
        this.names = names;
    }

    @Override
    public int getCount() {
        return names.size();
    }

    @Override
    public Object getItem(int position) {
        return names.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View v, ViewGroup parent) {
        if (v == null) {
            LayoutInflater vi = LayoutInflater.from(activity);
            v = vi.inflate(R.layout.item_list_menu, null);
        }
        TextView textView = (TextView)v.findViewById(R.id.namePlacer);
        ImageView imageView = (ImageView)v.findViewById(R.id.imageHolder);
        if(names.get(position).toString().equals("SEMUA"))
        {
            imageView.setImageResource(R.drawable.semua);
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent launchinIntent = new Intent(activity, semua.class);
                    activity.startActivity(launchinIntent);
                }
            });
            Animation anim = new ScaleAnimation(
                    0.95f, 1f, // Start and end values for the X axis scaling
                    0.95f, 1f, // Start and end values for the Y axis scaling
                    Animation.RELATIVE_TO_SELF, 0.5f, // Pivot point of X scaling
                    Animation.RELATIVE_TO_SELF, 0.5f); // Pivot point of Y scaling
            anim.setFillAfter(true); // Needed to keep the result of the animation
            anim.setDuration(2000);
            anim.setRepeatMode(Animation.INFINITE);
            anim.setRepeatCount(Animation.INFINITE);
            imageView.startAnimation(anim);

        }else if(names.get(position).toString().equals("LARANGAN"))
        {
            imageView.setImageResource(R.drawable.larangan);
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent launchinIntent = new Intent(activity, larangan.class);
                    activity.startActivity(launchinIntent);
                }
            });
            Animation anim = new ScaleAnimation(
                    0.95f, 1f, // Start and end values for the X axis scaling
                    0.95f, 1f, // Start and end values for the Y axis scaling
                    Animation.RELATIVE_TO_SELF, 0.5f, // Pivot point of X scaling
                    Animation.RELATIVE_TO_SELF, 0.5f); // Pivot point of Y scaling
            anim.setFillAfter(true); // Needed to keep the result of the animation
            anim.setDuration(2000);
            anim.setRepeatMode(Animation.INFINITE);
            anim.setRepeatCount(Animation.INFINITE);
            imageView.startAnimation(anim);

        }else if(names.get(position).toString().equals("PERINTAH"))
        {
            imageView.setImageResource(R.drawable.perintah);
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent launchinIntent = new Intent(activity, perintah.class);
                    activity.startActivity(launchinIntent);
                }
            });
            Animation anim = new ScaleAnimation(
                    0.95f, 1f, // Start and end values for the X axis scaling
                    0.95f, 1f, // Start and end values for the Y axis scaling
                    Animation.RELATIVE_TO_SELF, 0.5f, // Pivot point of X scaling
                    Animation.RELATIVE_TO_SELF, 0.5f); // Pivot point of Y scaling
            anim.setFillAfter(true); // Needed to keep the result of the animation
            anim.setDuration(2000);
            anim.setRepeatMode(Animation.INFINITE);
            anim.setRepeatCount(Animation.INFINITE);
            imageView.startAnimation(anim);

        }else if(names.get(position).toString().equals("PERINGATAN"))
        {
            imageView.setImageResource(R.drawable.peringatan);
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent launchinIntent = new Intent(activity, peringatan.class);
                    activity.startActivity(launchinIntent);
                }
            });
            Animation anim = new ScaleAnimation(
                    0.95f, 1f, // Start and end values for the X axis scaling
                    0.95f, 1f, // Start and end values for the Y axis scaling
                    Animation.RELATIVE_TO_SELF, 0.5f, // Pivot point of X scaling
                    Animation.RELATIVE_TO_SELF, 0.5f); // Pivot point of Y scaling
            anim.setFillAfter(true); // Needed to keep the result of the animation
            anim.setDuration(2000);
            anim.setRepeatMode(Animation.INFINITE);
            anim.setRepeatCount(Animation.INFINITE);
            imageView.startAnimation(anim);
        }
        else if(names.get(position).toString().equals("PETUNJUK"))
        {
            imageView.setImageResource(R.drawable.petunjuk);
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent launchinIntent = new Intent(activity, petunjuk.class);
                    activity.startActivity(launchinIntent);
                }
            });
            Animation anim = new ScaleAnimation(
                    0.95f, 1f, // Start and end values for the X axis scaling
                    0.95f, 1f, // Start and end values for the Y axis scaling
                    Animation.RELATIVE_TO_SELF, 0.5f, // Pivot point of X scaling
                    Animation.RELATIVE_TO_SELF, 0.5f); // Pivot point of Y scaling
            anim.setFillAfter(true); // Needed to keep the result of the animation
            anim.setDuration(2000);
            anim.setRepeatMode(Animation.INFINITE);
            anim.setRepeatCount(Animation.INFINITE);
            imageView.startAnimation(anim);
        }
        else if(names.get(position).toString().equals("TAMBAHAN"))
        {
            imageView.setImageResource(R.drawable.tambahan);
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent launchinIntent = new Intent(activity, tambahan.class);
                    activity.startActivity(launchinIntent);
                }
            });
            Animation anim = new ScaleAnimation(
                    0.95f, 1f, // Start and end values for the X axis scaling
                    0.95f, 1f, // Start and end values for the Y axis scaling
                    Animation.RELATIVE_TO_SELF, 0.5f, // Pivot point of X scaling
                    Animation.RELATIVE_TO_SELF, 0.5f); // Pivot point of Y scaling
            anim.setFillAfter(true); // Needed to keep the result of the animation
            anim.setDuration(2000);
            anim.setRepeatMode(Animation.INFINITE);
            anim.setRepeatCount(Animation.INFINITE);
            imageView.startAnimation(anim);
        }

        textView.setText(names.get(position).toString());
        return v;
    }
}
