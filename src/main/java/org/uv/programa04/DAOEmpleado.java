/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.programa04;

import java.sql.Connection;
import java.util.ArrayList;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 *
 * @author Itzel Rios
 */
public class DAOEmpleado implements IDAOGeneral<Empleado, Long> {
    @Override
    public Empleado create(Empleado p) {
        ConexionDB cx = ConexionDB.getInstance();
        TransaccionDB tdb = new TransaccionDB<Empleado>(p) {
            @Override
            public boolean execute(Connection con) {
                try (PreparedStatement query = con.prepareStatement("insert into empleados(clave, nombre, direccion, telefono) values (?, ?, ?, ?)")) {
                    query.setLong(1, p.getClave());
                    query.setString(2, p.getNombre());
                    query.setString(3, p.getDireccion());
                    query.setString(4, p.getTelefono());
                    query.execute();
                    return true;
                } catch (SQLException ex) {
                    Logger.getLogger(DAOEmpleado.class.getName()).log(Level.SEVERE, null, ex);
                    return false;
                }
            }
        };
        boolean res = cx.execute(tdb);
        if (res) {
            Logger.getLogger(DAOEmpleado.class.getName()).log(Level.INFO, "Se guardó");
        } else {
            Logger.getLogger(DAOEmpleado.class.getName()).log(Level.INFO, "No se realizó la operación solicitada");
        }
        return p;
    }

    @Override
    public boolean delete(Long id) {
        ConexionDB cx = ConexionDB.getInstance();
        TransaccionDB tdb = new TransaccionDB<Long>(id) {
            @Override
            public boolean execute(Connection con) {
                try (PreparedStatement pst = con.prepareStatement("delete from empleados where clave=?")) {
                    pst.setLong(1, id);
                    pst.execute();
                    return true;
                } catch (SQLException ex) {
                    Logger.getLogger(DAOEmpleado.class.getName()).log(Level.SEVERE, "No se realizó", ex);
                    return false;
                }
            }
        };
        boolean res = cx.execute(tdb);
        if (res) {
            Logger.getLogger(DAOEmpleado.class.getName()).log(Level.INFO, "Se ha borrado");
        } else {
            Logger.getLogger(DAOEmpleado.class.getName()).log(Level.INFO, "No se realizó la operación solicitada");
        }
        return res;
    }

    @Override
    public Empleado update(Empleado p, Long id) {
        ConexionDB cx = ConexionDB.getInstance
