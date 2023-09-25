package com.ete.twilio.resource;

import org.springframework.web.reactive.function.server.ServerResponse;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TwilioRouterConfig {
	
	    @Autowired
	    private TwilioHandler twilioHandler;
	    
	    @Bean
	    public RouterFunction<ServerResponse> handleSMS() {
	        return RouterFunctions.route()
	                .POST("/router/sendOTP", twilioHandler::sendOTP)
	                .POST("/router/validateOTP", twilioHandler::validateOTP)
	                .build();
	    }
	
	

}
