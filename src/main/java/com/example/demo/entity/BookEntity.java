package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class BookEntity {
    @Id
    @Column
    private int id;
    @Column
    private String bookName;
    @Column
    private float price;
    @Column
    private int quantity;
    @Column
    private String authorName;

    BookEntity() {
    }

    public BookEntity(int id, String bookName, float price, int quantity, String authorName) {
        this.id = id;
        this.bookName = bookName;
        this.price = price;
        this.quantity = quantity;
        this.authorName = authorName;
    }
}
