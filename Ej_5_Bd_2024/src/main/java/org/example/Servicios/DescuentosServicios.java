package org.example.Servicios;

import org.example.Dto.Descuento;
import org.example.conexiones.HibernateUtil;
import org.hibernate.Session;

public class DescuentosServicios {

public void CrearNuevoDescuento(int Id_Producto){
    Session session= HibernateUtil.getSession();
    try {
        session.beginTransaction();
        session.save(Id_Producto);
        session.getTransaction().commit();
    }finally {
        session.close();
    }
}
}