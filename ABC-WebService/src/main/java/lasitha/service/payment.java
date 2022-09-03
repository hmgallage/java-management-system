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
public class payment {
    private int paymentid;
    private String fname;
    private String patientno;
    private String treatments;
    private String tests;
    private String drugs;
    private String addfee;

    public payment() {
        this.paymentid= 0;
        this.fname = "";
        this.patientno = "";
        this.treatments= "";
        this.tests= "";
        this.drugs= "";
        this.addfee= "";
        
       
    }
    public payment(int paymentid, String fname, String patientno, String treatments, String tests, String drugs, String addfee) {
        this.paymentid = paymentid;
        this.fname = fname;
        this.patientno = patientno;
        this.treatments = treatments;
        this.tests = tests;
        this.drugs = drugs;
        this.addfee = addfee;
    }

    public int getPaymentid() {
        return paymentid;
    }

    public void setPaymentid(int paymentid) {
        this.paymentid = paymentid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getTreatments() {
        return treatments;
    }

    public void setTreatments(String treatments) {
        this.treatments = treatments;
    }
    
    public String getTests() {
        return tests;
    }
    
     public void setTests(String tests) {
        this.tests = tests;
    }
    
    public String getDrugs() {
        return drugs;
    }

    public void setDrugs(String drugs) {
        this.drugs = drugs;
    }

    public String getAddfee() {
        return addfee;
    }

    public void setAddfee(String addfee) {
        this.addfee = addfee;
    }

    public String getPatientno() {
        return patientno;
    }

    public void setPatientno(String patientno) {
        this.patientno = patientno;
    }
    
    
    public static boolean addPayment(payment pay){
   
   Connection conn = null;
   Statement stmt = null;
   String stat="Pending";
   try{
      conn=dbConnection.GetconnectConnection();
  
      
      stmt = conn.createStatement();
      String sql = "Insert into payment(Fname,Patientno,Treatments,Tests,Drugs,Addfee) values ('"+pay.getFname()+"','"+pay.getPatientno()+"','"+pay.getTreatments()+"','"+pay.getTests()+"','"+pay.getDrugs()+"''"+pay.getAddfee()+"')";
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
    
    
     public static boolean updatePayment(payment pay){
   
   Connection conn = null;
   Statement stmt = null;
   String stat="Pending";
   try{
      conn=dbConnection.GetconnectConnection();
  
      
      stmt = conn.createStatement();
      String sql = "update payment set Payment=''+pay.getAddfee()+ where Payment_ID=''"+pay.getPaymentid()+"'";
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
     
      
    
       
       
         public static payment getPayment(int Paymentid) {
           payment pay= null;
           Connection conn = null;
           Statement stmt = null;
           try{

             //Class.forName("com.mysql.jdbc.Driver");
             // conn = DriverManager.getConnection(DB_URL, USER, PASS);
               conn=dbConnection.GetconnectConnection();
              stmt = conn.createStatement();
              String sql = "SELECT * from payment WHERE Paymentid='"+Paymentid;
              ResultSet rs = stmt.executeQuery(sql);
              while(rs.next()){        
               pay= new payment();
               pay.setPaymentid(rs.getInt("Payment_ID"));
               pay.setFname(rs.getString("Fname"));
               pay.setPatientno(rs.getString("Patientno"));
               pay.setTreatments(rs.getString("Treatments"));    
               pay.setTests(rs.getString("Tests"));
               pay.setDrugs(rs.getString("Drugs"));
              
               pay.setAddfee(rs.getString("Addfee"));
              

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
              }//nd finally try
           }//end try
           System.out.println("Goodbye!");

           return pay;
}//end main
         
         
 public static List<payment> getPayments() {
   List<payment> pays= new ArrayList<>();
   Connection conn = null;
   String stat="Quarantined";
   Statement stmt = null;
   try{
     
      conn=dbConnection.GetconnectConnection();
     
      stmt = conn.createStatement();
      String sql = "SELECT * from payment";
      ResultSet rs = stmt.executeQuery(sql);
      while(rs.next()){   
        
             payment pay= new payment();
               
               pay.setPaymentid(rs.getInt("Payment_ID"));
               pay.setFname(rs.getString("Fname"));
               pay.setPatientno(rs.getString("Patientno"));
               pay.setTreatments(rs.getString("Treatments"));    
               pay.setTests(rs.getString("Tests"));
               pay.setDrugs(rs.getString("Drugs"));
              
               pay.setAddfee(rs.getString("Addfee"));
                    pays.add(pay);
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
   
   return pays;
}//end main
 

   
}

