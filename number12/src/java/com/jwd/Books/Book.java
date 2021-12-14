package com.jwd.Books;

import java.util.Objects;

public class Book implements Comparable<Book> {
    protected String title;
    protected String author;
    protected int price;
    protected int isbn;
    protected static int edition;


    public Book(String title, String author, int price, int isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    public Book(){

    }

    @Override
    public String toString() {
        return "Book{" +
                "title ='" + title + '\'' +
                ", author ='" + author + '\'' +
                ", price =" + price + '\'' +
                ", edition = " + edition +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, price);
    }

    @Override
    public boolean equals(Object obj){
        if(obj == this){
            return true;
        }
        if(obj == null || obj.getClass() != this.getClass()){
            return false;
        }

        Book book = (Book)obj;

        return (title == book.title || (title != null && title.equals(book.getTitle()))) &&
                (author == book.author || (author != null && author.equals(book.getTitle()))) &&
                (price == book.price);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public int getEdition() {
        return edition;
    }

    public int getIsbn(){return isbn;}

    @Override
    public Book clone() throws CloneNotSupportedException {
        return new Book(title, author, price, isbn);
    }



    @Override
    public int compareTo(Book book) {
        if(this.isbn == book.getIsbn()){
            return 0;
        } else if(this.isbn < book.getIsbn()){
            return -1;
        } else {
            return 1;
        }
    }
}
