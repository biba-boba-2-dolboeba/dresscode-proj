package com.biba.boba.dresscode.screens.main_activity.fragments.news_fragment.post_fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.biba.boba.dresscode.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class PostFragment extends Fragment
{
    static final String IMG_PROFILE = "image_profile";
    static final String NAME_PROFILE = "name_profile";
    static final String DESCRIPTION_POST = "description_post";


    public PostFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.post_fragment,container,false);

        Bundle arguments = getArguments();
        if(arguments != null)
        {
            int imageViewProfile = arguments.getInt(IMG_PROFILE);
            String nameProfile = arguments.getString(NAME_PROFILE);
            String descriptionPost = arguments.getString(DESCRIPTION_POST);

            displayValues(view, imageViewProfile, nameProfile, descriptionPost);
        }

        return view;
    }

    private void displayValues(View v, int imageViewProfile, String nameProfile, String descriptionPost)
    {
        CircleImageView postProfileCircleImage = v.findViewById(R.id.profile_image);
        TextView postNameProfile = v.findViewById(R.id.profile_name);
        TextView postDescription = v.findViewById(R.id.description);

        postProfileCircleImage.setImageResource(imageViewProfile);

        postNameProfile.setText("@"+nameProfile);
        postDescription.setText(descriptionPost);
    }

}
