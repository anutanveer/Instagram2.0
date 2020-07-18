package com.anusha.instaapplication.Model;

public class Post {

private String description;
private String imageurl;
private String publisher;
private String postid;

public Post(){
}

    public Post(String description, String imageurl,String postid, String publisher) {
        this.description = description;
        this.imageurl = imageurl;
        this.publisher = publisher;
        this.postid = postid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPostid() {
        return postid;
    }

    public void setPostid(String postid) {
        this.postid = postid;
    }
}

