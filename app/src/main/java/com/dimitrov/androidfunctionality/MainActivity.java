package com.dimitrov.androidfunctionality;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.dimitrov.androidfunctionality.LayoutsExample.LayoutsActivity;
import com.dimitrov.androidfunctionality.LayoutsExample.WidgetsActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button layoutsButton, widgetsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {
        layoutsButton = findViewById(R.id.btnLayout);
        widgetsButton = findViewById(R.id.btnWidgets);

        layoutsButton.setOnClickListener(this);
        widgetsButton.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.textViewWidget:
                Toast.makeText(this, "Textview Widget was pressed", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.editTextWidget:
                // Handle "Open" option click
                return true;
            case R.id.buttonWidget:
                // Handle "Save" option click
                return true;
            case R.id.radioButtonWidget:
                // Handle "Undo" option click
                return true;
            case R.id.checkboxWidget:
                // Handle "Redo" option click
                return true;
            case R.id.linearLayout:
                // Handle "Cut" option click
                return true;
            case R.id.constraintLayout:
                // Handle "Copy" option click
                return true;
            case R.id.relativeLayout:
                // Handle "Paste" option click
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onClick(View view) {
        switch  (view.getId()){
            case R.id.btnWidgets:
                startActivity(new Intent(MainActivity.this, WidgetsActivity.class));
                break;
            case R.id.btnLayout:
                startActivity(new Intent(MainActivity.this, LayoutsActivity.class));
                break;
        }
    }
}