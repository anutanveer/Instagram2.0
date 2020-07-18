package com.anusha.instaapplication.Model;

public class Comment {
    private String comment;
    private String publisher;
    private String id;

    public Comment(String id,String comment, String publisher) {
        this.comment = comment;
        this.id=id;
        this.publisher = publisher;

    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }



    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}
