package com.example.sedkol.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Ulrich D. on 12.01.17.
 */

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;


    public MyFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ChurchesFragment();
        } else {
            return new MuseumFragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0){
            return mContext.getString(R.string.category_churches);
        } else {
            return mContext.getString(R.string.category_Museums);
        }

    }
}
