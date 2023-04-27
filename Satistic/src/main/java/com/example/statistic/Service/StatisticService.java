/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.statistic.Service;

import com.example.statistic.Entity.Statistic;
import com.example.statistic.Model.StatisticDTO;
import com.example.statistic.Repository.StatisticRepository;
import java.util.ArrayList;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author nguyentienthuan
 */

public interface StatisticService {
    void add(StatisticDTO statisticDTO);
    
    List<StatisticDTO> getAll();
}
@Transactional
@Service
class StatisticServiceImpl implements StatisticService{
    
    @Autowired
    StatisticRepository statisticRepository;
    
    @Autowired
    ModelMapper modelMapper;
    
    @Override
    public void add(StatisticDTO statisticDTO) {
        Statistic statistic = modelMapper.map(statisticDTO, Statistic.class);
        statisticRepository.save(statistic);
    }

    @Override
    public List<StatisticDTO> getAll() {
        List<StatisticDTO> statisticDTOs=new ArrayList<>();
        statisticRepository.findAll().forEach((statistic->{
            statisticDTOs.add(modelMapper.map(statistic, StatisticDTO.class));
        }));
        return statisticDTOs;
    }
    
}
