package BS41Perfiles.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

import javax.annotation.PostConstruct;

@SpringBootApplication
@ConfigurationPropertiesScan
public class DemoApplication {
	@Autowired
	ReadAplicationProperties rap;

	@Autowired
	ReadMiConfig rmc;


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	//Imprimir todas las variables al arrancar el programa
	@PostConstruct
	public void construidoBean(){
		System.out.println("***************  Ya se ha construido el Bean  ***************");
		System.out.println(
				">>>  "+rap.getUrl() + "  <<<-->>> "+
				"  <<<-->>>  "	+ rap.getPassword()
						+ "  <<<-->>>  "
						+ rmc.getValor1()
						+ "  <<<-->>>  "
						+ rmc.getValor2()+"   <<<<");
		System.out.println("*****************************************************************");
	}
}
