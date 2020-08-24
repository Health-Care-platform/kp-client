package org.kp.services.cofig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import brave.sampler.Sampler;
import feign.Contract;
import feign.auth.BasicAuthRequestInterceptor;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients("org.kp.services.*")
@ComponentScan("org.kp.*")
public class KpClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(KpClientApplication.class, args);
	}

	@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}

//	  @Bean public Contract feignContract() { return new feign.Contract.Default();
//	  }
	  
//	  @Bean public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
//	  return new BasicAuthRequestInterceptor("user", "password"); 
//	  }
	 

}
