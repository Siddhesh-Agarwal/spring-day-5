package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.BookEntity;

public interface BookRepo extends JpaRepository<BookEntity, Integer> {

}