package com.app.yanhao.seek.ffragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.yanhao.seek.R;
import com.app.yanhao.seek.adapter.RecyclerViewAdapter;
import com.app.yanhao.seek.item.RecyclerViewItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yanhao on 17-1-15.
 */

public class FFragment extends Fragment {
    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment1,container,false);
        initView(view);
        return view;
    }

    private void initView(View view){
        recyclerView=(RecyclerView)view.findViewById(R.id.fragment_recyclerView);
        RecyclerViewItem item1=new RecyclerViewItem(null,"Item1");
        RecyclerViewItem item2=new RecyclerViewItem(null,"Item2");
        RecyclerViewItem item3=new RecyclerViewItem(null,"Item3");
        RecyclerViewItem item4=new RecyclerViewItem(null,"Item4");
        RecyclerViewItem item5=new RecyclerViewItem(null,"Item5");
        RecyclerViewItem item6=new RecyclerViewItem(null,"Item6");
        RecyclerViewItem item7=new RecyclerViewItem(null,"Item7");
        List<RecyclerViewItem> lists=new ArrayList<>();
        lists.add(item1);
        lists.add(item2);
        lists.add(item3);
        lists.add(item4);
        lists.add(item5);
        lists.add(item6);
        lists.add(item7);
        RecyclerViewAdapter adapter=new RecyclerViewAdapter(getContext(),lists);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);
    }
}
