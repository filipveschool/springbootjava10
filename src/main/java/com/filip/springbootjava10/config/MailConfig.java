package com.filip.springbootjava10.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//https://github.com/eugenp/tutorials/blob/master/spring-mvc-email/src/main/java/com/baeldung/spring/app/config/AppConfig.java
@Configuration
public class MailConfig implements WebMvcConfigurer {

    @Bean
    public SimpleMailMessage templateSimpleMessage() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setText("This is the test email template for your email:\n%s\n");
        return message;
    }
}
