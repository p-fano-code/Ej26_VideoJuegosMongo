package es.curso.modelo.persistencia;

import org.springframework.data.mongodb.repository.MongoRepository;

import es.curso.modelo.entidad.Videojuego;

public interface VideojuegoDAO extends MongoRepository<Videojuego, Integer> {

}
