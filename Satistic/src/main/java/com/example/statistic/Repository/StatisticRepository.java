/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.statistic.Repository;

import com.example.statistic.Entity.Statistic;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author nguyentienthuan
 */
public interface StatisticRepository extends JpaRepository<Statistic, Long>{
    
}
