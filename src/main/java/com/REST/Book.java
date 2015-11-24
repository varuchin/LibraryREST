package com.REST;

/**
 * Created by varuchin on 24.11.2015.
 */
public class Book {

    private String id;
    private String name;
    private String author;
    private String price;
    private String stock;


    public void setId(String id)
    {
        this.id = id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public void setPrice(String price)
    {
        this.price = price;
    }

    public void setStock(String stock)
    {
        this.stock = stock;
    }

    public String getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getAuthor()
    {
        return author;
    }

    public String getPrice()
    {
        return price;
    }

    public String getStock()
    {
        return stock;
    }
}
