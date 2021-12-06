package com.neocaptainnemo.menus6thdecember.navdrawer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.PopupMenu;
import androidx.fragment.app.Fragment;

import com.neocaptainnemo.menus6thdecember.BaseNavFeatureFragment;
import com.neocaptainnemo.menus6thdecember.R;

public class FeatureTwoFragment extends BaseNavFeatureFragment {


    public FeatureTwoFragment() {
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
        return inflater.inflate(R.layout.fragment_feature_two, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.click_area).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(requireContext(), v);

                requireActivity().getMenuInflater().inflate(R.menu.menu_main, popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.action_add:
                                Toast.makeText(requireContext(), "Add", Toast.LENGTH_SHORT).show();
                                return true;

                            case R.id.action_delete:
                                Toast.makeText(requireContext(), "Delete", Toast.LENGTH_SHORT).show();
                                return true;

                        }

                        return false;
                    }
                });

                popupMenu.show();
            }
        });
    }
}