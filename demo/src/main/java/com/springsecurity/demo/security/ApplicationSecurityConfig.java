package com.springsecurity.demo.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class ApplicationSecurityConfig extends WebSecurityConfigurerAdapter {

   @Override
   protected void configure(HttpSecurity http) throws Exception {
      http
            .authorizeRequests()
            .anyRequest()
            .authenticated() // ANY REQUEST MUST BE AUTHENTICATED
            .and()
            .httpBasic(); // USERNAME:PASSWORD ENCODED BASE64
      // IN BASIC AUTH WE CAN'T LOGOUT BECAUSE EACH REQUEST NEEDS USERNAME:PASSWORD
      // LOGOUT DOES NOT EXIST.
   }
}
