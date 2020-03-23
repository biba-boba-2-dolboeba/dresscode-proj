package com.biba.boba.dresscode.screens.main_screen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.loader.app.LoaderManager;

import android.content.Intent;
import android.os.Bundle;

import com.biba.boba.dresscode.R;
import com.biba.boba.dresscode.screens.favorite_screen.FavoriteActivity;

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

    @Override
    public void finish()
    {
        super.finish();
        overridePendingTransition(R.anim.slide_in_down, R.anim.slide_out_up);
    }
}
