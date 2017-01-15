package com.app.yanhao.seek.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yanhao on 17-1-15.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> fragmentLists=new ArrayList<>();
    private List<String> stringLists = new ArrayList<>();
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentLists.get(position);
    }

    @Override
    public int getCount() {
        return fragmentLists.size();
    }

    public void addFragment(Fragment fragment,String name){
        fragmentLists.add(fragment);
        stringLists.add(name);
    }

    public CharSequence getPageTitle(int position){
        return  stringLists.get(position);
    }
}
