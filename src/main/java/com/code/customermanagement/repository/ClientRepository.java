package com.code.customermanagement.repository;

import com.code.customermanagement.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {
    // Client Repository is provided by Spring
}
