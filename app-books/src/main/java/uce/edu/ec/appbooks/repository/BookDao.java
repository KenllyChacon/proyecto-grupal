package uce.edu.ec.appbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uce.edu.ec.appbooks.model.Book;

public interface BookDao extends JpaRepository<Book, Integer> {
}
