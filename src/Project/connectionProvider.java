/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.sql.*;

/**
 *
 * @author Saket Saurabh
 */ 
public class connectionProvider {
    public static Connection getcon()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/billing","root","password");
            return con;
        }
            catch(Exception e)
            {
                return null;
            }
    }
}
