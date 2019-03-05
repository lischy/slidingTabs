package com.example.ragnar.slidingtabs;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

class CustomAdapter extends BaseAdapter {

    Context c;
    ArrayList<Audio> audioList;
    LayoutInflater inflater;


    public CustomAdapter(Context c, ArrayList<Audio> audioList) {
        inflater = LayoutInflater.from(c);
        this.audioList = audioList;
    }

    @Override
    public int getCount() {
        return audioList.size();
    }

    @Override
    public Object getItem(int position) {
        return audioList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(inflater==null)
        {
            inflater= (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if(convertView==null)
        {
            convertView=inflater.inflate(R.layout.modelsongpicked,parent,false);
        }


        TextView titleTxt= (TextView) convertView.findViewById(R.id.songtitle);
        TextView nameTxt= (TextView) convertView.findViewById(R.id.artist_tx);

        final String name=audioList.get(position).getArtist();
        final String title=audioList.get(position).getTitle();

        nameTxt.setText(name);
        titleTxt.setText(title);

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(c,name, Toast.LENGTH_SHORT).show();
            }
        });

        return convertView;
    }
}
