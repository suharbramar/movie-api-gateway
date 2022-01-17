package io.bramcode.movie.movieapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MovieApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieApiGatewayApplication.class, args);
	}

}
