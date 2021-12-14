package com.jwd.main;

import com.jwd.Books.Book;
import com.jwd.Comparator.AuthorComparator;
import com.jwd.Comparator.PriceComparator;
import com.jwd.Comparator.TitleComparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {

    public static void sortWithComparator(ArrayList<Book> list, Comparator comparator){
        Comparator comparator1 = comparator;
        list.sort(comparator1);
        for (Book book:list) {
            System.out.println("\t" + book.toString());
        }
    }

    public static void main(String[] args) {

        TreeSet<Book> shelf = new TreeSet<>();

        Book book1 = new Book("", "", 100, 1);
        Book book2 = new Book("", "", 200, 2);
        Book book3 = new Book();
        try {
            book3 = book1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        Book book4 = new Book("", "" , 8238381, 3);
        shelf.add(book1);
        shelf.add(book2);
        shelf.add(book3);
        shelf.add(book4);

        System.out.println("Shelf:");

        for(Book book : shelf){
            System.out.println("\t" + book.toString());
        }

        if(book1.equals(book2)){
            System.out.println("Equals");
        } else {
            System.out.println("Not equals");
        }

        if(book2.hashCode() == book2.hashCode()){
            System.out.println("hash Equals");
        } else {
            System.out.println("hash Not equals");
        }

        ArrayList <Book> list = new ArrayList<>();
        list.add(book3);
        list.add(book2);
        list.add(book1);
        list.add(book4);

        System.out.println("\nSort by author");

        AuthorComparator authorComparator = new AuthorComparator();
        sortWithComparator(list, authorComparator);

        System.out.println("\nSort by price");

        PriceComparator priceComparator = new PriceComparator();
        sortWithComparator(list, priceComparator);

        System.out.println("\nSort by title");

        TitleComparator titleComparator = new TitleComparator();
        sortWithComparator(list, titleComparator);

    }

}
