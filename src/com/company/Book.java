package com.company;

/**
 * The BookDB class already contains private member variables and a default constructor. It also contains public getters
 * and setters for each private member variable.
 *
 * While it is possible to create public member variables and avoid the getters/setters please don't do this. A small
 * puppy will run away from home every time you do this.
 *
 * Next, you'll add an overloaded constructor and a method.
 *
 * An overloaded constructor is a constructor that takes one or more parameters. You can create multiple constructors as
 * long as the parameter types and counts are unique. Create a constructor  in the BookDB  class that takes an SKU and
 * populates the private member variables. The constructor by default will return the appropriate BookDB object when it
 * is called. You do not need to include a return statement.
 *
 * Next, create a method in your Book class called getDisplayText(). It takes no parameters. When called it returns a
 * string containing the author, title and description. Do not use System.out.print() in your class. Simply return the
 * string and let the calling class handle the print statements. You can use this method to print your book information
 * to the console or a file or a web page.
 *
 */
public class Book {
    private String SKU, title, author, description;
    private double price;
    private boolean isInStock;
    private int numberOfCopies;

    public Book() {

    }

    
    public Book(String SKU, String title, String author, String description, double price, boolean isInStock) {
        this.SKU = SKU;
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
        this.isInStock = isInStock;
    }

    public String getDisplayText(){
        return "Author: " + author +"\nTitle: " +title + "\nDescription: " + description ;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }
}

