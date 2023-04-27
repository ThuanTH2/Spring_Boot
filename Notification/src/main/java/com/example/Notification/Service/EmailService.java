/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.Notification.Service;

import com.example.Notification.Model.MessageDTO;
import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import java.nio.charset.StandardCharsets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring6.SpringTemplateEngine;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

/**
 *
 * @author nguyentienthuan
 */
public interface EmailService {
    void sendMail(MessageDTO messageDTO);
}
@Service
class MessageServiceImpl implements  EmailService{
    Logger logger =LoggerFactory.getLogger(this.getClass());
    
    @Autowired
    private JavaMailSender javaMailSender;
    
    @Autowired
    private SpringTemplateEngine templateEngine;
    @Override
    public void sendMail(MessageDTO messageDTO) {
        try{
            logger.info("START... Sending Email");
            MimeMessage message=javaMailSender.createMimeMessage();
            MimeMessageHelper helper=new MimeMessageHelper(message,StandardCharsets.UTF_8.name());
            // load template email with content
            Context context=new Context();
            context.setVariable("name",messageDTO.getToName());
            context.setVariable("content",messageDTO.getContent());
            String html=templateEngine.process("welcome-html",context);
            
            //send email
            helper.setTo(messageDTO.getTo());
            helper.setText(html,true);
            helper.setSubject(messageDTO.getSubject());
            helper.setFrom(messageDTO.getFrom());
            javaMailSender.send(message);
            logger.info("End... Email sent success");
            
        } catch(MessagingException e){
            logger.error("Email sent with error: "+e.getMessage());
        }
    }
      
    
}
