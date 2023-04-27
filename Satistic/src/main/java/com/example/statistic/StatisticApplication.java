package com.example.statistic;

import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StatisticApplication {

	public static void main(String[] args) {
		SpringApplication.run(StatisticApplication.class, args);
	}
        @Bean
        public ModelMapper modelMapper(){
            ModelMapper modelMapper = new ModelMapper();
            modelMapper.getConfiguration().setFieldMatchingEnabled(true)
                    .setFieldAccessLevel(Configuration.AccessLevel.PRIVATE)
                    .setMatchingStrategy(MatchingStrategies.STRICT);
            return modelMapper;
        }

}