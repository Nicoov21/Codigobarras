package com.mycompany.proyectoinventario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ProyectoInventario {

    public static void main(String[] args) {
        LoginPrincipal login = new LoginPrincipal();
        login.setVisible(true);
        
        String url = "jdbc:sqlserver://localhost:1433;databaseName=Pruebas;encrypt=false";
        String user = "alumnos";
        String pass = "alumnos";
        
        try(Connection conexion = DriverManager.getConnection(url,user,pass)){
            System.out.println("conexion existosa");
        }catch(SQLException e){
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
