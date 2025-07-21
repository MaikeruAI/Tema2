package com.practica.library.model;


public class BookDTO {

    private String name;
    private String author;


    public BookDTO(String name, String author) {
        this.author = author;
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }



    @Override
    public String toString() {
        return "{" +
                "\"name\":\"" + name + "\"," +
                "\"author\":\"" + author + "\"" +
                "}";
    }
}
