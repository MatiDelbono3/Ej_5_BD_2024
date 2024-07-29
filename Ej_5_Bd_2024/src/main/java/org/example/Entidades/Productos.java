package org.example.Entidades;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="Productos")
public class Productos {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
@Column(name = "Nombre", nullable = false)
private String Nombre;
@Column(name = "Precio", nullable = false)
private double Precio;
@OneToMany(mappedBy = "Productos", fetch = FetchType.LAZY)
private List<Descuentos> Descuentos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public List<org.example.Entidades.Descuentos> getDescuentos() {
        return Descuentos;
    }

    public void setDescuentos(List<org.example.Entidades.Descuentos> descuentos) {
        Descuentos = descuentos;
    }
}
