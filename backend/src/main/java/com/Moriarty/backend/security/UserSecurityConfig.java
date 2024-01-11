package com.Moriarty.backend.security;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;

@Configuration
public class UserSecurityConfig {
	
	@Bean
	public UserDetailsManager userDetailsManager (DataSource datasource) {
		
		return new JdbcUserDetailsManager(datasource);
	}
}
