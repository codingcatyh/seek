package com.app.yanhao.seek.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by yanhao on 17-1-15.
 */

public class SeekFragmentAdapter extends FragmentPagerAdapter {
    private List<Fragment> lists;
    public SeekFragmentAdapter(FragmentManager fm, List<Fragment> lists) {
        super(fm);
        this.lists=lists;
    }

    @Override
    public Fragment getItem(int position) {
        return lists.get(position);
    }

    @Override
    public int getCount() {
        return lists.size();
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }
}
