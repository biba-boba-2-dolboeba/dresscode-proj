package com.biba.boba.dresscode.screens.news_screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.biba.boba.dresscode.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class NewsActivity extends AppCompatActivity implements NewsView
{
    private NewsPresenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_activity);

        presenter = new NewsPresenter(this);

        initAllView();
    }

    private void initAllView()
    {
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigate_view);
        bottomNavigationView.setSelectedItemId(R.id.news_page);

        bottomNavigationView.setOnNavigationItemSelectedListener(presenter);
    }


    @Override
    public void loadActivity(Class loadActivity)
    {
        Intent intent = new Intent(getApplicationContext(),loadActivity);
        startActivity(intent);
        overridePendingTransition(0,0);
    }



}
