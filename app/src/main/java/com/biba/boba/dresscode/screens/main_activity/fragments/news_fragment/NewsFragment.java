package com.biba.boba.dresscode.screens.main_activity.fragments.news_fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;

import com.biba.boba.dresscode.R;
import com.biba.boba.dresscode.screens.main_activity.fragments.news_fragment.post_fragment.PostAdapter;
import com.biba.boba.dresscode.viewpager_vertical.VerticalViewPager;


public class NewsFragment extends Fragment
{

    public NewsFragment() {
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        PostAdapter postAdapter = new PostAdapter(getChildFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);

        VerticalViewPager viewPager = view.findViewById(R.id.post_viewPager);
        viewPager.setAdapter(postAdapter);
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.news_fragment,container,false);
    }

}
