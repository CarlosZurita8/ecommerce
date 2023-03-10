package com.springecommerce.ecommerce.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "detalles")
public class DetalleOrden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String nombre;
    private String cantidad;
    private double precio;
    private double total;
    @OneToOne
    private Orden orden;
    @ManyToOne
    private Producto producto;

    public DetalleOrden(){

    }

    public DetalleOrden(Long id, String nombre, String cantidad, double precio, double total) {
        Id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.total = total;
    }

    @Override
    public String toString() {
        return "DetalleOrden{" +
                "Id=" + Id +
                ", nombre='" + nombre + '\'' +
                ", cantidad='" + cantidad + '\'' +
                ", precio=" + precio +
                ", total=" + total +
                '}';
    }
}
