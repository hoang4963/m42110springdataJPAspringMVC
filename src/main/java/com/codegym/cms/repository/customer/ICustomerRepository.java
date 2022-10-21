package com.codegym.cms.repository.customer;

import com.codegym.cms.model.Customer;
import com.codegym.cms.repository.IGeneralRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICustomerRepository extends IGeneralRepository<Customer> {
    @Override
    List<Customer> findAll();

    @Override
    Customer findById(Long id);

    @Override
    void save(Customer customer);

    @Override
    void remove(Long id);
    boolean insertWithStoredProcedure(Customer customer);
}