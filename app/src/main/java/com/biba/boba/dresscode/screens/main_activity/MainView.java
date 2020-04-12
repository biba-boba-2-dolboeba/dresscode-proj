package com.biba.boba.dresscode.screens.main_activity;

import androidx.fragment.app.Fragment;

interface MainView
{
    void loadActivity(Class loadActivity);
    void loadFragment(Fragment fragment);
}
