/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pollito.DAO.model;

import com.pollito.DAO.entity.Oficio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author mkpol
 */
public class ConsultaOficio {
    public static Oficio consultaOficio(){
        Connection con;
        PreparedStatement ps;
        try{
            con=ModelConection.getConnection();
            ps=con.prepareStatement("SELECT TOP 1 [num_Oficio]\n" +
                    "  FROM [Oficios].[dbo].[TOFICIO_ENVIADOS]");
            ResultSet rs=ps.executeQuery();
            Oficio usuario=new Oficio();
            while(rs.next()){
                usuario.setOficio(rs.getString("num_Oficio"));
            }
            cerrarConexion(con, ps, rs);
            return usuario;
        }catch(Exception e){
            System.out.println("Error en ConsultaAgentes: "+e);
            return null;
        }

    }
    public static void cerrarConexion(Connection con,PreparedStatement ps,ResultSet rs) throws SQLException {
        con.close();
        ps.close();
        rs.close();
    }
}
