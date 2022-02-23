/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionSql;

/**
 *
 * @author CRISTINA
 */
import com.mysql.jdbc.Connection;
import javax.swing.JOptionPane;
public class conexionSql {
    
    Connection conectar=null;
    
    public Connection conexion(){
    
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            conectar = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:/Cafeteria","root","admin");
            JOptionPane.showMessageDialog(null,"Conexiòn exitosa");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Conexiòn fallida" + e.getMessage());
        }
         return conectar;
    }
   
    
}
