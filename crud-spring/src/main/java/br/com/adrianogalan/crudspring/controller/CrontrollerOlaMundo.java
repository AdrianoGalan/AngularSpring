package br.com.adrianogalan.crudspring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/ola")
public class CrontrollerOlaMundo {

    @RequestMapping
    public String olaString() {
            return "funciona";
    }
    
}
