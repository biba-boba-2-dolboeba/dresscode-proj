package com.biba.boba.dresscode.screens.main_activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.biba.boba.dresscode.R;

import com.biba.boba.dresscode.screens.main_activity.fragments.news_fragment.NewsFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class MainActivity extends AppCompatActivity implements MainView
{
    private MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity_layout);

        presenter = new MainPresenter(this);

        initAllViews(savedInstanceState);
    }

    private void initAllViews(Bundle savedInstanceState)
    {
        if(savedInstanceState == null)
        {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new NewsFragment()).commit();
        }

        BottomNavigationViewEx bottomNavigationView = findViewById(R.id.bottom_navigate_view);
        bottomNavigationView.enableAnimation(true);
        bottomNavigationView.setOnNavigationItemSelectedListener(presenter);
    }

    @Override
    public void loadActivity(Class loadActivity)
    {
        Intent intent = new Intent(getApplicationContext(),loadActivity);
        startActivity(intent);
        overridePendingTransition(0,0);
    }

    @Override
    public void loadFragment(Fragment fragment)
    {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,fragment).commit();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onDetachView();
    }

}
