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
public class user {
    private int userid;
    private String fname;
    private String lname;
    private String address;
    private String contact;
    private String bday;
    private String reg;
    private String email;
    private String pass;

    public user() {
        this.userid= 0;
        this.fname = "";
        this.lname = "";
        this.address ="";
        this.contact ="";
        this.bday ="";
        this.reg ="";
        this.email = "";
        this.pass = "";
    }
    public user(int userid, String fname, String lname, String address,String contact,String bday,String reg, String email, String pass) {
        this.userid = userid;
        this.fname = fname;
        this.lname = lname;
        this.address = address;
        this.address = contact;
        this.address = bday;
        this.address = reg;
        this.email = email;
        this.pass = pass;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
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
    
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    
    public String getBday() {
        return bday;
    }

    public void setBday(String bday) {
        this.bday = bday;
    }
    
    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
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
    
    
    public static boolean addUser(user use){
   
   Connection conn = null;
   Statement stmt = null;
   String stat="Pending";
   try{
      conn=dbConnection.GetconnectConnection();
  
      
      stmt = conn.createStatement();
      String sql = "Insert into user(Fname,Lname,Address,Contact,Bday,Reg,Email,Password) values ('"+use.getFname()+"','"+use.getLname()+"','"+use.getAddress()+"','"+use.getContact()+"','"+use.getBday()+"','"+use.getReg()+"','"+use.getEmail()+"','"+use.getPass()+"')";
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
    
    
     public static boolean updateUser(user use){
   
   Connection conn = null;
   Statement stmt = null;
   String stat="Pending";
   try{
      conn=dbConnection.GetconnectConnection();
  
      
      stmt = conn.createStatement();
      String sql = "update user set Email='"+use.getEmail()+"',Password='"+use.getPass()+"' where User_ID='"+use.getUserid()+"'";
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
     
       public static boolean deletUser(int id){
   
   Connection conn = null;
   Statement stmt = null;
   String stat="Pending";
   try{
      conn=dbConnection.GetconnectConnection();
  
      
      stmt = conn.createStatement();
      String sql = " delete from user where User_ID='"+id+"'";
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
       
       
         public static user getUser(String mail,String password) {
           user use= null;
           Connection conn = null;
           Statement stmt = null;
           try{

             //Class.forName("com.mysql.jdbc.Driver");
             // conn = DriverManager.getConnection(DB_URL, USER, PASS);
               conn=dbConnection.GetconnectConnection();
              stmt = conn.createStatement();
              String sql = "SELECT * from user WHERE Email='"+mail+"'And Password='"+password+"'";
              ResultSet rs = stmt.executeQuery(sql);
              while(rs.next()){        
               use= new user();
               use.setUserid(rs.getInt("Doctor_ID"));
               use.setFname(rs.getString("Fname"));
               use.setLname(rs.getString("Lname"));
               use.setAddress(rs.getString("Address"));
               use.setContact(rs.getString("Contact"));
               use.setBday(rs.getString("Bday"));
               use.setReg(rs.getString("Reg"));
                       
               use.setEmail(rs.getString("Email"));
               use.setPass(rs.getString("Password"));
               
              
              

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

           return use;
}//end main
         
         
 public static List<user> getUsers() {
   List<user> uses= new ArrayList<>();
   Connection conn = null;
   String stat="Quarantined";
   Statement stmt = null;
   try{
     
      conn=dbConnection.GetconnectConnection();
     
      stmt = conn.createStatement();
      String sql = "SELECT * from user";
      ResultSet rs = stmt.executeQuery(sql);
      while(rs.next()){   
        
             user use= new user();
               use.setUserid(rs.getInt("User_ID"));
               use.setFname(rs.getString("Fname"));
               use.setLname(rs.getString("Lname"));
               use.setAddress(rs.getString("Address"));
               use.setContact(rs.getString("Contact"));
               use.setBday(rs.getString("Bday"));
               use.setReg(rs.getString("Reg"));
               use.setEmail(rs.getString("Email"));
               use.setPass(rs.getString("Password"));
                          
                        
                    uses.add(use);
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
   
   return uses;
}//end main
 

   
}

