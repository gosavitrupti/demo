package com.springmvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springmvc.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{

}
