package com.neocaptainnemo.menus6thdecember;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import com.neocaptainnemo.menus6thdecember.navdrawer.NavDrawerHost;

public abstract class BaseNavFeatureFragment extends Fragment {

    public abstract int getToolbarId();

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        if (getActivity() instanceof NavDrawerHost) {
            Toolbar toolbar = view.findViewById(getToolbarId());

            ((NavDrawerHost) getActivity()).supplyToolbar(toolbar);
        }

    }
}
