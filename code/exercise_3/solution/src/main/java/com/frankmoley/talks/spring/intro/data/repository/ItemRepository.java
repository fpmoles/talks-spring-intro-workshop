package com.frankmoley.talks.spring.intro.data.repository;

import com.frankmoley.talks.spring.intro.data.entity.ItemEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repository for managing {@link com.frankmoley.talks.spring.intro.data.entity.ItemEntity} objects in the datastore
 */
@Repository
public interface ItemRepository extends CrudRepository<ItemEntity, Long>{

    List<ItemEntity> findByPersonId(long personId);
}
