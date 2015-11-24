package com.REST;

import javax.xml.ws.Response;

/**
 * Created by varuchin on 24.11.2015.
 */
public interface ILibraryService {

    Response getBook(String id);
    Response removeBook(String id);
    Response createBook(Book str);
    Response updateBook(Book str);
    Response getAllBooks();
}
