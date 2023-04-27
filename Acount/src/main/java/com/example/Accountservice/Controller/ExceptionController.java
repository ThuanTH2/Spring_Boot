/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Accountservice.Controller;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 *
 * @author nguyentienthuan
 */
@RestControllerAdvice
public class ExceptionController {
    Logger logger=LoggerFactory.getLogger(this.getClass());
    
    @ExceptionHandler(SQLIntegrityConstraintViolationException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public Map<String,String> conflictData(Exception ex){
        logger.info(ex.getMessage());
        
        Map<String,String> map=new HashMap<>();
        map.put("code", "409");
        map.put("error", "Confict Data");
        
        return map;

    }
    
    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    @ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
    public Map<String,String> methodNotSupport(Exception ex){
        logger.info(ex.getMessage());
        
        Map<String,String> response=new HashMap<>();
        response.put("code", "405");
        response.put("error", "MeThod Not Allow");
        
        return response;

    }
    
}
