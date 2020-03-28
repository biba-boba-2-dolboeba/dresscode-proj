package com.biba.boba.dresscode.screens.main_screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.biba.boba.dresscode.R;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements MainView
{
    private MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity_layout);

        presenter = new MainPresenter(this);

        initAllViews();
    }

    private void initAllViews()
    {
        //BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigate_view);
        //bottomNavigationView.setSelectedItemId(R.id.main_page);

        //bottomNavigationView.setOnNavigationItemSelectedListener(presenter);
    }

    @Override
    public void loadActivity(Class loadActivity)
    {
        Intent intent = new Intent(getApplicationContext(),loadActivity);
        startActivity(intent);
        overridePendingTransition(0,0);
    }
}
