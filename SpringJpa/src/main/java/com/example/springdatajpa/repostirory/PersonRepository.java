/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.springdatajpa.repostirory;

import com.example.springdatajpa.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author nguyentienthuan
 */
public interface PersonRepository extends JpaRepository<Person, Integer> {
    
}
