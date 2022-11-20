package com.wahid.evaluasikelompok5;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
*/
public class ListFragment extends Fragment implements AdapterView.OnItemClickListener {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list,container,false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @androidx.annotation.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        String[]  data_name={ "SHEILA ON 7", "HIVI!", "VIERRATALE","D'MASIV","DEWA19"};

        ListView listView=(ListView)view.findViewById(R.id.lv_list);
        ArrayAdapter<String> adapter=new ArrayAdapter(getActivity(),
                android.R.layout.simple_list_item_1, data_name);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);

    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
        if (i == 0) {
            Intent intent = new Intent(view.getContext(), sheilaon7.class);
            startActivity(intent);
            Toast.makeText(getActivity(), "SHEILA ON 7", Toast.LENGTH_SHORT).show();
        }
        if (i == 1) {
            Intent intent = new Intent(view.getContext(), hivi.class);
            startActivity(intent);
            Toast.makeText(getActivity(), "HIVI!", Toast.LENGTH_SHORT).show();
        }
        if (i == 2) {
            Intent intent = new Intent(view.getContext(), vierra.class);
            startActivity(intent);
            Toast.makeText(getActivity(), "VIERRATALE", Toast.LENGTH_SHORT).show();
        }
        if (i == 3) {
            Intent intent = new Intent(view.getContext(), dmasiv.class);
            startActivity(intent);
            Toast.makeText(getActivity(), "D'MASIV", Toast.LENGTH_SHORT).show();
        }
        if (i == 4) {
            Intent intent = new Intent(view.getContext(), dewa19.class);
            startActivity(intent);
            Toast.makeText(getActivity(), "DEWA19", Toast.LENGTH_SHORT).show();
        }
    }
}

