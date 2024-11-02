package com.example.JAX_RS.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.JAX_RS.service.CompteRestJaxRSAPI;

@Configuration
public class Config {
	@Bean
	public ResourceConfig resourceConfig() {
		ResourceConfig jerseyServlet = new ResourceConfig();
		jerseyServlet.register(CompteRestJaxRSAPI.class);
		return jerseyServlet;
	}

}
