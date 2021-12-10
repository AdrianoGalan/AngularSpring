package br.com.adrianogalan.crudspring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.adrianogalan.crudspring.model.Curso;
import br.com.adrianogalan.crudspring.repository.CursoRepository;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(CursoRepository cursoRepository){

		return arg -> {
			cursoRepository.deleteAll();

			Curso c = new Curso();
			c.setNome("Angular com Spring");
			c.setCategoria("Front-end");

			cursoRepository.save(c);
		};

	}

}
