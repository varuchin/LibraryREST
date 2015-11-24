package com.REST;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.xml.ws.Response;
/**
 * Created by varuchin on 24.11.2015.
 */


public class LibraryServiceJSON implements ILibraryService {

    private Book book;


    @Context
    private HttpHeaders requestHeaders;

    private String getHeaderVersion() {
        return requestHeaders.getRequestHeader("version").get(0);
    }


    @GET
    @Path("/{id}")
    @Override
    public Response getBook(@PathParam("id") String id)
    {
        return null;
    }

    @Override
    public Response removeBook(String id) {
        return null;
    }

    @Override
    public Response createBook(Book str) {
        return null;
    }

    @Override
    public Response updateBook(Book str) {
        return null;
    }

    @Override
    public Response getAllBooks() {
        return null;
    }
}
