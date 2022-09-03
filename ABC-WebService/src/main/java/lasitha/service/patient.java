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
public class patient {
    private int patientid;
    private String fname;
    private String lname;
    private String age;
    private String address;
    private String contact;
    private String ward;

    public patient() {
        this.patientid= 0;
        this.fname = "";
        this.lname = "";
        this.age ="";
        this.address ="";
        this.contact = "";
        this.ward = "";
    }
    public patient(int patientid, String fname, String lname,String age ,String address, String contact, String ward) {
        this.patientid = patientid;
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.address = address;
        this.contact = contact;
        this.ward = ward;
    }

    public int getPatientid() {
        return patientid;
    }

    public void setPatientid(int patientid) {
        this.patientid = patientid;
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
    
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }
    
    public static boolean addPatient(patient pat){
   
   Connection conn = null;
   Statement stmt = null;
   String stat="Pending";
   try{
      conn=dbConnection.GetconnectConnection();
  
      
      stmt = conn.createStatement();
      String sql = "Insert into patient(Fname,Lname,Age,Address,Contact,Ward) values ('"+pat.getFname()+"','"+pat.getLname()+"','"+pat.getAge()+"','"+pat.getAddress()+"','"+pat.getContact()+"','"+pat.getWard()+"')";
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
    
    
     public static boolean updatePatient(patient pat){
   
   Connection conn = null;
   Statement stmt = null;
   String stat="Pending";
   try{
      conn=dbConnection.GetconnectConnection();
  
      
      stmt = conn.createStatement();
      String sql = "update patient set Ward='"+pat.getWard()+"' where Patient_ID='"+pat.getPatientid()+"'";
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
     
       public static boolean deletPatient(int id){
   
   Connection conn = null;
   Statement stmt = null;
   String stat="Pending";
   try{
      conn=dbConnection.GetconnectConnection();
  
      
      stmt = conn.createStatement();
      String sql = " delete from patient where Patient_ID='"+id+"'";
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
       
       
         public static patient getPatient(String fname,String lname) {
           patient pat= null;
           Connection conn = null;
           Statement stmt = null;
           try{

             //Class.forName("com.mysql.jdbc.Driver");
             // conn = DriverManager.getConnection(DB_URL, USER, PASS);
               conn=dbConnection.GetconnectConnection();
              stmt = conn.createStatement();
              String sql = "SELECT * from patient WHERE Fname='"+fname+"'And Lname='"+lname+"'";
              ResultSet rs = stmt.executeQuery(sql);
              while(rs.next()){        
               pat= new patient();
               pat.setPatientid(rs.getInt("Patient_ID"));
               pat.setFname(rs.getString("Fname"));
               pat.setLname(rs.getString("Lname"));
               pat.setAge(rs.getString("Age"));
               pat.setAddress(rs.getString("Address"));        
               pat.setContact(rs.getString("Contact"));
               pat.setWard(rs.getString("Ward"));
               
              
              

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

           return pat;
}//end main
         
         
 public static List<patient> getPatients() {
   List<patient> pats= new ArrayList<>();
   Connection conn = null;
   String stat="Quarantined";
   Statement stmt = null;
   try{
     
      conn=dbConnection.GetconnectConnection();
     
      stmt = conn.createStatement();
      String sql = "SELECT * from patient";
      ResultSet rs = stmt.executeQuery(sql);
      while(rs.next()){   
        
             patient pat= new patient();
               pat.setPatientid(rs.getInt("Patient_ID"));
               pat.setFname(rs.getString("Fname"));
               pat.setLname(rs.getString("Lname"));
               pat.setAge(rs.getString("Age"));
               pat.setAddress(rs.getString("Address"));
               pat.setContact(rs.getString("Contact"));
               pat.setWard(rs.getString("Ward"));
                          
                        
                    pats.add(pat);
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
   
   return pats;
}//end main
 

   
}

