package com.example.configBeanXmlApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class ConfigBeanXmlAppApplication {

	public static void main(String[] args) {

		//SpringApplication.run(ConfigBeanXmlAppApplication.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		TpController  tpServices = (TpController) context.getBean("tpController");
		tpServices.getAllTpEntities(new TpEntity(1,"angular")).forEach(tpEntity -> System.out.println("Name :"+ tpEntity.getName()));
	}

}
