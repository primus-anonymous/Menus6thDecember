package com.neocaptainnemo.menus6thdecember.navdrawer;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.neocaptainnemo.menus6thdecember.BaseNavFeatureFragment;
import com.neocaptainnemo.menus6thdecember.R;

public class FeatureThreeFragment extends BaseNavFeatureFragment {

    public FeatureThreeFragment() {
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
        return inflater.inflate(R.layout.fragment_feature_three, container, false);
    }
}