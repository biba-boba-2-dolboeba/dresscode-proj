package com.biba.boba.dresscode.screens.news_screen;

import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;

import com.biba.boba.dresscode.R;
import com.biba.boba.dresscode.screens.main_screen.MainActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class NewsPresenter implements View.OnClickListener, BottomNavigationView.OnNavigationItemSelectedListener
{
    private final NewsView view;

    public NewsPresenter(NewsView view)
    {
        this.view = view;
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {

        }

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem)
    {
        switch (menuItem.getItemId())
        {
            case R.id.main_page:
                view.loadActivity(MainActivity.class);
                return true;

            case R.id.news_page:
                return true;
        }
        return false;
    }
}
