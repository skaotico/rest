package com.moveapps.Aarquetipo;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Mi asasas", version = "1.0", description = "Documentación de la API de Mi Aplicación"))
public class AarquetipoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AarquetipoApplication.class, args);
	}
}
