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
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese el ID de un producto");
        int Id= scanner.nextInt();


        while(Id !=0){
            System.out.println("Ingrese el ID de un descuento");
            int Id_Descuento=scanner.nextInt();

            // Retornar productos con y sin descuento;
            List<Producto>RetornarProductoConYSinDescuento=ServicioProducto.ObtenerProductosConYSinDescuento();
            RetornarProductoConYSinDescuento.forEach(producto -> System.out.println("ID: " + producto.getId() + ",Nombre: " + producto.getNombre() + ", Precio: " + producto.getPrecio()));


            // Retornar productos sin descuentos
            List<Producto>RetornarProductosSinDescuentos=ServicioProducto.ObtenerProductosSinNingunDescuento();
            RetornarProductoConYSinDescuento.forEach(producto -> System.out.println("ID: " + producto.getId() + ",Nombre: " + producto.getNombre() + ", Precio: " + producto.getPrecio()));

            //Retornar productos con más de 1 descuento
            List<Producto>RetornarProductosConMasDescuentos=ServicioProducto.ObtenerProductosSinNingunDescuento();
            RetornarProductosConMasDescuentos.forEach(producto -> System.out.println("ID: " + producto.getId() + ",Nombre: " + producto.getNombre() + ", Precio: " + producto.getPrecio()));

            Id = scanner.nextInt();
            System.out.println("Ingrese el ID de un descuento");
        }
        }

}