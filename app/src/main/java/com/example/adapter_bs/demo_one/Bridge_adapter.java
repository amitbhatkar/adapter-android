package com.example.adapter_bs.demo_one;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.adapter_bs.R;

public class Bridge_adapter extends BaseAdapter {

    Context context;
    int[] data;
    LayoutInflater layoutInflater;
    Bridge_adapter(Context context, int[] data)
    {

        this.context=context;
        this.data=data;
        layoutInflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount()
    {
        return data.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @SuppressLint({"ViewHolder", "InflateParams"})
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        convertView=layoutInflater.inflate(R.layout.ui_gview,null);
        ImageView img_view=convertView.findViewById(R.id.img_view);
        img_view.setImageResource(data[position]);

        return convertView;
    }
}








