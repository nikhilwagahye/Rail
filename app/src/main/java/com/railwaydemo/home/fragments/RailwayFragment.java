package com.railwaydemo.home.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.railwaydemo.R;
import com.railwaydemo.home.Util.GridSpacingItemDecoration;
import com.railwaydemo.home.Util.Utils;
import com.railwaydemo.home.adapter.RailwayCategoryAdapter;


public class RailwayFragment extends Fragment {


    private View rootView;
    private RecyclerView recyclerView;
    private RailwayCategoryAdapter railwayCategoryAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        rootView = inflater.inflate(R.layout.fragment_railway, container, false);

        initViews();
        return rootView;
    }


    private void initViews() {

        recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerView);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 2, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(gridLayoutManager);
        int spacing = (int) Utils.DpToPixel(getActivity(), 11); // 40px

        GridSpacingItemDecoration itemDecoration = new GridSpacingItemDecoration(2, spacing, true);
        recyclerView.addItemDecoration(itemDecoration);
        recyclerView.setNestedScrollingEnabled(false);


        railwayCategoryAdapter = new RailwayCategoryAdapter(getActivity(), 10);
        recyclerView.setAdapter(railwayCategoryAdapter);

    }


}
