package cn.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient //标识这个服务是一个Eureka客户端
@SpringBootApplication
public class ProviderUserRunApp {

	public static void main(String[] args) {
		SpringApplication.run(ProviderUserRunApp.class, args);
	}
}
