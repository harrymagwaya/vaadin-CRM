package com.crm.crm.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import com.crm.crm.views.LoginView;
import com.vaadin.flow.spring.security.VaadinWebSecurity;

@EnableWebSecurity
@Configuration
public class SecurityConfig extends VaadinWebSecurity{ // login with vaadin websec configurer
    
    @Override
    protected void configure(HttpSecurity http) throws Exception { 
        super.configure(http);
        setLoginView(http, LoginView.class);
    }

    @Override
    protected void configure(WebSecurity web) throws Exception {
        // TODO Auto-generated method stub
        web.ignoring().requestMatchers("/images/**");
        super.configure(web);
    }

    @Bean
    protected UserDetailsService userDetailsService(){
        return new InMemoryUserDetailsManager(User.withUsername("user")
        .password("${noop}userpass)")
        .roles("USER")
        .build());
    }
}
