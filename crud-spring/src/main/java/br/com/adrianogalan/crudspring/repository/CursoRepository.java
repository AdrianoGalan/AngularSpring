package br.com.adrianogalan.crudspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.adrianogalan.crudspring.model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {
    
}
