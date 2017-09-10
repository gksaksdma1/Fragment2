package com.example.joon.fragment2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class ViewerFragment extends Fragment {
ImageView imageView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootview = (ViewGroup) inflater.inflate(R.layout.fragment_viewer,container,false);

        imageView = (ImageView) rootview.findViewById(R.id.imageView);

        return rootview;
    }

    public void setImage(int index) {
        if (index == 0) {
            imageView.setImageResource(R.drawable.dream01);
        } else if (index == 1) {
            imageView.setImageResource(R.drawable.dream02);
        } else if (index == 2) {
            imageView.setImageResource(R.drawable.dream03);
        }
    }
}
