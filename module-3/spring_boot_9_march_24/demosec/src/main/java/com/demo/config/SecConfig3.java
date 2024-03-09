package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecConfig3 {
    //we need to define a bean that help spring sec to get some user
    @Bean
    public UserDetailsService userDetailsService(PasswordEncoder passwordEncoder){
        UserDetails raj= User.withUsername("raj")
                .password(passwordEncoder.encode("raj123"))
                .roles("ADMIN")
                .build();
        UserDetails ekta= User.withUsername("ekta")
                .password(passwordEncoder.encode("ekta123"))
                .roles("MGR")
                .build();

        UserDetails gun= User.withUsername("gun")
                .password(passwordEncoder.encode("gun123"))
                .roles("CLERK")
                .build();
        return new InMemoryUserDetailsManager(raj,ekta, gun);
    }

    //spring sec looking for password encoder
    @Bean
    public PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf(AbstractHttpConfigurer::disable)
               // .cors(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(registry ->
                        registry.requestMatchers("/admin/**").hasAnyRole("ADMIN")
                                .requestMatchers("/mgr/**").hasAnyRole("ADMIN","MGR")
                                .requestMatchers("/clerk/**").hasAnyRole("ADMIN","MGR","CLERK")
                                .requestMatchers("/home/**").permitAll()
                                .anyRequest().authenticated()
                )
                .httpBasic(Customizer.withDefaults())
                .sessionManagement(httpSecuritySessionManagementConfigurer ->
                        httpSecuritySessionManagementConfigurer.sessionCreationPolicy(SessionCreationPolicy.STATELESS));

        return http.build();
    }


}
