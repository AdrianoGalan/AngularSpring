package br.com.adrianogalan.crudspring.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.adrianogalan.crudspring.model.Curso;
import br.com.adrianogalan.crudspring.repository.CursoRepository;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/cursos")
@AllArgsConstructor
public class CursosController {

    private final CursoRepository cursoRepository;

    @GetMapping
    public List<Curso> list() {
        return cursoRepository.findAll();
    }

}
