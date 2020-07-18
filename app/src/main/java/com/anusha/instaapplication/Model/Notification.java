package com.anusha.instaapplication.Model;

public class Notification {
    private String userid;
    private String postid;
    private String text;
    private boolean isPost;

    public Notification() {
    }


    public Notification(String userid, String postid, String text, boolean isPost) {
        this.userid = userid;
        this.postid = postid;
        this.text = text;
        this.isPost = isPost;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPostid() {
        return postid;
    }

    public void setPostid(String postid) {
        this.postid = postid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isIsPost() {
        return isPost;
    }

    public void setIsPost(boolean post) {
        isPost = post;
    }
}

