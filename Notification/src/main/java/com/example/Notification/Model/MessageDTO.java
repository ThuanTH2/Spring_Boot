/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Notification.Model;

import lombok.Data;

/**
 *
 * @author nguyentienthuan
 */
@Data
public class MessageDTO {
    private String from;
    private String to;
    private String toName;
    private String subject;
    private String content;
    
}
