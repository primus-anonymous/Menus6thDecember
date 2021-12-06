package com.neocaptainnemo.menus6thdecember.navdrawer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import com.neocaptainnemo.menus6thdecember.BaseNavFeatureFragment;
import com.neocaptainnemo.menus6thdecember.R;

public class FeaatureOneFragment extends BaseNavFeatureFragment {


    public FeaatureOneFragment() {
        // Required empty public constructor
    }

    @Override
    public int getToolbarId() {
        return R.id.toolbar;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_feaature_one, container, false);
    }
}