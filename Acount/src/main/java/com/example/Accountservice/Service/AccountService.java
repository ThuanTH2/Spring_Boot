/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.Accountservice.Service;

import com.example.Accountservice.Entity.Account;
import com.example.Accountservice.Model.AccountDTO;
import com.example.Accountservice.Repository.AccountRepository;
import java.util.ArrayList;
import java.util.List;
import org.apache.catalina.mapper.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author nguyentienthuan
 */
public interface AccountService {
    void add(AccountDTO accountDTO);
    
    void update(AccountDTO accountDTO);
    
    void updatePassword(AccountDTO accountDTO);
    
    void delete(long id);
    
    List<AccountDTO> getAll();
    
    AccountDTO getOne(long id);
    
    
}

@Transactional
@Service
class AccountServiceImpl implements  AccountService{
    @Autowired
    AccountRepository accountRepository;
    
    @Autowired
    ModelMapper modelMapper;
    
    
    @Override
    public void add(AccountDTO accountDTO) {
        Account account =modelMapper.map(accountDTO, Account.class);
        accountRepository.save(account);
        accountDTO.setId(account.getId());

    }

    @Override
    public void update(AccountDTO accountDTO) {
        Account account=accountRepository.getById(accountDTO.getId());
        if(account!=null){
            accountRepository.save(account);
        }
    }

    @Override
    public void updatePassword(AccountDTO accountDTO) {
        Account account=accountRepository.getById(accountDTO.getId());
        if(account!=null){
            accountRepository.save(account);
        }

    }

    @Override
    public void delete(long id) {
        Account account=accountRepository.getById(id);
        if(account!=null){
            accountRepository.delete(account);
        }
    }

    @Override
    public List<AccountDTO> getAll() {
        List<AccountDTO> accountDTOs = new ArrayList<>();
        accountRepository.findAll().forEach((account)->{
            accountDTOs.add(modelMapper.map(account, AccountDTO.class));
        });
        return accountDTOs;
    }

    @Override
    public AccountDTO getOne(long id) {
        Account account=accountRepository.getById(id);
        if(account!=null){
            return modelMapper.map(account, AccountDTO.class);
        }
        return null;
        
    }
    
}
