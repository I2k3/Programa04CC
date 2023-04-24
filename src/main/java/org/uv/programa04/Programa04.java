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
        DAOEmpleado daoEmpleado=new DAOEmpleado();
        Empleado emp=new Empleado(25, "Gabriel", "Av1", "1111");
        //TransaccionGuardarEmpleado tge=new TransaccionGuardarEmpleado(emp);
        /*//
        daoEmpleado.create(emp);*/
        
        /*//
        daoEmpleado.delete(10L);*/
        
        
        /*//emp.setClave(1);
        emp.setNombre("Juan");
        emp.setTelefono("222");
        daoEmpleado.update(emp, emp.getClave());*/
        
       /* //List<Empleado> lista=daoEmpleado.findAll();
        Iterator <Empleado> i = lista.iterator();
        while(i.hasNext()){
            emp=i.next();
            System.out.println("Clave: "+emp.getClave()+" Nombre: "+emp.getNombre()+" Dirección: "+emp.getDireccion()+" Telefono: "+emp.getTelefono());
        }
        */
       
       /*//Empleado emp2=new Empleado();
       emp2=daoEmpleado.findbyID(25L, emp2);
       System.out.println("Nombre: " +emp2.getNombre());*/
        
    }
}
