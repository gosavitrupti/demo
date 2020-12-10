package com.springmvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springmvc.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long>{

}
