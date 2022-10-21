package com.codegym.cms.service.customer;

import com.codegym.cms.model.Customer;
import com.codegym.cms.repository.customer.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return (List<Customer>) customerRepository.findAll();
    }

    @Override
    public Customer findById(Long id) {
      return null;
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void remove(Long id) {

    }
    public boolean insertWithStoredProcedure(Customer customer) {
        return customerRepository.insertWithStoredProcedure(customer);
    }

//    @Override
//    public void remove(Long id) {
//        customerRepository.deleteById(id);
//    }


//    @Override
//    public void remove(Long id) {
//        customerRepository.remove(id);
//    }
}
