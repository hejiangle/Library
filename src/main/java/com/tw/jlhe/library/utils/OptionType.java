package com.tw.jlhe.library.utils;

public enum OptionType {

    ListBooks("List Books"),
    Quit("Quit");

    private String showName;

    OptionType(String name){
        showName = name;
    }

    public String getShowName() {
        return showName;
    }
}
