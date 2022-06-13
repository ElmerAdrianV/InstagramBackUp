package com.elmeradrianv.instagramcloneapp;

import com.parse.ParseClassName;
import com.parse.ParseObject;

import java.io.File;
@ParseClassName("Post ")
public class Post extends ParseObject {
    private String description;
    private File image;
    private String userId;

    public Post() {
        super();
    }

    public Post(String description, String userId) {
        super();
        this.description = description;
        this.userId = userId;
    }

    public Post(String description, File image, String userId) {
        super();
        this.description = description;
        this.image = image;
        this.userId = userId;
    }
}
