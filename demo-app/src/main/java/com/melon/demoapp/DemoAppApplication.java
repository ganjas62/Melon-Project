package com.melon.demoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.melon")
@EnableJpaRepositories(basePackages = "com.melon.demodao")
@EntityScan(basePackages = "com.melon.demoentity")
public class DemoAppApplication {

  public static void main(String[] args) {
    SpringApplication.run(DemoAppApplication.class, args);
  }
}
