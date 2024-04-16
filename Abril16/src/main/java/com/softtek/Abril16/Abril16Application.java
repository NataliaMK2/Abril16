package com.softtek.Abril16;

import com.softtek.Abril16.modelo.Ej2.Coche;
import com.softtek.Abril16.modelo.Ej2.Conductor;
import com.softtek.Abril16.modelo.Ej3.Cochee;
import com.softtek.Abril16.modelo.Ej3.SeguroCoche;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.softtek.Abril16.modelo.Ej1.Saludo;

@SpringBootApplication
public class Abril16Application implements CommandLineRunner {

	@Autowired
	private Saludo saludo;
	private Conductor c1;
	private SeguroCoche sc;


	public static void main(String[] args) {
		SpringApplication.run(Abril16Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Cochee coche = new Cochee("1234", "SKODA");
		//System.out.println(saludo.getMensaje());
		//System.out.println(c1.conducir());
		System.out.println(sc.reparar(coche));
	}

}
