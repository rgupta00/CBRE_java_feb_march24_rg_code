//package com.demo.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@Configuration
//@EnableWebSecurity
//public class SecConfig2 extends WebSecurityConfigurerAdapter {
//
//
//    //we define users with roles
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
//                .withUser("raj").password("raj123").roles("ADMIN")
//                .and()
//                .withUser("ekta").password("ekta123").roles("MGR")
//                .and()
//                .withUser("gun").password("gun123").roles("CLERK");
//    }
//    //spring sec looking for password encoder
//    @Bean
//    public PasswordEncoder passwordEncoder(){
//        return NoOpPasswordEncoder.getInstance();
//    }
//    //what u can access
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable()
//                .authorizeRequests()
//                .antMatchers("/admin/**").hasAnyRole("ADMIN")
//                .antMatchers("/mgr/**").hasAnyRole("MGR","ADMIN")
//                .antMatchers("/clerk/**").hasAnyRole("CLERK","MGR","ADMIN")
//                .antMatchers("/home/**").permitAll()
//                .and()
//                .httpBasic()
//                .and()
//                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//    }
//}
