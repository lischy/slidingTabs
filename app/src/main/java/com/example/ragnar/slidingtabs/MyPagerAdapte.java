package com.example.ragnar.slidingtabs;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

public class MyPagerAdapte extends FragmentStatePagerAdapter {

    ArrayList<Fragment> fragments=new ArrayList<>();

    int mNoOfTabs;

    public MyPagerAdapte(FragmentManager fm , int mNoOfTabs) {
        super(fm);
        this.mNoOfTabs=mNoOfTabs;
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                return new Tab1();
            case 1:
                return new Tab2();
            case 2:
                return new Tab3();
                default:
                    return null;
        }

    }

    @Override
    public int getCount() {
        return mNoOfTabs;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Tab 1";
            case 1:
                return "Tab 2";
            default:
                return null;
        }
    }
}
