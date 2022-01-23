package com.example.demo.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("course")
public class CourseConfiguration {
    private String name;
    private String author;
    private int chapterCount;
    private int rating;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getChapterCount() {
        return chapterCount;
    }

    public void setChapterCount(int chapterCount) {
        this.chapterCount = chapterCount;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
