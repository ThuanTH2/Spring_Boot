/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Accountservice.Entity;

import com.example.Accountservice.Model.AccountDTO;
import com.example.Accountservice.Repository.AccountRepository;
import com.example.Accountservice.Service.AccountService;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Set;
import lombok.Data;

/**
 *
 * @author nguyentienthuan
 */
@Entity
@Table(name = "account")
@Data
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name ="name")
    private String name;
    
    private String password;
    
    @Column(name ="username")
    private String username;
    
    @ElementCollection
    @CollectionTable
    @Column(name="role")
    private Set<String> roles;
    
    
}


