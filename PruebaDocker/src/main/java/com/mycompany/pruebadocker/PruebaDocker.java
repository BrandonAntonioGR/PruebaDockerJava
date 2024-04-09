/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pruebadocker;

import com.pollito.DAO.entity.Oficio;
import com.pollito.DAO.model.ConsultaOficio;

/**
 *
 * @author mkpol
 */
public class PruebaDocker {

    public static void main(String[] args) {
        System.setProperty("java.awt.headless", "true");
        ConsultaOficio co= new ConsultaOficio();
        Oficio oficio=co.consultaOficio();
        String of=oficio.getOficio();
        System.out.println("La variaboe tiene: "+of);
    }
}
