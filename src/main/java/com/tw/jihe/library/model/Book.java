package com.tw.jihe.library.model;

public class Book {

    private String Name;

    private String author;

    private int publishedYear;

    public Book() {
    }

    public Book(String name, String author, int publishedYear) {
        Name = name;
        this.author = author;
        this.publishedYear = publishedYear;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    @Override
    public String toString(){
        return this.Name + "    " + this.author + "   " + this.publishedYear;
    }
}
