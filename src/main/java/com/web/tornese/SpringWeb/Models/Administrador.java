package com.web.tornese.SpringWeb.Models;

import jakarta.persistence.*;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "Administradores")
public class Administrador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "senha", nullable = false)
    private String senha;

    @Column(columnDefinition = "TEXT")
    private String observacao;

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSenha(){

        return senha.substring(0, 3) + "****";
   }

    public void setSenha(String senha) {

        this.senha = senha;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}