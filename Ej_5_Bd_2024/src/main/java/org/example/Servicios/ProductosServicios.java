package org.example.Servicios;

import org.example.Dto.Producto;
import org.example.conexiones.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class ProductosServicios {
    public List<Producto>ObtenerProductosConYSinDescuento(){
        Session session= HibernateUtil.getSession();
        List<Producto>ObtenerProductosConYSinDescuento=new ArrayList<>();
        try{
            session.beginTransaction();
            var resultado1=session.createQuery("SELECT P.Id, p.Precio," + "(p.precio-(precio*COALESCE(d.porcentajeDescuento, 0))) AS (PrecioConDescuento, " +  "(p.precio - (p.precio-(precio*COALESCE, d.porcentajeDescuento,0)))) AS Diferencia" +  "FROM Producto p " + "LEFT JOIN Descuento d ON p.id=d.ProductoId" + "ORDERBY diferencia DESC");
            ObtenerProductosConYSinDescuento=resultado1.getResultList();
            session.getTransaction().commit();
        }finally {
            session.close();
        }
        return ObtenerProductosConYSinDescuento;
    }
    public List<Producto>ObtenerProductosSinNingunDescuento(){
        Session session=HibernateUtil.getSession();
        List<Producto>ObtenerProductosSinDescuento=new ArrayList<>();
        try{
            session.beginTransaction();
            var resultado2=session.createQuery("SELECT p." + "FROM producto p " + "WHERE p.Id NOT IN (SELECT d.ProductoId FROM descuento d");
            ObtenerProductosSinDescuento=resultado2.getResultList();
            session.getTransaction().commit();
        }finally {
            session.close();
        }
        return ObtenerProductosSinDescuento;
    }
    public List<Producto>ObtenerProductoConMasDeUnDescuento(){
        Session session=HibernateUtil.getSession();
        List<Producto>ObtenerProductosConMasDescuentos=new ArrayList<>();
        try{
            session.beginTransaction();
            var resultado3=session.createQuery("SELECT p.id, p.nombre, COUNT (d.producto.id) AS Nrodescuentos" + "FROM producto p" + "JOIN descuento d ON p.id=d.producto_id" + "GROUP BY p.Id, p.Nombre" + "HAVING COUNT (d.producto_Id) > 1" );
            ObtenerProductosConMasDescuentos=resultado3.getResultList();
            session.getTransaction().commit();
        }finally {
            session.close();
        }
        return ObtenerProductosConMasDescuentos;
    }
}
