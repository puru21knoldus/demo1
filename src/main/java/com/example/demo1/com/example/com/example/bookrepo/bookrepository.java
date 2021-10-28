package com.example.demo1.com.example.com.example.bookrepo;

import com.example.demo1.com.example.modal.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface bookrepository extends MongoRepository<Book,Integer>
{

}
