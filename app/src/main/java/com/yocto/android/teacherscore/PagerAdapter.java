package com.yocto.android.teacherscore;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Andrew on 4/25/2018.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                TabStudent tabStudent = new TabStudent();
                return tabStudent;
            case 1:
                TabSubject tabSubject = new TabSubject();
                return tabSubject;
        }
            return null;
        }


    @Override
    public int getCount() {
        return 0;
    }
}
