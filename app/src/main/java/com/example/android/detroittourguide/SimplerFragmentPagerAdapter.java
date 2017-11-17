package com.example.android.detroittourguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by eastm on 11/10/2017.
 */

public class SimplerFragmentPagerAdapter extends FragmentPagerAdapter {

    private String tabTitles[] = new String[]{"Restaurants", "Landmarks"};

    public SimplerFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

  if (position == 0){
   return new RestaurantsFragment();
    } else {
  return new LandmarksFragment();
  }
    }


        @Override
        public int getCount () {
            return 2;
        }

        @Override
        public CharSequence getPageTitle ( int position){
            return tabTitles[position];
        }

    }
