package org.example.config;

import org.example.service.EmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //este o adnotare la nivel de clasa care se foloseste in declararea beanurilor prin adnotarea metodelor din clasa cu @Bean
public class AppConfig {


    //@Bean este o anotare la nivel de metoda si ofera suport in procesarea beanurilor din fisierul xml;
    // suporta de asemenea si procesarea majoritaii atributelor oferite de fisierul xml: init-metod,scope,etc.
    @Bean
    public EmailService emailServiceBean(){
        return new EmailService();
    }
}
