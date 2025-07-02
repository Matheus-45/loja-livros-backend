package com.example.loja_livros_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LojaLivrosBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(LojaLivrosBackendApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "Bem-vindo à Loja de Livros!";
    }
}