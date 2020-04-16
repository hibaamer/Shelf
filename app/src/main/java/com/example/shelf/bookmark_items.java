package com.example.shelf;

public class bookmark_items {
    public int content_image;
    public String content_title;
    public String key_id;



    public bookmark_items(String title, String id, int image) {
    }

    public bookmark_items(int content_image, String content_title, String key_id){
        this.content_image=content_image;
        this.content_title=content_title;
        this.key_id=key_id;

    }

    public int getContent_image() {
        return content_image;
    }

    public void setContent_image(int content_image) {
        this.content_image = content_image;
    }

    public String getContent_title() {
        return content_title;
    }

    public void setContent_title(String content_title) {
        this.content_title = content_title;
    }

    public String getKey_id() {
        return key_id;
    }

    public void setKey_id(String key_id) {
        this.key_id = key_id;
    }


}
