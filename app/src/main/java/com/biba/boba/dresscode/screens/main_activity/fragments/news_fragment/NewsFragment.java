package com.biba.boba.dresscode.screens.main_activity.fragments.news_fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.biba.boba.dresscode.R;
import com.biba.boba.dresscode.screens.main_activity.fragments.news_fragment.post.PostFragment;


public class NewsFragment extends Fragment
{

    public NewsFragment()
    {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        if(savedInstanceState == null)
        {
            getChildFragmentManager().beginTransaction().replace(R.id.post_fragment_container,new PostFragment()).commit();
        }

        return inflater.inflate(R.layout.news_fragment,container,false);
    }
}
