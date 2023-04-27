/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Accountservice.Repository;

import com.example.Accountservice.Entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author nguyentienthuan
 */
public interface AccountRepository extends JpaRepository<Account, Long>{
    
}
