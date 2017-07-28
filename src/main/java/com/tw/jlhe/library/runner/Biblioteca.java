package com.tw.jlhe.library.runner;

import com.tw.jihe.library.model.Book;
import com.tw.jihe.library.model.Library;
import com.tw.jlhe.library.service.MenuService;
import com.tw.jlhe.library.utils.OptionType;

import java.util.Scanner;

public class Biblioteca {

    public static void main(String[] args) {
        String welcome = "******* Welcome to Biblioteca *******";

        System.out.println(welcome);
        System.out.println();

        Library biblioteca = new Library();
        MenuService menuService = new MenuService(biblioteca);

        String mention = "****** Which option you will chose? ******";

        System.out.println(mention);

        menuService.showOptions().forEach(x -> System.out.println("*** " + x + " ***"));

        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()) {
            String optionName = scanner.nextLine();

            switch (optionName) {
                case "List Books":
                    System.out.println("***Name***        ***Author***      ***PublishYear***");
                    menuService.excuteOption(OptionType.ListBooks)
                            .stream().forEach(book -> System.out.println(book.toString()));
                    System.out.println();
                    System.out.println("****** Which book you want to choose? ******");
                    break;
                case "Quit":
                    menuService.excuteOption(OptionType.Quit);
                    System.exit(0);
                    break;
                default:
                    System.out.println("Select a valid option!");
                    continue;
            }

            String bookName = scanner.nextLine();

            Book choosedBook = menuService.getBookByName(bookName);

            System.out.println("****** Here is the book information ******");

            System.out.println(choosedBook.toString());
            System.out.println("****** Which option you will chose? ******");
        }
    }
}
