package com.dimitrov.androidfunctionality.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.dimitrov.androidfunctionality.R;

public class RelativeLayoutFragment extends Fragment {

    public RelativeLayoutFragment(){
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.relative_layout_fragment, container, false);
        return view;
    }
}
