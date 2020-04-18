package com.biba.boba.dresscode.model.post_model;

import com.biba.boba.dresscode.R;

import java.util.ArrayList;
import java.util.List;

public class PostReader
{
    private List<Post> posts = new ArrayList<>();

    public PostReader()
    {

    }

    public List<Post> readAllPost()
    {
        // в этом методе мы считываем все данные о постах из json файла

        List<Integer> dress = new ArrayList<>();
        dress.add(R.drawable.op1);
        dress.add(R.drawable.op2);
        dress.add(R.drawable.op3);
        dress.add(R.drawable.op4);

        Post post1 = new Post(R.drawable.ph1,"Yanus","на сколько оцените лук?",dress);
        Post post2 = new Post(R.drawable.ph2,"Nikitos","на мне фрэш",dress);
        Post post3 = new Post(R.drawable.ph3,"WLDRMND","Ебейший",dress);
        Post post4 = new Post(R.drawable.ph4,"Anya","ебаный курсач",dress);

        posts.add(post1);
        posts.add(post2);
        posts.add(post3);
        posts.add(post4);

        return posts;
    }

    public List<Post> getPosts()
    {
        return posts;
    }

    public void setPosts(List<Post> posts)
    {
        this.posts = posts;
    }
}
