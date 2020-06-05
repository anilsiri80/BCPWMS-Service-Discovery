package com.etg.bcpwms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BcpwmsServiceDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(BcpwmsServiceDiscoveryApplication.class, args);
	}
//9440656690
}
