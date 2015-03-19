package com.frankmoley.example.data.repository;

import com.frankmoley.example.data.domain.CustomerEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Frank Moley
 */
public interface CustomerEntityRepository extends CrudRepository<CustomerEntity, Long>{

    CustomerEntity findByEmailAddress(String emailAddress);
}
