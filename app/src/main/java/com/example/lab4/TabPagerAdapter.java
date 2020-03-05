package com.example.lab4;

import android.support.v4.app.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabPagerAdapter extends FragmentPagerAdapter {

    int tabCount;

    public TabPagerAdapter(FragmentManager fm, int numTabs) {
        super(fm);
        this.tabCount = numTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new DistanceFragment();
            case 1:
                return new TemperatureFragment();
            case 2:
                return new TipFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() { return tabCount; }
}