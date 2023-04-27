package com.example.Accountservice;

import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

//@SpringBootApplication(scanBasePackages = {"com.example.Acount.Service"})
//@SpringBootApplication(scanBasePackages = {"com.example.AcountApplication"})
@SpringBootApplication
public class AcountApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcountApplication.class, args);
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
