/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billingsystem.controller;

import billingsystem.db.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import billingsystem.model.User;
/**
 *
 * @author Sudarshi
 */
public class LoginController {
        public static User getLogin(String username, String password) throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst;
            rst = stm.executeQuery("SELECT * FROM users WHERE username='" + username + "' AND password='" + password + "'");
        if (rst.next()) {
            User user = new User();
            user.setUsername(rst.getString(2));
            user.setPassword(rst.getString(3));            
            return user;  
        }else {
            return null;
        }
          
        }


}
