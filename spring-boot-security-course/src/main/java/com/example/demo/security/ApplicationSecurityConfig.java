package com.example.demo.security;

import static com.example.demo.security.ApplicationUserRole.BOSS;
import static com.example.demo.security.ApplicationUserRole.CEO;
import static com.example.demo.security.ApplicationUserRole.WORKER;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class ApplicationSecurityConfig extends WebSecurityConfigurerAdapter {

    private final PasswordEncoder passwordEncoder;

    @Autowired
    public ApplicationSecurityConfig(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .csrf()
            .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
            .and() //HERE !  Defaults XSRF-TOKEN as cookie name and X-XSRF-TOKEN as header name

//        .csrf().disable()
        .authorizeRequests()
        .antMatchers("/", "index", "css/*", "js/*").permitAll()
//      .antMatchers("/api/**").hasRole(BOSS.name())
//      .antMatchers(HttpMethod.DELETE,"/management/api/**").hasAuthority(ApplicationUserPermission.BOSS_WRITE.getPermission().toLowerCase())
        .antMatchers(HttpMethod.DELETE,"/management/api/**").hasAnyRole(ApplicationUserPermission.BOSS_WRITE.getPermission())
        .antMatchers(HttpMethod.DELETE,"/api/**").hasAnyRole(ApplicationUserRole.CEO.name(), ApplicationUserRole.BOSS.name())
//      .antMatchers(HttpMethod.GET,"/management/api/**").hasAnyRole(ApplicationUserRole.WORKER.name(), ApplicationUserRole.CEO.name(),
//       BOSS.name())
        .anyRequest()
        .authenticated()
        .and()
        .httpBasic();
    }

    @Override
    @Bean
    protected UserDetailsService userDetailsService() {
        return new InMemoryUserDetailsManager(
                User.builder()
                    .username("june")
                    .password(passwordEncoder.encode("baller12"))
                    .roles(ApplicationUserRole.BOSS.name())
                    .authorities(BOSS.getGrantedAuthorities())
                .build(),
                User.builder()
                    .username("yune")
                    .password(passwordEncoder.encode("baller12"))
//                    .roles(ApplicationUserRole.WORKER.name())
                    .authorities(WORKER.getGrantedAuthorities())
                .build(),
                User.builder()
                    .username("chapo")
                    .password(passwordEncoder.encode("baller12"))
//                    .roles(ApplicationUserRole.CEO.name())
                    .authorities(CEO.getGrantedAuthorities())
                .build()
        );
    }
}

