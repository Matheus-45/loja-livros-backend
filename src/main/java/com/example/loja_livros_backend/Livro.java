package com.example.loja_livros_backend;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Livro {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String titulo;
private double preco;

public Livro() {}

public Livro(String titulo, double preco) {
    this.titulo = titulo;
    this.preco = preco;

}

public Long getId() { return id; }
public void setId(Long id) { this.id = id; }
public String getTitulo() { return titulo; }
public void setTitulo(String titulo) { this.titulo = titulo; }
public double getPreco() { return preco; }
public void setPreco(double preco) { this.preco = preco; }

}