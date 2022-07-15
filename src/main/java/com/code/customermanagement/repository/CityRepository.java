package com.code.customermanagement.repository;

import com.code.customermanagement.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {
    // City Repository is provided by Spring
}
