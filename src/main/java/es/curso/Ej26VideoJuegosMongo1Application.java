package es.curso;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import es.curso.modelo.entidad.Videojuego;
import es.curso.modelo.persistencia.VideojuegoDAO;

@SpringBootApplication
public class Ej26VideoJuegosMongo1Application implements CommandLineRunner{

	@Autowired
	private VideojuegoDAO daoJuego;
	
	public static void main(String[] args) {
		SpringApplication.run(Ej26VideoJuegosMongo1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Videojuego v = new Videojuego(1,"GTAV","Rockstar",6.6, 60);
		Videojuego v1 = new Videojuego(2,"FIFA","EA",6.6, 60);
		
		daoJuego.save(v);
		daoJuego.save(v1);
		System.out.println("***********");
		System.out.println(daoJuego.findById(1).orElse(null));
		
	}

}
