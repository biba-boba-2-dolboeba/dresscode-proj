package com.biba.boba.dresscode.presentation.main_screen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.biba.boba.dresscode.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity_layout);
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}
