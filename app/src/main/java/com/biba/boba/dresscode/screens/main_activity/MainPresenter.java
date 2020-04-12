package com.biba.boba.dresscode.screens.main_activity;

import android.annotation.SuppressLint;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;

import androidx.annotation.NonNull;

import com.biba.boba.dresscode.R;
import com.biba.boba.dresscode.screens.main_activity.fragments.collage_construct_fragment.CollageConstructFragment;
import com.biba.boba.dresscode.screens.main_activity.fragments.news_fragment.NewsFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainPresenter implements BottomNavigationView.OnNavigationItemSelectedListener
{
    private MainView view;

    MainPresenter(MainView view)
    {
        this.view = view;
    }

    @SuppressLint("ResourceType")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem)
    {
        switch (menuItem.getItemId())
        {
            case R.id.calendar_page:
                return true;

            case R.id.wardrobe_page:
                return true;

            case R.id.profile_page:
                return true;

            case R.id.news_page:
                view.loadFragment(new NewsFragment());
                return true;

            case R.id.collage_construct_page:
                view.loadFragment(new CollageConstructFragment());
                return true;
        }

        return false;
    }

    void onDetachView()
    {
        view = null;
    }

}
