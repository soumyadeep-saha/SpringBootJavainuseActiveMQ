package com.soumyadeep.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.jms.core.JmsTemplate;

@SpringBootApplication
public class SpringBootJavainuseActiveMqApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = 
				SpringApplication.run(SpringBootJavainuseActiveMqApplication.class, args);
		
		JmsTemplate template=ctx.getBean(JmsTemplate.class);
		template.convertAndSend("soumyadeep", "soumyadeep message");
	}

}
