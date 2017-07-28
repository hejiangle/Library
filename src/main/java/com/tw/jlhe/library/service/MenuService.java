package com.tw.jlhe.library.service;

import com.tw.jihe.library.model.Book;
import com.tw.jihe.library.model.Library;
import com.tw.jlhe.library.utils.OptionType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MenuService {

    private Library library;

    public MenuService(Library library) {
        this.library = library;
    }

    public List<String> showOptions(){
        List<String> optionList = new ArrayList<>();
        Arrays.stream(OptionType.values())
                .forEach(x -> optionList.add(x.getShowName()));
        return optionList;
    }

    public List<Book> excuteOption(OptionType selectedOption){
        switch (selectedOption){
            case ListBooks:
                return library.getBooks();
            case Quit:
                return null;
            default:
                throw new IllegalArgumentException("Select a valid option!");

        }
    }

    public Book getBookByName(String bookName){

        List<Book> books = library.getBooks();

        return books.stream()
                .filter(book -> bookName.equals(book.getName()))
                .findFirst()
                .get();
    }
}
