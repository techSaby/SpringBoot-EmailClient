package com.techsaby.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techsaby.model.SaveIdea;

public interface JPARepo extends JpaRepository<SaveIdea, Long> {

}
