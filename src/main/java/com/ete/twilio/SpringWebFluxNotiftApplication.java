package com.ete.twilio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ete.twilio.config.TwilioConfig;
import com.twilio.Twilio;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringWebFluxNotiftApplication {
	
	@Autowired
	private TwilioConfig twilioConfig;
	
	//at the time of application setup, our twilio will be up and running
	@PostConstruct
	public void initTwilio() {
		Twilio.init(twilioConfig.getAccountSid(), twilioConfig.getAuthToken());
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringWebFluxNotiftApplication.class, args);
	}

}
