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
public class doctor {
    private int doctorid;
    private String fname;
    private String lname;
    private String address;
    private String email;
    private String pass;

    public doctor() {
        this.doctorid= 0;
        this.fname = "";
        this.lname = "";
        this.address ="";
        this.email = "";
        this.pass = "";
    }
    public doctor(int doctorid, String fname, String lname, String address, String email, String pass) {
        this.doctorid = doctorid;
        this.fname = fname;
        this.lname = lname;
        this.address = address;
        this.email = email;
        this.pass = pass;
    }

    public int getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(int doctorid) {
        this.doctorid = doctorid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    
    public static boolean addDoctor(doctor doc){
   
   Connection conn = null;
   Statement stmt = null;
   String stat="Pending";
   try{
      conn=dbConnection.GetconnectConnection();
  
      
      stmt = conn.createStatement();
      String sql = "Insert into doctor(Fname,Lname,Address,Email,Password) values ('"+doc.getFname()+"','"+doc.getLname()+"','"+doc.getAddress()+"','"+doc.getEmail()+"','"+doc.getPass()+"')";
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
    
    
     public static boolean updateDoctor(doctor doc){
   
   Connection conn = null;
   Statement stmt = null;
   String stat="Pending";
   try{
      conn=dbConnection.GetconnectConnection(); //recieveing the singleton connection object
  
      
      stmt = conn.createStatement();
      String sql = "update doctor set Email='"+doc.getEmail()+"',Password='"+doc.getPass()+"' where Doctor_ID='"+doc.getDoctorid()+"'";
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
     
       public static boolean deletDoctor(int id){
   
   Connection conn = null;
   Statement stmt = null;
   String stat="Pending";
   try{
      conn=dbConnection.GetconnectConnection();
  
      
      stmt = conn.createStatement();
      String sql = " delete from doctor where Doctor_ID='"+id+"'";
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
       
       
         public static doctor getDcotor(String mail,String password) {
           doctor doc= null;
           Connection conn = null;
           Statement stmt = null;
           try{

             //Class.forName("com.mysql.jdbc.Driver");
             // conn = DriverManager.getConnection(DB_URL, USER, PASS);
               conn=dbConnection.GetconnectConnection();
              stmt = conn.createStatement();
              String sql = "SELECT * from doctor WHERE Email='"+mail+"'And Password='"+password+"'";
              ResultSet rs = stmt.executeQuery(sql);
              while(rs.next()){        
               doc= new doctor();
               doc.setDoctorid(rs.getInt("Doctor_ID"));
               doc.setFname(rs.getString("Fname"));
               doc.setLname(rs.getString("Lname"));
                       
               doc.setEmail(rs.getString("Email"));
               doc.setPass(rs.getString("Password"));
               
              
              

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

           return doc;
}//end main
         
         
 public static List<doctor> getDoctors() {
   List<doctor> docs= new ArrayList<>();
   Connection conn = null;
   String stat="Quarantined";
   Statement stmt = null;
   try{
     
      conn=dbConnection.GetconnectConnection();
     
      stmt = conn.createStatement();
      String sql = "SELECT * from doctor";
      ResultSet rs = stmt.executeQuery(sql);
      while(rs.next()){   
        
             doctor doc= new doctor();
               doc.setDoctorid(rs.getInt("Doctor_ID"));
               doc.setFname(rs.getString("Fname"));
               doc.setLname(rs.getString("Lname"));
               doc.setAddress(rs.getString("Address"));
               doc.setEmail(rs.getString("Email"));
               doc.setPass(rs.getString("Password"));
                          
                        
                    docs.add(doc);
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
   
   return docs;
}//end main
 

   
}

