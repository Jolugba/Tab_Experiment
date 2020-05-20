package com.tinuade.tabexperiment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PageAdapter extends FragmentStatePagerAdapter {

    int mNumOfTabs;

    /**
     * Constructor for {@link FragmentStatePagerAdapter}.
     * @param fm       fragment manager that will interact with this adapter
     * @param numOfTabs determines if only current fragments are in a resumed state
     */
    public PageAdapter(@NonNull FragmentManager fm, int numOfTabs) {
        super(fm, numOfTabs);
        this.mNumOfTabs=numOfTabs;
    }

    /**
     * Return the Fragment associated with a specified position.
     * @param position
     */
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:return new TabFragment1();
            case 1:return new TabFragment2();
            case 2:return new TabFragment3();
            default:return null;
        }
    }

    /**
     * Return the number of views available.
     */
    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
