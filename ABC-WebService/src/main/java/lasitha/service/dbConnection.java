/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lasitha.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author ACER
 */
public class dbConnection {
    static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/abchospitals";
   static final String USER = "root";
   static final String PASS = "lasitha12345";
        public static Connection GetconnectConnection() //returning syngelton connection object
    {
  
        Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
              con = DriverManager.getConnection(DB_URL, USER, PASS);
            //JOptionPane.showMessageDialog(null, "database connected");
        }
        catch(ClassNotFoundException | SQLException ex){
            System.out.println("Error connecting"+ex);
        }
        return con;
    }
       
        public static void main(String[] args) {
//     
//            doctor obj = new doctor();
//            obj.setFname("chamal");
//            obj.setLname("peiris");
//            obj.setEmail("chamal@gmail.com");
//            obj.setPass("12345");
//            
//            
//            boolean success = doctor.addDoctor(obj);
//            if(success==true){
//                System.out.println("Success");
//            
//            }else{
//              System.out.println("Error");
//            }

//doctor obj = new doctor();
//obj.setDoctorid(1);
//obj.setEmail("lasitha@gmail.com");
//obj.setPass("11111");
//
//boolean success = doctor.updateDoctor(obj);
//if(success==true){
//             System.out.println("Success");
//      
//     }else{
//              System.out.println("Error");
//    }
//        }

//doctor obj= doctor.getDcotor("lasitha@gmail.com","11111");
//
//if(obj==null){
//System.out.println("Error");
//}else{
//
//System.out.println(obj.getFname());
//}


//List<doctor> doc = doctor.getDoctors();
//
//for(doctor st:doc){
//
//System.out.println(st.getFname());
//
//}

//boolean success = doctor.deletDoctor(3);
//            if(success==true){
//                System.out.println("Success");
//            
//            }else{
//              System.out.println("Error");
//            }

//patient obj = new patient();
//obj.setFname("john");
//obj.setLname("smith");
//obj.setAge("50");
//obj.setAddress("111aas");
//obj.setContact("00214787");
//obj.setWard("1563322");
//
//boolean Sucess= patient.addPatient(obj);
//if(Sucess==true){
//
//    System.out.println("Success");
//
//}
//else{
//              System.out.println("Error");
//            }
//}
//}

//Payment pay= new Payment();
//pay.setFname(fname);
//pay.setPatientno(patientno);
//pay.setTreatments(treatments);
//pay.setTests(tests);
//pay.setDrugs(drugs);
//pay.setAddfee(addfee);
//
//
//boolean Sucess= patient.addPatient(obj);
//if(Sucess==true){
//
//    System.out.println("Success");
//
//}
//else{
//              System.out.println("Error");
//            }
//
}
}