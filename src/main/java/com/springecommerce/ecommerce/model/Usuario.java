package com.springecommerce.ecommerce.model;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Usuario {
    @Id
    private Long Id;
    private String nombre;
    private String username;
    private String email;
    private String direccion;
    private String telefono;
    private String tipo;
    private String password;

    public Usuario(){
    }
    public Usuario(Long id, String nombre, String username, String email, String direccion, String telefono, String tipo, String password) {
        Id = id;
        this.nombre = nombre;
        this.username = username;
        this.email = email;
        this.direccion = direccion;
        this.telefono = telefono;
        this.tipo = tipo;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "Id=" + Id +
                ", nombre='" + nombre + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", tipo='" + tipo + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
