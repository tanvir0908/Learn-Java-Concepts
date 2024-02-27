package com.example.challenge80;

public class LibraryItem {
    private String itemID;
    private String title;
    private String author;

    public void checkout() {
        System.out.println("Checkout...");
    }

    public void returnItem() {
        System.out.println("Return item...");
    }
}
