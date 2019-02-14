package com.example.tablayoutviewpager;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.tablayoutviewpager.adapter.ViewPagerAdapter;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private ViewPagerAdapter mAdapter;
    private TabLayout mShowTbl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewPager = findViewById(R.id.showVpg);
        mShowTbl = findViewById(R.id.showTbl);
        mShowTbl.addTab(mShowTbl.newTab().setText(R.string.tab1));
        mShowTbl.addTab(mShowTbl.newTab().setText(R.string.tab2));
        mShowTbl.addTab(mShowTbl.newTab().setText(R.string.tab3));
        mShowTbl.setTabGravity(TabLayout.GRAVITY_FILL);
        mAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mAdapter);
        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mShowTbl));
        mShowTbl.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                mViewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
    }
}
