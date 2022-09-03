/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lasitha.service;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author ACER
 */
@WebService(serviceName = "MyWebService")
public class MyWebService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    
     @WebMethod(operationName = "addDoctor")
    public boolean addDoctor(@WebParam(name = "addDoctor") doctor doc) {
       boolean success= doctor.addDoctor(doc);
       return success;
    }
         @WebMethod(operationName = "deleteDoctor")
    public boolean deleteDoctor(@WebParam(name = "deleteDoctor") int id) {
       boolean success= doctor.deletDoctor(id);
       return success;
    }
     @WebMethod(operationName = "getDoctor")
    public doctor getDoctor(@WebParam(name = "getDoctor") String email, String pass) {
       doctor doc =  doctor.getDcotor(email, pass);
       return doc;
    }
    
      @WebMethod(operationName = "getDoctors")
    public  List<doctor> getDoctors() {
        
        List<doctor> docs= doctor.getDoctors();      //getting from db
              
    // user user= new user("admin","chamal", "peiris", "123");
  
        return docs;
         
    }
    @WebMethod(operationName = "addUser")
    public boolean addUser(@WebParam(name = "addUser") user use) {
       boolean success= user.addUser(use);
       return success;
    }
    
    
      @WebMethod(operationName = "deleteUser")
    public boolean deleteUser(@WebParam(name = "deleteUser") int id) {
       boolean success= user.deletUser(id);
       return success;
    }
     @WebMethod(operationName = "getUser")
    public user getUser(@WebParam(name = "getUser") String email, String pass) {
       user use =  user.getUser(email, pass);
       return use;
    }
    
      @WebMethod(operationName = "getUsers")
    public  List<user> getUsers() {
        
        List<user> uses= user.getUsers();      //getting from db
              
    // user user= new user("admin","chamal", "peiris", "123");
  
        return uses;
    }
    
    
   
     @WebMethod(operationName = "addPayment")
    public boolean addPayment(@WebParam(name = "addPayment") payment pay) {
       boolean success= payment.addPayment(pay);
       return success;
    }
    
    
    @WebMethod(operationName = "getPayments")
    public  List<payment> getpayments() {
        
        List<payment> pays= payment.getPayments();      //getting from db
              
    // user user= new user("admin","chamal", "peiris", "123");
  
        return pays;
         
    }
    
    
    @WebMethod(operationName = "addDrug")
    public boolean addDrug(@WebParam(name = "addDrug") drug drg) {
       boolean success= drug.addDrug(drg);
       return success;
   }
        @WebMethod(operationName = "deleteDrug")
    public boolean deleteDrug(@WebParam(name = "deleteDrug") int id) {
       boolean success= drug.deletDrug(id);
       return success;
    }
     
    
    
      @WebMethod(operationName = "getDrug")
    public drug getDrug(@WebParam(name = "getDrug") String Dname) {
       drug drg =  drug.getDrug(Dname);
       return drg;
    }
    
      @WebMethod(operationName = "getDrugs")
    public  List<drug> getDrugs() {
        
        List<drug> drgs= drug.getDrugs();      //getting from db
              
    // user user= new user("admin","chamal", "peiris", "123");
  
        return drgs;
    }
    
 
    
    
    
    
    
   
 @WebMethod(operationName = "addPatient")
    public boolean addPatient(@WebParam(name = "addPatient") patient pat) {
       boolean success= patient.addPatient(pat);
       return success;
    }
         @WebMethod(operationName = "deletePatient")
    public boolean deletePatient(@WebParam(name = "deletePatient") int id) {
       boolean success= patient.deletPatient(id);
       return success;
    }
     @WebMethod(operationName = "getPatient")
    public patient getPatient(@WebParam(name = "getPatient") String fname, String lname) {
       patient pat =  patient.getPatient(fname, lname);
       return pat;
    }
    
      @WebMethod(operationName = "getPatients")
    public  List<patient> getPatients() {
        
        List<patient> pats= patient.getPatients();      //getting from db
              
    // user user= new user("admin","chamal", "peiris", "123");
  
        return pats;
         
    }


}
    
    
      
    

    
    
    
 
    



