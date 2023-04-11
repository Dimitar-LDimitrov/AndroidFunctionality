package com.dimitrov.androidfunctionality;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.dimitrov.androidfunctionality.Adapters.MainActivityPagerAdapter;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity{

    TabLayout tabLayout;
    TabItem tabLayouts, tabWidgets;
    ViewPager viewPager;
    MainActivityPagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        pagerAdapter = new MainActivityPagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(pagerAdapter);
        // It is used to join TabLayout with ViewPager.
        tabLayout.setupWithViewPager(viewPager);
    }

    private void initViews() {
        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);
        tabWidgets = findViewById(R.id.tabWidgets);
        tabLayouts = findViewById(R.id.tabLayouts);
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
}