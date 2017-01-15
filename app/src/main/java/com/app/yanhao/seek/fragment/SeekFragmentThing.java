package com.app.yanhao.seek.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.yanhao.seek.R;

/**
 * Created by yanhao on 17-1-15.
 */

public class SeekFragmentThing extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.seek_fragment_thing,container,false);
        return view;
    }
    public void setMenuVisibility(boolean menuVisibility){
        super.setMenuVisibility(menuVisibility);
        if(this.getView()!=null){
            this.getView().setVisibility(menuVisibility ? View.VISIBLE:View.GONE);
        }
    }
}
