/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lasitha.service;

import com.google.protobuf.Message;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class drug {
    private int drugid;
    private String dname;
    private String dqty;
 

    public drug () {
        this.drugid= 0;
        this.dname = "";
        this.dqty = "";
    }
    public drug(int drugid, String dname, String dqty) {
        this.drugid = drugid;
        this.dname = dname;
        this.dqty = dqty;
    }

    public int Drugid() {
        return drugid;
    }

    public void setDrugid(int drugid) {
        this.drugid = drugid;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDqty() {
        return dqty;
    }

    public void setDqty(String dqty) {
        this.dqty = dqty;
    }
    
  
    
    public static boolean addDrug(drug drg){
   
   Connection conn = null;
   Statement stmt = null;
   String stat="Pending";
   try{
      conn=dbConnection.GetconnectConnection();
  
      
      stmt = conn.createStatement();
      String sql = "Insert into drug(Dname,Dqty,) values ('"+drg.getDname()+"','"+drg.getDqty()+"'''";
      stmt.executeUpdate(sql);

      return true;
     
   }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            conn.close();
      }catch(SQLException se){
      }// do nothing
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   //System.out.println("Goodbye!");
    
    return false;
}   
    
    
     public static boolean updateDrug(drug drg){
   
   Connection conn = null;
   Statement stmt = null;
   String stat="Pending";
   try{
      conn=dbConnection.GetconnectConnection();
  
      
      stmt = conn.createStatement();
      String sql = "update drug set Dqty='"+drg.getDqty()+"''";
      stmt.executeUpdate(sql);

      return true;
     
   }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            conn.close();
      }catch(SQLException se){
      }// do nothing
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   //System.out.println("Goodbye!");
    
    return false;
}   
     
       public static boolean deletDrug(int id){
   
   Connection conn = null;
   Statement stmt = null;
   String stat="Pending";
   try{
      conn=dbConnection.GetconnectConnection();
  
      
      stmt = conn.createStatement();
      String sql = " delete from drug where Drug_ID='"+id+"'";
      stmt.executeUpdate(sql);

      return true;
     
   }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            conn.close();
      }catch(SQLException se){
      }// do nothing
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   //System.out.println("Goodbye!");
    
    return false;
}
       
       
       
       
       
          public static drug getDrug(String name) {
           drug drg= null;
           Connection conn = null;
           Statement stmt = null;
           try{

             //Class.forName("com.mysql.jdbc.Driver");
             // conn = DriverManager.getConnection(DB_URL, USER, PASS);
               conn=dbConnection.GetconnectConnection();
              stmt = conn.createStatement();
              String sql = "SELECT * from drug WHERE Dname='"+name+"'";
              ResultSet rs = stmt.executeQuery(sql);
              while(rs.next()){        
               drg= new drug();
               drg.setDrugid(rs.getInt("Drug_ID"));
               drg.setDname(rs.getString("Dname"));
               drg.setDqty(rs.getString("Dqty"));
                       
              
               
              
              

              }
              rs.close();
           }catch(SQLException se){
              //Handle errors for JDBC
              se.printStackTrace();
           }catch(Exception e){
              //Handle errors for Class.forName
              e.printStackTrace();
           }finally{
              //finally block used to close resources
              try{
                 if(stmt!=null)
                    conn.close();
              }catch(SQLException se){
              }// do nothing
              try{
                 if(conn!=null)
                    conn.close();
              }catch(SQLException se){
                 se.printStackTrace();
              }//end finally try
           }//end try
           //System.out.println("Goodbye!");

           return drg;
}//end main
       
   
         
         
 public static List<drug> getDrugs() {
   List<drug> drgs= new ArrayList<>();
   Connection conn = null;
   String stat="Quarantined";
   Statement stmt = null;
   try{
     
      conn=dbConnection.GetconnectConnection();
     
      stmt = conn.createStatement();
      String sql = "SELECT * from drug";
      ResultSet rs = stmt.executeQuery(sql);
      while(rs.next()){   
        
             drug drg= new drug();
               drg.setDrugid(rs.getInt("Drug_ID"));
               drg.setDname(rs.getString("Dname"));
               drg.setDqty(rs.getString("Dqty"));
               
                          
                        
                    drgs.add(drg);
      }
      rs.close();
   }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            conn.close();
      }catch(SQLException se){
      }// do nothing
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   //System.out.println("Goodbye!");
   
   return drgs;
}//end main
 

   
}

