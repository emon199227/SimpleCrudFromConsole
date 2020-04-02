/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.emon.connection;

import info.emon.MySqlDbConnection;
import java.sql.Connection;

/**
 *
 * @author Emon
 */
public class Dbconnection {

        static Connection connection = null;
public static Connection getConnections(){
connection = MySqlDbConnection.getConnection("studentdb", "root", "1234");
return connection;

}

}