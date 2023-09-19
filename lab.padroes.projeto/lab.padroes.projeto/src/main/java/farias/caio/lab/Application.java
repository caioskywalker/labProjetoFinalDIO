package farias.caio.lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
/**
 * Projeto Spring Boot gerado via Spring Initializr
 * As seguintes dependências foram utilizadas
 *  Spring Data JPA
 *  Spring Web
 *  H2 Database
 *  OpenFeign
 *  @author CaioFarias
 */

@EnableFeignClients
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
