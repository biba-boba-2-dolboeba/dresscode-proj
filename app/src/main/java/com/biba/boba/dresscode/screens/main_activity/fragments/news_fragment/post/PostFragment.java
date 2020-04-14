package com.biba.boba.dresscode.screens.main_activity.fragments.news_fragment.post;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.biba.boba.dresscode.R;

public class PostFragment extends Fragment {

    public PostFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {


        return inflater.inflate(R.layout.post_fragment,container,false);
    }

}
