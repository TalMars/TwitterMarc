package com.github.talmars.repository;

import com.github.talmars.model.Theme;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ThemeRepository extends CrudRepository<Theme, Long> {
}
