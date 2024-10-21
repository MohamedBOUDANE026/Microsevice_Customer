package org.ma.customerservice.Dao.repository;

import org.ma.customerservice.Dao.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
