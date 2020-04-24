package com.biba.boba.dresscode.screens.main_activity.fragments.news_fragment.post_fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.biba.boba.dresscode.model.post_model.Post;
import com.biba.boba.dresscode.model.post_model.PostReader;

import java.util.ArrayList;


public class PostAdapter extends FragmentStatePagerAdapter
{
    private final PostReader postReader = new PostReader();

    public PostAdapter(@NonNull FragmentManager fm, int behavior)
    {
        super(fm, behavior);
        postReader.readAllPost();
    }


    @NonNull
    @Override
    public Fragment getItem(int position)
    {
        Bundle arguments = new Bundle();

        Post currentPost = postReader.getPosts().get(position);

        int currentImageProfile = currentPost.getProfileImage();
        String currentNameProfile = currentPost.getProfileName();
        String currentDescription = currentPost.getDescription();
        ArrayList<Integer> imageResourceId = currentPost.getImageResourceId();

        arguments.putInt(PostFragment.IMG_PROFILE, currentImageProfile);
        arguments.putString(PostFragment.NAME_PROFILE, currentNameProfile);
        arguments.putString(PostFragment.DESCRIPTION_POST, currentDescription);
        arguments.putIntegerArrayList(PostFragment.IMG_LIST, imageResourceId);

        PostFragment postFragment = new PostFragment();
        postFragment.setArguments(arguments);

        return postFragment;
    }

    @Override
    public int getCount() {
        return postReader.getPosts().size();
    }
}
