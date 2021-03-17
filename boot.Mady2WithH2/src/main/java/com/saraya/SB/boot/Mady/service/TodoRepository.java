package com.saraya.SB.boot.Mady.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saraya.SB.boot.Mady.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Integer>{
	
	List<Todo> findByUser(String user);


}
