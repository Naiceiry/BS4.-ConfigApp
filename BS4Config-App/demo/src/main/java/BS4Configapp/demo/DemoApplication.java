package BS4Configapp.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
//@ConfigurationProperties funciona mejor con propiedades jerárquicas que tienen el mismo prefijo; por lo tanto, agregamos un prefijo de correo.
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}



}

//Comenzamos agregando spring-boot-starter-parent como padre en nuestro pom.xml: https://www.baeldung.com/configuration-properties-in-spring-boot

