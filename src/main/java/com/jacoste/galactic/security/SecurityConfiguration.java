package com.jacoste.galactic.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.jacoste.galactic.table.Role;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	public final DetailsUserService detailsUtilisateurService;

	public SecurityConfiguration(DetailsUserService detailsUtilisateurService) {
		this.detailsUtilisateurService = detailsUtilisateurService;
	}

	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		
		auth.authenticationProvider(daoAuthentificationProvider());
	}

	@Bean
	public AuthenticationProvider daoAuthentificationProvider() {
		DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
		daoAuthenticationProvider.setUserDetailsService(detailsUtilisateurService);
		daoAuthenticationProvider.setPasswordEncoder(getPasswordEncoder());
		return daoAuthenticationProvider;
	}

	@Bean
	public PasswordEncoder getPasswordEncoder() {
		
		return new BCryptPasswordEncoder();
	}


	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http.csrf().disable()
		.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
		.and()
		.httpBasic()
		.and()
		.authorizeRequests()
		.antMatchers("/api/secured/admin").hasRole(Role.ADMIN.name())
		.antMatchers("/api/secured**").authenticated();
		
	}
	
}
