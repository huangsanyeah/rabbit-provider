package com.quyiwang;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
//@ComponentScan(value = "com.quyiwang.rabbitmq.support")
public class RabbitProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitProviderApplication.class, args);
	}
}
