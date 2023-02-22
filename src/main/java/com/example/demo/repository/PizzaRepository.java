package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.models.Pizza;

import jakarta.validation.Valid;


public interface PizzaRepository {

	List<Pizza> findAll(Sort sort);

	List<Pizza> findByNameLike(String keyword);

	Optional<Pizza> findById(Integer id);

	Pizza getReferenceById(Integer id);

	void save(@Valid Pizza formPizza);

	void deleteById(Integer id);

}
