/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package org.uv.programa04;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Itzel Rios
 */
public class Programa04 {

    public static void main(String[] args) {
        DAOEmpleado dao=new DAOEmpleado();
        Empleado emp=new Empleado();
        emp.setClave(12);
        emp.setNombre("Gabriel");
        emp.setDireccion("Av1");
        emp.setTelefono("1111");
        dao.create(emp);       
//Delete
//        dao.delete(2);
//        
//Update
//        Empleado p=new Empleado();
//        p.setNombre("Antonio");
//        p.setDireccion("Calle 2");
//        p.setTelefono("1122334455");
//        Empleado em=dao.update(1, p);
//        System.out.println(em.getNombre());
//       
//FindALl
//        dao.findAll();
//        
//Find by Id
        //dao.findById(2);
        Empleado em = dao.findById(3);
        System.out.println(em.getNombre());
    }
}
