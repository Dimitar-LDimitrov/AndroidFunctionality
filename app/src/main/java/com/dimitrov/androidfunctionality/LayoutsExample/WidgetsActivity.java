package com.dimitrov.androidfunctionality.LayoutsExample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.dimitrov.androidfunctionality.Fragments.TextViewFragment;
import com.dimitrov.androidfunctionality.Fragments.EditTextFragment;
import com.dimitrov.androidfunctionality.Fragments.RadioButtonFragment;
import com.dimitrov.androidfunctionality.Fragments.CheckboxFragment;
import com.dimitrov.androidfunctionality.R;

public class WidgetsActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnTextView, btnEditText, btnRadioButton, btnCheckbox;

    TextViewFragment textViewFragment;
    EditTextFragment editTextFragment;
    RadioButtonFragment radioButtonFragment;
    CheckboxFragment checkBoxFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widgets);

        initView();
    }

    private void initView() {
        btnTextView = findViewById(R.id.btnTextView);
        btnEditText = findViewById(R.id.btnEditText);
        btnRadioButton = findViewById(R.id.btnRadioButton);
        btnCheckbox = findViewById(R.id.btnCheckboxButton);

        textViewFragment = new TextViewFragment();
        editTextFragment = new EditTextFragment();
        radioButtonFragment = new RadioButtonFragment();
        checkBoxFragment = new CheckboxFragment();

        btnTextView.setOnClickListener(this);
        btnEditText.setOnClickListener(this);
        btnRadioButton.setOnClickListener(this);
        btnCheckbox.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        switch (view.getId()){
            case R.id.btnTextView:
                transaction.replace(R.id.fragmentContainer, textViewFragment);
                transaction.commit();
                break;
            case R.id.btnEditText:
                transaction.replace(R.id.fragmentContainer, editTextFragment);
                transaction.commit();
                break;
            case R.id.btnRadioButton:
                transaction.replace(R.id.fragmentContainer, radioButtonFragment);
                transaction.commit();
                break;
            case R.id.btnCheckboxButton:
                transaction.replace(R.id.fragmentContainer, checkBoxFragment);
                transaction.commit();
                break;
        }
    }
}
