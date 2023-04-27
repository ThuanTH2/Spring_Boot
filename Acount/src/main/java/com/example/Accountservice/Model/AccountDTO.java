/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Accountservice.Model;

import java.util.Set;
import lombok.Data;

/**
 *
 * @author nguyentienthuan
 */
@Data
public class AccountDTO {
    private Long id;
    
    private String name;
    
    private String password;
    
    private String username;
    
   
    private Set<String> roles;
    
}
