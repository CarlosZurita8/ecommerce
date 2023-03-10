package com.springecommerce.ecommerce.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Setter @Getter
@Entity
@Table(name = "ordenes")
public class Orden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String numero;
    private Date fechaCreacion;
    private Date fechaRecibida;
    private double total;
    @ManyToOne
    private Usuario usuario;
    @OneToOne(mappedBy = "orden")
    private DetalleOrden detalle;

    public Orden(){
    }
    public Orden(Long id, String numero, Date fechaCreacion, Date fechaRecibida, double total) {
        Id = id;
        this.numero = numero;
        this.fechaCreacion = fechaCreacion;
        this.fechaRecibida = fechaRecibida;
        this.total = total;
    }

    @Override
    public String toString() {
        return "Orden{" +
                "Id=" + Id +
                ", numero='" + numero + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", fechaRecibida=" + fechaRecibida +
                ", total=" + total +
                '}';
    }
}
