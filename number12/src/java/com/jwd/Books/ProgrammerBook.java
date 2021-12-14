package com.jwd.Books;

import java.util.Objects;

public class ProgrammerBook extends Book{

    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price, int isbn) {
        super(title, author, price, isbn);
    }

    @Override
    public String toString() {
        return "ProgrammerBook{" +
                "title ='" + title + '\'' +
                ", author ='" + author + '\'' +
                ", price =" + price + '\'' +
                ", edition = " + edition +
                "language='" + language + '\'' +
                ", level=" + level +
                '}';
    }

    @Override
    public boolean equals(Object obj){
        if(obj == this){
            return true;
        }
        if(obj == null || obj.getClass() != this.getClass()){
            return false;
        }

        ProgrammerBook book = (ProgrammerBook) obj;

        return (title == book.title || (title != null && title.equals(book.getTitle()))) &&
                (author == book.author || (author != null && author.equals(book.getTitle()))) &&
                (price == book.price) &&
                (language == book.language || (language != null && language.equals(book.getTitle()))) &&
                (level == book.level);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), language, level);
    }
}
