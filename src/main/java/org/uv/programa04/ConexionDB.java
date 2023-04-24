/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.programa04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Itzel Rios
 */
public class ConexionDB {
    private Connection con=null;
    
    private ConexionDB(){
        String url="jdbc:postgresql://localhost:5432/ejp";
        String user="postgres";
        String pwd="postgres";
        
        
        try{
            con=DriverManager.getConnection(url,user,pwd);
          Logger.getLogger(ConexionDB.class.getName()).log(Level.INFO, "Se conecto...");
        }catch(SQLException es){
            Logger.getLogger(ConexionDB.class.getName()).log(Level.INFO, "No se conecto");
        }
    }
    public static ConexionDB cx=null;
    public static ConexionDB getInstance(){
        if(cx==null){
            cx=new ConexionDB();
        }
        return cx;
    }
    
    public boolean execute(TransaccionDB tdb){ 
        return tdb.execute(con);
        
    }
}
