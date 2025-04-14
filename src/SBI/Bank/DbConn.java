package SBI.Bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DbConn {
	
	  Connection connection;
      Statement statement;
      public DbConn(){
          try{
              connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","Shivani@2003");
              statement = connection.createStatement();
          }catch (Exception e){
              e.printStackTrace();
          }


      
  }
}
