package com.app.bookstoremanager.repository;

import com.app.bookstoremanager.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
