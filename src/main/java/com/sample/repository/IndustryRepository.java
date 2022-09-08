package com.sample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.entity.Industry;

public interface IndustryRepository extends JpaRepository<Industry, Integer> {

	List<Industry> findBySicCodeIn(List<String> sicCode);
}
