package com.app.yanhao.seek.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.app.yanhao.seek.R;
import com.app.yanhao.seek.adapter.ViewPagerAdapter;
import com.app.yanhao.seek.ffragment.FFragment;

/**
 * Created by yanhao on 17-1-15.
 */

public class SeekFragmentPeo extends Fragment {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.seek_fragment_peo,container,false);
        initView(view);
        return view;
    }
    public void setMenuVisibility(boolean menuVisibility){
        super.setMenuVisibility(menuVisibility);
        if(this.getView()!=null){
            this.getView().setVisibility(menuVisibility ? View.VISIBLE:View.GONE);
        }
    }

    private void initView(View view){
        viewPager=(ViewPager) view.findViewById(R.id.fragment_viewPager);
        tabLayout=(TabLayout)view.findViewById(R.id.fragment_tabLayout);
        adapter=new ViewPagerAdapter(getFragmentManager());
        FFragment fFragment1=new FFragment();
        FFragment fFragment2=new FFragment();
        FFragment fFragment3=new FFragment();
        adapter.addFragment(fFragment1,"推荐");
        adapter.addFragment(fFragment2,"A区");
        adapter.addFragment(fFragment3,"B区");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabMode(TabLayout.MODE_FIXED);
    }
}
