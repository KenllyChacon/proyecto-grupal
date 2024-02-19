package uce.edu.ec.appauthors.repository;

import org.springframework.data.repository.CrudRepository;
import uce.edu.ec.appauthors.model.Author;

public interface AuthorDao extends CrudRepository<Author, Integer> {
}
