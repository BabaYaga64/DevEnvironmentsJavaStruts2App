package com.mycompany.app;

 class DevEnvironAction {
     private String name;

     public String getName() {
        return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public String execute throws Exception {
         return "success";
     }
 }
