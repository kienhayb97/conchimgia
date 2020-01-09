package com.codegym.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String inFor;
    private String country;

    @OneToMany(targetEntity = Book.class, fetch = FetchType.EAGER)
    private Set<Book> books;
    public Author() {
    }

    public Author(Long id, String name, String inFor, String country, Set<Book> books) {
        this.id = id;
        this.name = name;
        this.inFor = inFor;
        this.country = country;
        this.books = books;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInFor() {
        return inFor;
    }

    public void setInFor(String inFor) {
        this.inFor = inFor;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}