package com.wahid.evaluasikelompok5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class BandAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Band> bands;

    public void setHeroes(ArrayList<Band> heroes) {
        this.bands = bands;
    }

    public BandAdapter(Context context) {
        this.context = context;
        bands = new ArrayList<>();
    }

    @Override
    public int getCount() {
        return bands.size();
    }

    @Override
    public Object getItem(int i) {
        return bands.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_list,
                            viewGroup, false);
        }

        ViewHolder viewHolder = new ViewHolder(view);
        Band band = (Band) getItem(i);
        viewHolder.bind(band);
        return view;
    }

    private class ViewHolder {
        private TextView txtName;
        private TextView txtDescription;
        private ImageView imgPhoto;

        ViewHolder (View view) {
            txtName = view.findViewById(R.id.txt_name);
            txtDescription = view.findViewById(R.id.txt_description);
            imgPhoto = view.findViewById(R.id.img_photo);
        }
        void bind(Band band) {
            txtName.setText(band.getName());
            txtDescription.setText(band.getDescription());
            imgPhoto.setImageResource(band.getPhoto());
        }
    }
}

