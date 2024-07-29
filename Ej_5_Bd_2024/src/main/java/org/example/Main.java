package org.example;

import org.example.Dto.Producto;
import org.example.Servicios.DescuentosServicios;
import org.example.Servicios.ProductosServicios;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductosServicios ServicioProducto=new ProductosServicios();
        DescuentosServicios ServicioDescuento=new DescuentosServicios();
        Scanner SCANNER=new Scanner(System.in);
        System.out.println("Ingrese el ID de un producto");
        int Id= SCANNER.nextInt();


        while(Id !=0){
            System.out.println("Ingrese el ID de un descuento");
            int Id_Descuento= SCANNER.nextInt();

            // Retornar productos con y sin descuento;
            List<Producto>RetornarProductoConYSinDescuento=ServicioProducto.ObtenerProductosConYSinDescuento();
            RetornarProductoConYSinDescuento.forEach(producto -> System.out.println(producto.getId()));
            RetornarProductoConYSinDescuento.forEach(producto -> System.out.println(producto.getNombre()));
            RetornarProductoConYSinDescuento.forEach(producto -> System.out.println(producto.getPrecio()));

            // Retornar productos sin descuentos
            List<Producto>RetornarProductosSinDescuentos=ServicioProducto.ObtenerProductosSinNingunDescuento();
            RetornarProductosSinDescuentos.forEach(producto -> System.out.println(producto.getId()));
            RetornarProductosSinDescuentos.forEach(producto -> System.out.println(producto.getNombre()));
            RetornarProductosSinDescuentos.forEach(producto -> System.out.println(producto.getPrecio()));

            //Retornar productos con más de 1 descuento
            List<Producto>RetornarProductosConMasDescuentos=ServicioProducto.ObtenerProductoConMasDeUnDescuento();
            RetornarProductosConMasDescuentos.forEach(producto -> System.out.println(producto.getId()));
            RetornarProductosConMasDescuentos.forEach(producto -> System.out.println(producto.getNombre()));
            RetornarProductosConMasDescuentos.forEach(producto -> System.out.println(producto.getNombre()));
            Id = SCANNER.nextInt();
            System.out.println("Ingrese el ID de un descuento");
        }
        }

}