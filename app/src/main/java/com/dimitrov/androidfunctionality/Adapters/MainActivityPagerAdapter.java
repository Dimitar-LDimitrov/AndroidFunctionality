package com.dimitrov.androidfunctionality.Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.dimitrov.androidfunctionality.Fragments.TabLayoutItems.LayoutsFragment;
import com.dimitrov.androidfunctionality.Fragments.TabLayoutItems.WidgetsFragment;

public class MainActivityPagerAdapter extends FragmentPagerAdapter {

    int numbersOfTabs;

    public MainActivityPagerAdapter(@NonNull FragmentManager fm, int numbersOfTabs) {
        super(fm);
        this.numbersOfTabs = numbersOfTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new WidgetsFragment();
            case 1:
                return new LayoutsFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numbersOfTabs;
    }

    @Override
    public int getItemPosition(Object object) {
        // discard the state of the fragment when switching tabs
        return POSITION_NONE;
    }

    @Override
    public CharSequence getPageTitle(int position)
    {
        String title = null;
        if (position == 0)
            title = "Widgets";
        else if (position == 1)
            title = "Layouts";
        return title;
    }
}
