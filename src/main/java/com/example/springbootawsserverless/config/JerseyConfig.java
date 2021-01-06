package com.example.springbootawsserverless.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;
import com.example.springbootawsserverless.service.CouponServiceImpl;
import com.example.springbootawsserverless.service.JwtAuthenticationService;


@Component
public class JerseyConfig extends ResourceConfig {
	public JerseyConfig() {

		register(CouponServiceImpl.class);
		register(JwtAuthenticationService.class);
	} 
}
