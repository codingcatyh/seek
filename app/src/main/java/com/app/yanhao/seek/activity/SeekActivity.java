package com.app.yanhao.seek.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;

import com.app.yanhao.seek.R;
import com.app.yanhao.seek.adapter.SeekFragmentAdapter;
import com.app.yanhao.seek.fragment.SeekFragmentData;
import com.app.yanhao.seek.fragment.SeekFragmentPeo;
import com.app.yanhao.seek.fragment.SeekFragmentThing;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yanhao on 17-1-15.
 */

public class SeekActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private RelativeLayout container;
    private SeekFragmentAdapter seekFragmentAdapter;
    private SeekFragmentThing fragmentThing;
    private SeekFragmentPeo fragmentPeo;
    private SeekFragmentData fragmentData;
    private List<Fragment> lists;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seek);

        initView();
        initTab();

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener(){
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position=tab.getPosition();
                Fragment fragment=(Fragment)seekFragmentAdapter.instantiateItem(container,position);
                seekFragmentAdapter.setPrimaryItem(container,position,fragment);
                seekFragmentAdapter.finishUpdate(container);
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void initView(){
        tabLayout = (TabLayout)findViewById(R.id.seek_tabLayout);
        tabLayout.setTabMode(TabLayout.MODE_FIXED);
        container=(RelativeLayout)findViewById(R.id.seek_client);
        fragmentThing=new SeekFragmentThing();
        fragmentPeo=new SeekFragmentPeo();
        fragmentData=new SeekFragmentData();
        lists=new ArrayList<>();
        lists.add(fragmentThing);
        lists.add(fragmentPeo);
        lists.add(fragmentData);
        seekFragmentAdapter=new SeekFragmentAdapter(getSupportFragmentManager(),lists);
    }

    private void initTab(){
        TabLayout.Tab tab1=tabLayout.newTab();
        tab1.setText("寻物");
        tabLayout.addTab(tab1,0,true);
        TabLayout.Tab tab2=tabLayout.newTab();
        tab2.setText("寻人");
        tabLayout.addTab(tab2,false);
        TabLayout.Tab tab3=tabLayout.newTab();
        tab3.setText("信息");
        tabLayout.addTab(tab3,false);
    }
}
