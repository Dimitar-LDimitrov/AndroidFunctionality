package com.dimitrov.androidfunctionality.Fragments.TabLayoutItems;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.dimitrov.androidfunctionality.Fragments.ConstraintLayoutFragment;
import com.dimitrov.androidfunctionality.Fragments.LinearLayoutFragment;
import com.dimitrov.androidfunctionality.Fragments.RelativeLayoutFragment;
import com.dimitrov.androidfunctionality.R;

public class LayoutsFragment extends Fragment implements View.OnClickListener{

    private Button btnLinearLayout, btnRelativeLayout, btnConstraintLayout;
    private FragmentTransaction transaction;

    public LayoutsFragment() {
        // Required empty public constructor
    }

    public static LayoutsFragment newInstance() {
        LayoutsFragment fragment = new LayoutsFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_layouts, container, false);

        initView(view);

        return view;
    }

    private void initView(View view) {

        btnLinearLayout = view.findViewById(R.id.btnLinearLayout);
        btnRelativeLayout = view.findViewById(R.id.btnRelativeLayout);
        btnConstraintLayout = view.findViewById(R.id.btnConstraintLayout);

        btnLinearLayout.setOnClickListener(this);
        btnRelativeLayout.setOnClickListener(this);
        btnConstraintLayout.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        transaction = getChildFragmentManager().beginTransaction();

        switch (view.getId()){
            case R.id.btnLinearLayout:
                LinearLayoutFragment linearLayoutFragment = new LinearLayoutFragment();
                transaction.replace(R.id.fragmentContainer, linearLayoutFragment);
                transaction.addToBackStack(null);
                transaction.commit();
                break;
            case R.id.btnRelativeLayout:
                RelativeLayoutFragment relativeLayoutFragment = new RelativeLayoutFragment();
                transaction.replace(R.id.fragmentContainer, relativeLayoutFragment);
                transaction.addToBackStack(null);
                transaction.commit();
                break;
            case R.id.btnConstraintLayout:
                ConstraintLayoutFragment constraintLayoutFragment = new ConstraintLayoutFragment();
                transaction.replace(R.id.fragmentContainer, constraintLayoutFragment);
                transaction.addToBackStack(null);
                transaction.commit();
                break;
            default:
                return;
        }
    }
}