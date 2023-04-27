/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Notification.Controller;

import com.example.Notification.Model.MessageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.example.Notification.Service.EmailService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author nguyentienthuan
 */
@RestController
public class NotificationController {
    @Autowired
    private EmailService emailService;
    @PostMapping("/send-notification")
    public void senNotification(@RequestBody MessageDTO messageDTO){
        emailService.sendMail(messageDTO);
    }
    
}
