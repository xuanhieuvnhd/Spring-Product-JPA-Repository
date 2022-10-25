package com.repository;

import com.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
@Repository
@Transactional
public interface IProductRepository extends CrudRepository<Product,Long> {
    List<Product> findByNameContaining(String name);
}
