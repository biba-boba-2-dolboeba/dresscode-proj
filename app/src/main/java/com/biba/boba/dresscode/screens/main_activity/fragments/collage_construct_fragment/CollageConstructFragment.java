package com.biba.boba.dresscode.screens.main_activity.fragments.collage_construct_fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.biba.boba.dresscode.R;

public class CollageConstructFragment extends Fragment
{
    public CollageConstructFragment()
    {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.collage_constructor_fragment,container,false);
    }

}
