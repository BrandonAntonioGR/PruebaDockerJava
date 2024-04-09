/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pollito.DAO.model;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author mkpol
 */
public class ModelConection {
    public static Connection getConnection(){
        Connection con;
        try{
            String url2="jdbc:sqlserver://DESKTOP-DSSMACN:1433;"
                    + "databaseName=Oficios;"
                    + "user=sa;"
                    + "password=123;"
                    + "encrypt=true;"
                    + "trustServerCertificate=true;";
            con= DriverManager.getConnection(url2);
            System.out.print("Conectado!");
            return con;
        }catch(Exception e){
            System.out.println("Error en ModelConection: "+e);
            return null;
        }
    }    
}
