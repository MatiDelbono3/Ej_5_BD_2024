package org.example.Entidades;

import jakarta.persistence.*;
import org.example.Dto.Producto;

import java.util.List;

@Entity
@Table(name="Descuentos")
public class Descuentos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column(name = "producto_Id")
    private int Producto_Id;
    @Column(name = "Porcentaje_descuento")
    private int PorcentajeDescuento;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "producto_Id")
    private List<Producto> Productos;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getProducto_Id() {
        return Producto_Id;
    }

    public void setProducto_Id(int producto_Id) {
        Producto_Id = producto_Id;
    }

    public int getPorcentajeDescuento() {
        return PorcentajeDescuento;
    }

    public void setPorcentajeDescuento(int porcentajeDescuento) {
        PorcentajeDescuento = porcentajeDescuento;
    }

    public List<Producto> getProductos() {
        return Productos;
    }

    public void setProductos(List<Producto> productos) {
        Productos = productos;
    }
}
