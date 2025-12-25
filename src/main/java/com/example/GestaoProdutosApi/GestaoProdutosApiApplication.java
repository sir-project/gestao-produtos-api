package com.example.GestaoProdutosApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {
		DataSourceAutoConfiguration.class
})

public class GestaoProdutosApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestaoProdutosApiApplication.class, args);
	}

}
