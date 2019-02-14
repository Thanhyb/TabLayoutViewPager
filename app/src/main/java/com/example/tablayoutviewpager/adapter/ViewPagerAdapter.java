package com.example.tablayoutviewpager.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.tablayoutviewpager.fragment.Fragment1;
import com.example.tablayoutviewpager.fragment.Fragment2;
import com.example.tablayoutviewpager.fragment.Fragment3;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    public static final int INDEX_FRAGMENT0 = 0;
    public static final int INDEX_FRAGMENT1 = 1;
    public static final int INDEX_FRAGMENT2 = 2;

    public ViewPagerAdapter(FragmentManager fm) {
        super((fm));
    }

    @Override
    public Fragment getItem(int index) {
        switch (index) {
            case INDEX_FRAGMENT0:
                return new Fragment1();
            case INDEX_FRAGMENT1:
                return new Fragment2();
            case INDEX_FRAGMENT2:
                return new Fragment3();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
