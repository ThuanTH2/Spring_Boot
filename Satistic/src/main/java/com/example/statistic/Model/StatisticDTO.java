/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.statistic.Model;

import java.util.Date;
import lombok.Data;

/**
 *
 * @author nguyentienthuan
 */
@Data
public class StatisticDTO {
    private Long id;
    
    private String messeage;
    private Date createDate;
}
