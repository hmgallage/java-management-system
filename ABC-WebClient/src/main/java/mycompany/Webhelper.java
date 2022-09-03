/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycompany;

import java.util.List;
import lasitha.service.Doctor;
import lasitha.service.User;
import lasitha.service.Payment;
import lasitha.service.Drug;
import lasitha.service.App;
import lasitha.service.Patient;

import lasitha.service.MyWebService;
import lasitha.service.MyWebService_Service;

/**
 *
 * @author ACER
 */
public class Webhelper {
        
    public static String hello(String text){
   //     session.invalidate(); 
  MyWebService_Service client=new MyWebService_Service();          //auto generated class in the generated source code
         
         MyWebService proxy=client.getMyWebServicePort();  
         
        String message= proxy.hello(text);
        
             return message;    
     }
    
     public static boolean addDoctor(Doctor doc){
   //     session.invalidate(); 
  MyWebService_Service client=new MyWebService_Service();          //auto generated class in the generated source code
         
         MyWebService proxy=client.getMyWebServicePort();  
         
        boolean success= proxy.addDoctor(doc);
        
             return success;    
     }
     public static Doctor getDoctor(String email, String pass){
   //     session.invalidate(); 
  MyWebService_Service client=new MyWebService_Service();          //auto generated class in the generated source code
         
         MyWebService proxy=client.getMyWebServicePort();  
         
        Doctor obj = proxy.getDoctor(email, pass);
        
             return obj;    
     }
     
     public static List<Doctor> getDoctors(){
   //     session.invalidate(); 
  MyWebService_Service client=new MyWebService_Service();          //auto generated class in the generated source code
         
         MyWebService proxy=client.getMyWebServicePort();  
         
       List<Doctor> docs= proxy.getDoctors();
       
       return docs;
     }
     
         public static boolean deleteDoctor(int id){
   //     session.invalidate(); 
  MyWebService_Service client=new MyWebService_Service();          //auto generated class in the generated source code
         
         MyWebService proxy=client.getMyWebServicePort();  
         
      boolean docs= proxy.deleteDoctor(id);
       
       return docs;
     
     
}
 public static boolean addUser(User use){
   //     session.invalidate(); 
  MyWebService_Service client=new MyWebService_Service();          //auto generated class in the generated source code
         
         MyWebService proxy=client.getMyWebServicePort();  
         
        boolean success= proxy.addUser(use);
        
             return success;    
     }
 
 
 
 public static User getUser(String email, String pass){
   //     session.invalidate(); 
  MyWebService_Service client=new MyWebService_Service();          //auto generated class in the generated source code
         
         MyWebService proxy=client.getMyWebServicePort();  
         
        User obj = proxy.getUser(email, pass);
        
             return obj;    
     }
     
     public static List<User> getUsers(){
   //     session.invalidate(); 
  MyWebService_Service client=new MyWebService_Service();          //auto generated class in the generated source code
         
         MyWebService proxy=client.getMyWebServicePort();  
         
       List<User> uses= proxy.getUsers();
       
       return uses;
     }
     
         public static boolean deleteUser(int id){
   //     session.invalidate(); 
  MyWebService_Service client=new MyWebService_Service();          //auto generated class in the generated source code
         
         MyWebService proxy=client.getMyWebServicePort();  
         
      boolean uses= proxy.deleteUser(id);
       
       return uses;
       
         }
 
 
//
//         public static boolean deleteApp(int id){
//   //     session.invalidate(); 
//  MyWebService_Service client=new MyWebService_Service();          //auto generated class in the generated source code
//         
//         MyWebService proxy=client.getMyWebServicePort();  
//         
//      boolean apps= proxy.deleteApp(id);
//       
//       return apps;
//     
//     
//}
public static boolean addPayment(Payment pay){
   //     session.invalidate(); 
  MyWebService_Service client=new MyWebService_Service();          //auto generated class in the generated source code
         
         MyWebService proxy=client.getMyWebServicePort();  
         
        boolean success= proxy.addPayment(pay);
        
             return success;    
     }
    


public static List<Payment> getPayments(){
   //     session.invalidate(); 
  MyWebService_Service client=new MyWebService_Service();          //auto generated class in the generated source code
         
         MyWebService proxy=client.getMyWebServicePort();  
         
       List<Payment> pays= proxy.getPayments();
       
       return pays;
     }

     
   public static boolean addDrug(Drug drg){
   //     session.invalidate(); 
  MyWebService_Service client=new MyWebService_Service();          //auto generated class in the generated source code
         
         MyWebService proxy=client.getMyWebServicePort();  
         
        boolean success= proxy.addDrug(drg);
        
             return success;    
     }
    
     
     public static List<Drug> getDrugs(){
   //     session.invalidate(); 
  MyWebService_Service client=new MyWebService_Service();          //auto generated class in the generated source code
         
         MyWebService proxy=client.getMyWebServicePort();  
         
       List<Drug> drgs= proxy.getDrugs();
       
       return drgs;
     }
     
         public static boolean deleteDrug(int id){
   //     session.invalidate(); 
  MyWebService_Service client=new MyWebService_Service();          //auto generated class in the generated source code
         
         MyWebService proxy=client.getMyWebServicePort();  
         
      boolean drgs= proxy.deleteDrug(id);
       
       return drgs;
     
     
     
         }

public static boolean addPatient(Patient pat){
   //     session.invalidate(); 
  MyWebService_Service client=new MyWebService_Service();          //auto generated class in the generated source code
         
         MyWebService proxy=client.getMyWebServicePort();  
         
        boolean success= proxy.addPatient(pat);
        
             return success;    
     }
     public static Patient getPatient(String fname, String lname){
   //     session.invalidate(); 
  MyWebService_Service client=new MyWebService_Service();          //auto generated class in the generated source code
         
         MyWebService proxy=client.getMyWebServicePort();  
         
        Patient obj = proxy.getPatient(fname, lname);
        
             return obj;    
     }
     
     public static List<Patient> getPatients(){
   //     session.invalidate(); 
  MyWebService_Service client=new MyWebService_Service();          //auto generated class in the generated source code
         
         MyWebService proxy=client.getMyWebServicePort();  
         
       List<Patient> pats= proxy.getPatients();
       
       return pats;
     }
     
         public static boolean deletePatient(int id){
   //     session.invalidate(); 
  MyWebService_Service client=new MyWebService_Service();          //auto generated class in the generated source code
         
         MyWebService proxy=client.getMyWebServicePort();  
         
      boolean pats= proxy.deletePatient(id);
       
       return pats;


}
}

