package com.learning.accounts.repository;

import com.learning.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

//Derived named method because based on the column names my Spring data jpa will fetch the records
    Optional<Customer> findByMobileNumber(String mobileNumber);
}
