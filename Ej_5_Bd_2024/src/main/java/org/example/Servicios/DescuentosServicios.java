package org.example.Servicios;

import org.example.Dto.Descuento;
import org.example.Dto.Producto;
import org.example.conexiones.HibernateUtil;
import org.hibernate.Session;

public class DescuentosServicios {

public void CrearNuevoDescuento(Producto producto){
    Session session= HibernateUtil.getSession();
    try {
        session.beginTransaction();
        session.save(producto);
        session.getTransaction().commit();
    }finally {
        session.close();
    }
}
}