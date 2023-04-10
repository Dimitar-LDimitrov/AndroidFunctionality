package com.dimitrov.androidfunctionality.LayoutsExample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.dimitrov.androidfunctionality.Fragments.ConstraintLayoutFragment;
import com.dimitrov.androidfunctionality.Fragments.LinearLayoutFragment;
import com.dimitrov.androidfunctionality.Fragments.RelativeLayoutFragment;
import com.dimitrov.androidfunctionality.R;

public class LayoutsActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnLinearLayout;
    Button btnRelativeLayout;
    Button btnConstraintLayout;
    LinearLayoutFragment linearLayoutFragment;
    RelativeLayoutFragment relativeLayoutFragment;
    ConstraintLayoutFragment constraintLayoutFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layouts);

        initViews();
    }

    private void initViews() {
        btnLinearLayout = findViewById(R.id.btnLinearLayout);
        btnRelativeLayout = findViewById(R.id.btnRelativeLayout);
        btnConstraintLayout = findViewById(R.id.btnConstraintLayout);

        linearLayoutFragment = new LinearLayoutFragment();
        relativeLayoutFragment = new RelativeLayoutFragment();
        constraintLayoutFragment = new ConstraintLayoutFragment();

        btnLinearLayout.setOnClickListener(this);
        btnRelativeLayout.setOnClickListener(this);
        btnConstraintLayout.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        switch (view.getId()){
            case R.id.btnLinearLayout:
                transaction.replace(R.id.fragmentContainer, linearLayoutFragment);
                transaction.commit();
                break;
            case R.id.btnRelativeLayout:
                transaction.replace(R.id.fragmentContainer, relativeLayoutFragment);
                transaction.commit();
                break;
            case R.id.btnConstraintLayout:
                transaction.replace(R.id.fragmentContainer, constraintLayoutFragment);
                transaction.commit();
                break;
        }
    }
}