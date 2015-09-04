package com.mycompany.app;

import java.sql.*;

  //declare action class
  class DevEnvironAction {

    //Declare table properties
    private String name;
    private String version;
    private String os_notes;

    //Register a JDBC driver and connect to database
    public static void main (String[] args)  {
      Connection conn = null;
      try {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost/devenviron)";
        conn = DriverManager.getConnection(url, "bojana", "bojana");
        Statement st = conn.createStatement();

          //Insert statements
          st.executeUpdate("INSERT INTO environments " +
                  "VALUES ('Mac OS', '10.10', 'My favorite one)");
          st.executeUpdate("INSERT INTO environments " +
                  "VALUES ('Linux', 'Mint', 'Never tried this one)");
          st.executeUpdate("INSERT INTO environments " +
                  "VALUES ('Windows', '7', 'Better than 8)");

          //Select statements
          String sql = "SELECT * FROM environments";
          Statement stmt = conn.createStatement();
          ResultSet rs = stmt.executeQuery(sql);

          // Loop through result set
          while (rs.next()) {
            String name = rs.getString("name");
            String version = rs.getString("version");
            String os_notes = rs.getString("os_notes");


            System.out.println(name + "/n");
            System.out.println(version + "/n");
            System.out.println(os_notes + "/n");
          }//End while loop

          //End result set, statement and connection
          rs.close() ;
          stmt.close() ;
          conn.close();
      }//End try
        catch(SQLException se) {
          se.printStackTrace();
        }//End catch1
        catch(Exception e) {
          //Handle errors for Class.forName
          e.printStackTrace();
        }//End catch2
      finally {
        //Finally block closes resources
        try {
          if(conn!=null)
            conn.close();
        }//End try
        catch(SQLException se) {
          se.printStackTrace();
        }//End catch3
      }//End finally
    }//End main

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

