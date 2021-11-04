package com.bms.billing;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/*
 * Through this module loan is approved ,applied ,detailCheck
 * 
 */
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = "com.bms.*")
public class BmsBillingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BmsBillingApplication.class, args);
	}

}
