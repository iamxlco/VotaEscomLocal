/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Conexion {
Connection conect = null;
public Connection conexion(){
    try {
        Class.forName("com.mysql.jdbc.Driver");
        conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/votaEscom?autoReconnect=true&useSSL=false&serverTimezone=UTC","root","");          
        }catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Error "+e.getMessage());
        }
    return conect;

}
   


 public void closeConnection() {
        try {
            conect.close();
            JOptionPane.showMessageDialog(null, "Se ha finalizado la conexión con el servidor");
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
