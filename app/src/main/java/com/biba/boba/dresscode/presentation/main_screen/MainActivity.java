package com.biba.boba.dresscode.presentation.main_screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.biba.boba.dresscode.R;
import com.biba.boba.dresscode.presentation.favorite_screen.FavoriteActivity;

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

    }


    @Override
    public void loadActivity()
    {
        Intent intent = new Intent(this, FavoriteActivity.class);
        startActivity(intent);
    }
}
