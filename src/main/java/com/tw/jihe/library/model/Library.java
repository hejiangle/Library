package com.tw.jihe.library.model;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;

    public Library() {
        intialize();
    }

    public List<Book> getBooks() {
        return books;
    }

    private void intialize() {
        Book book = new Book("The Old Man and the Sea",
                "Ernest Miller Hemingway",
                1952);
        this.books = new ArrayList<Book>();
        books.add(book);
    }
}