/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author aluno
 */
public class ConexaoDerby {

    private static ConexaoDerby instancia;
    
    private ConexaoDerby() {
    }

    public static ConexaoDerby getInstancia() {
        if (instancia ==null){
            instancia = new ConexaoDerby();
        }
        return instancia;
    }
 
    public Connection getConnection() throws ClassNotFoundException, SQLException{
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        return DriverManager.getConnection("jdbc:derby://localhost:1527/PASSAGEMSAEREASDB","sa","123456");
    }
    
    
}
