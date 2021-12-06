package com.neocaptainnemo.menus6thdecember.bottomnav;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.neocaptainnemo.menus6thdecember.R;
import com.neocaptainnemo.menus6thdecember.navdrawer.FeaatureOneFragment;
import com.neocaptainnemo.menus6thdecember.navdrawer.FeatureThreeFragment;
import com.neocaptainnemo.menus6thdecember.navdrawer.FeatureTwoFragment;

public class BottomNavigationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);

        if (savedInstanceState == null) {
            openFragment(new FeaatureOneFragment(), "FeaatureOneFragment");
        }

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_one:

                        openFragment(new FeaatureOneFragment(), "FeaatureOneFragment");

                        return true;

                    case R.id.action_two:
                        openFragment(new FeatureTwoFragment(), "FeatureTwoFragment");

                        return true;

                    case R.id.action_three:
                        openFragment(new FeatureThreeFragment(), "FeatureThreeFragment");

                        return true;


                }

                return false;
            }
        });

    }

    private void openFragment(Fragment fragment, String tag) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.feature_container, fragment, tag)
                .commit();
    }

}