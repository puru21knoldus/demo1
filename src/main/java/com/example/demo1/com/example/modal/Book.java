package com.example.demo1.com.example.modal;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "book")
public class Book {

    @Id
    private int bookid;
    private String book;
    private String bookname;
    private String bookauthor;

    public Book() {
    }

    public Book(int bookid, String book, String bookname, String bookauthor) {
        this.bookid = bookid;
        this.book = book;
        this.bookname = bookname;
        this.bookauthor = bookauthor;
    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getBookauthor() {
        return bookauthor;
    }

    public void setBookauthor(String bookauthor) {
        this.bookauthor = bookauthor;
    }
}

