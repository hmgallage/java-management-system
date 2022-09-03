/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lasitha.service;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ACER
 */
public class patientTest {
    
    public patientTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getPatientid method, of class patient.
//     */
//    @Test
//    public void testGetPatientid() {
//        System.out.println("getPatientid");
//        patient instance = new patient();
//        int expResult = 0;
//        int result = instance.getPatientid();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setPatientid method, of class patient.
//     */
//    @Test
//    public void testSetPatientid() {
//        System.out.println("setPatientid");
//        int patientid = 0;
//        patient instance = new patient();
//        instance.setPatientid(patientid);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getFname method, of class patient.
//     */
//    @Test
//    public void testGetFname() {
//        System.out.println("getFname");
//        patient instance = new patient();
//        String expResult = "";
//        String result = instance.getFname();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setFname method, of class patient.
//     */
//    @Test
//    public void testSetFname() {
//        System.out.println("setFname");
//        String fname = "";
//        patient instance = new patient();
//        instance.setFname(fname);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getLname method, of class patient.
//     */
//    @Test
//    public void testGetLname() {
//        System.out.println("getLname");
//        patient instance = new patient();
//        String expResult = "";
//        String result = instance.getLname();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setLname method, of class patient.
//     */
//    @Test
//    public void testSetLname() {
//        System.out.println("setLname");
//        String lname = "";
//        patient instance = new patient();
//        instance.setLname(lname);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getAddress method, of class patient.
//     */
//    @Test
//    public void testGetAddress() {
//        System.out.println("getAddress");
//        patient instance = new patient();
//        String expResult = "";
//        String result = instance.getAddress();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setAddress method, of class patient.
//     */
//    @Test
//    public void testSetAddress() {
//        System.out.println("setAddress");
//        String address = "";
//        patient instance = new patient();
//        instance.setAddress(address);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getAge method, of class patient.
//     */
//    @Test
//    public void testGetAge() {
//        System.out.println("getAge");
//        patient instance = new patient();
//        String expResult = "";
//        String result = instance.getAge();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setAge method, of class patient.
//     */
//    @Test
//    public void testSetAge() {
//        System.out.println("setAge");
//        String age = "";
//        patient instance = new patient();
//        instance.setAge(age);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getContact method, of class patient.
//     */
//    @Test
//    public void testGetContact() {
//        System.out.println("getContact");
//        patient instance = new patient();
//        String expResult = "";
//        String result = instance.getContact();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setContact method, of class patient.
//     */
//    @Test
//    public void testSetContact() {
//        System.out.println("setContact");
//        String contact = "";
//        patient instance = new patient();
//        instance.setContact(contact);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getWard method, of class patient.
//     */
//    @Test
//    public void testGetWard() {
//        System.out.println("getWard");
//        patient instance = new patient();
//        String expResult = "";
//        String result = instance.getWard();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setWard method, of class patient.
//     */
//    @Test
//    public void testSetWard() {
//        System.out.println("setWard");
//        String ward = "";
//        patient instance = new patient();
//        instance.setWard(ward);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of addPatient method, of class patient.
     */
//    @Test
//    public void testAddPatient() {
//        System.out.println("addPatient");
//        patient pat = new patient(34,"Pasindu","Hasamal","32","43/b,Kottawa","0764576879","23");
//        boolean expResult = true;
//        boolean result = patient.addPatient(pat);
//        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }

//    /**
//     * Test of updatePatient method, of class patient.
//     */
//    @Test
//    public void testUpdatePatient() {
//        System.out.println("updatePatient");
//        patient pat = null;
//        boolean expResult = false;
//        boolean result = patient.updatePatient(pat);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of deletPatient method, of class patient.
//     */
//    @Test
//    public void testDeletPatient() {
//        System.out.println("deletPatient");
//        int id = 2;
//        boolean expResult = true;
//        boolean result = patient.deletPatient(id);
//        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getPatient method, of class patient.
//     */
//    @Test
//    public void testGetPatient() {
//        System.out.println("getPatient");
//        String fname = "";
//        String lname = "";
//        patient expResult = null;
//        patient result = patient.getPatient(fname, lname);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getPatients method, of class patient.
//     */
//    @Test
//    public void testGetPatients() {
//        System.out.println("getPatients");
//        List<patient> expResult = null;
//        List<patient> result = patient.getPatients();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
