package com.mycompany.app;

import java.sql.*;

  //declare action class
  class DevEnvironAction {

    //Declare table properties
    private String name;
    private String version;
    private String os_notes;

    //Register a JDBC driver and connect to database
    public static void main (String[] args) {
      try {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost/devenviron)";
        Connection conn = DriverManager.getConnection(url, "bojana", "bojana");
        Statement st = conn.createStatement();

          //Insert statements
          st.executeUpdate("INSERT INTO environments " +
                  "VALUES ('Mac OS', '10.10', 'My favorite one)");
          st.executeUpdate("INSERT INTO environments " +
                  "VALUES ('Linux', 'Mint', 'Never tried this one)");
          st.executeUpdate("INSERT INTO environments " +
                  "VALUES ('Windows', '7', 'Better than 8)");

          //Select statements


          conn.close();
      }//End try
        catch (Exception e)
        {
          System.err.println("Got an exception! ");
          System.err.println(e.getMessage());
        }//end catch
    }//Ends main

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

