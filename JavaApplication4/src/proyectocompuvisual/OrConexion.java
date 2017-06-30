/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocompuvisual;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author pppppppppppppppppppp
 */
public class OrConexion {
    
    String driver="oracle.jdbc.OracleDriver";
    String url="jdbc:oracle:thin:@localhost:1521:XE";
    String user="ZAPATERIA";
    String pwd ="ZAPATERIA";
    Connection con;
    Statement st;
    ResultSet res;
    public void conectar(){
        
          try{
       
        con=DriverManager.getConnection(url,user,pwd);
        st=con.createStatement();
    }catch(Exception e)
    {
        JOptionPane.showMessageDialog(null, "Conexion Fallida... \n" +e);
    }
    }

    }
    
    

