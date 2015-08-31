package com.mycompany.app;

import java.sql.Connection;
import java.sql.DriverManager;

//declare action class
  public class DevEnvironAction {

    //declare table properties
     private String name;
     private String version;
     private String os_notes;

        public String execute() {
          String ret = ERROR;
          Connection conn = null;

          //Register a JDBC driver
          try {
             String URL = "jdbc:mysql://localhost/devenviron";
             Class.forName("com.mysql.jdbc.Driver");
             conn = DriverManager.getConnection(URL, "bojana", "bojana");
             String sql = "SELECT name FROM login WHERE";
             sql += " user = ? AND password = ?";

         }//Ends Class.forName()

       }//Ends execute()

     //Getters and Setters for above properties
     public String getName() {
        return name;
     }//Ends getName

     public void setName(String name) {
         this.name = name;
     }//Ends setName

     public String getVersion() {
        return version;
     }//Ends getVersion

     public void setVersion(String version) {
         this.version = version;
     }//Ends setVersion

     public String getOs_notes() {
         return os_notes;
     }//Ends getOs_notes

    public void setOs_notes(String os_notes) {
        this.os_notes = os_notes;
    }//Ends setOs_notes

}//End DevEnvironAction class declaration

