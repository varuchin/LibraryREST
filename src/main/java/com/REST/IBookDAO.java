package com.REST;

import java.util.List;

/**
 * Created by varuchin on 24.11.2015.
 */
public interface IBookDAO {
    Book createBook(Book book);
    Book getBook(String id);
    Book updateBook(Book book);
    boolean removeBook(String id);

    List<Book> getAllBooks(BookListParametres parametres);

}
