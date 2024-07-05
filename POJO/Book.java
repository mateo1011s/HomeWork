package com.example.pojo;

public class Book {
    private String title;
    private String author;
    private int pags;

    public Book() { }

    public Book(String title, String author, int pags) {
        this.title = title;
        this.author = author;
        this.pags = pags;
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
    public int getPags() {
        return pags;
    }
    public void setPags(int pags) {
        this.pags = pags;
    }
    @Override
    public String toString() {
        return "Book{" + "title='" + title + '\'' + ", author='" + author + '\'' +
                ", pags=" + '\'' +pags + '\'' + '}';
    }
}
