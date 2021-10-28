package com.example.demo1.com.example.demo1.controller;

import com.example.demo1.com.example.com.example.bookrepo.bookrepository;
import com.example.demo1.com.example.modal.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class controller {

    @Autowired
    private bookrepository bookrepository;

    @PostMapping("/add")
    public String addbook(@RequestBody Book book) {
        bookrepository.save(book);
        return "add successfully";
    }

    @GetMapping("/findall")
    public List<Book> findallbook() {
          return bookrepository.findAll();
    }

    @GetMapping("/findID/{bookid}")
    public Optional<Book> getBook(@PathVariable int bookid){
        return bookrepository.findById(bookid);

    }
     @DeleteMapping("/delete/{bookid}")
    public String Deletebook(@PathVariable int bookid){
        bookrepository.deleteById(bookid);

        return "book deleted";
    }

    @PutMapping("/update/{bookid}")
    public Book UpdateBook(int bookid,Book book){

        Optional<Book> bk=bookrepository.findById(bookid);
        Book bk1=bk.get();
        bk1.setBookauthor(book.getBookauthor());
        bk1.setBook(book.getBook());
        bk1.setBookname(book.getBook());

        Book save = bookrepository.save(bk1);

        return  save;
    }

}
