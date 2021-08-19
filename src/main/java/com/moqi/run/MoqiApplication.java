package com.moqi.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MoqiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MoqiApplication.class, args);
    }

}
