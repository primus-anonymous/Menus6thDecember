package com.neocaptainnemo.menus6thdecember.navdrawer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;
import com.neocaptainnemo.menus6thdecember.R;

public class NavDrawerActivity extends AppCompatActivity implements NavDrawerHost {

    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav_drawer);

        if (savedInstanceState == null) {
            openFragment(new FeaatureOneFragment(), "FeaatureOneFragment");
        }

        drawer = findViewById(R.id.drawer);

        NavigationView navigationView = findViewById(R.id.navigation_view);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_one:

                        openFragment(new FeaatureOneFragment(), "FeaatureOneFragment");

                        drawer.closeDrawer(GravityCompat.START);
                        return true;

                    case R.id.action_two:
                        openFragment(new FeatureTwoFragment(), "FeatureTwoFragment");

                        drawer.closeDrawer(GravityCompat.START);
                        return true;

                    case R.id.action_three:
                        openFragment(new FeatureThreeFragment(), "FeatureThreeFragment");

                        drawer.closeDrawer(GravityCompat.START);
                        return true;


                }
                return false;
            }
        });
    }

    @Override
    public void supplyToolbar(Toolbar toolbar) {
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this,
                drawer,
                toolbar,
                R.string.nav_app_bar_open_drawer_description,
                R.string.nav_app_bar_navigate_up_description
        );

        drawer.addDrawerListener(toggle);

        toggle.syncState();

    }

    private void openFragment(Fragment fragment, String tag) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.feature_container, fragment, tag)
                .commit();
    }

}