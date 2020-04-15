package com.example.shelf;

public class content_items {
        public int image_sourse;
        public String title;
        public String key_id;
        public String Bookmark_Status;



        public content_items() {
        }

        public content_items(int image_sourse, String title, String key_id, String Bookmark_Status) {
            this.image_sourse=image_sourse;
            this.title=title;
            this.key_id=key_id;
            this.Bookmark_Status=Bookmark_Status;
        }

        public int getImage_sourse() {
            return image_sourse;
        }

        public void setImage_sourse(int image_sourse) {
            this.image_sourse = image_sourse;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getKey_id() {
            return key_id;
        }

        public void setKey_id(String key_id) {
            this.key_id = key_id;
        }

    public String getBookmark_Status() {
        return Bookmark_Status;
    }

    public void setBookmark_Status(String bookmark_Status) {
        Bookmark_Status = bookmark_Status;
    }
    }


