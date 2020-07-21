package com.github.zg2pro.interviews;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.shell.jline.PromptProvider;

@SpringBootApplication
public class HelloMain {

    public static void main(String[] args) {
        SpringApplication.run(HelloMain.class, args);
    }

}
