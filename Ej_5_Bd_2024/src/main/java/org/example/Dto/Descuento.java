package org.example.Dto;

public class Descuento {
    private int Id;
    private int Producto_Id;
    private double PorcentajeDescuento;

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

    public double getPorcentajeDescuento() {
        return PorcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        PorcentajeDescuento = porcentajeDescuento;
    }
}
