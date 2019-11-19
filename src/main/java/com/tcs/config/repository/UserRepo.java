/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tcs.config.repository;

import com.tcs.config.models.Hibernate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author nil
 */
@Repository
public interface UserRepo extends JpaRepository<Hibernate, Integer>{
    public Hibernate findByfirstName (String name);
    
}
