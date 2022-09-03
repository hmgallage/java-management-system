
package lasitha.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for payment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="payment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addfee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="drugs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="patientno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tests" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="treatments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "payment", propOrder = {
    "addfee",
    "drugs",
    "fname",
    "patientno",
    "paymentid",
    "tests",
    "treatments"
})
public class Payment {

    protected String addfee;
    protected String drugs;
    protected String fname;
    protected String patientno;
    protected int paymentid;
    protected String tests;
    protected String treatments;

    /**
     * Gets the value of the addfee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddfee() {
        return addfee;
    }

    /**
     * Sets the value of the addfee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddfee(String value) {
        this.addfee = value;
    }

    /**
     * Gets the value of the drugs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrugs() {
        return drugs;
    }

    /**
     * Sets the value of the drugs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrugs(String value) {
        this.drugs = value;
    }

    /**
     * Gets the value of the fname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFname() {
        return fname;
    }

    /**
     * Sets the value of the fname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFname(String value) {
        this.fname = value;
    }

    /**
     * Gets the value of the patientno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientno() {
        return patientno;
    }

    /**
     * Sets the value of the patientno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientno(String value) {
        this.patientno = value;
    }

    /**
     * Gets the value of the paymentid property.
     * 
     */
    public int getPaymentid() {
        return paymentid;
    }

    /**
     * Sets the value of the paymentid property.
     * 
     */
    public void setPaymentid(int value) {
        this.paymentid = value;
    }

    /**
     * Gets the value of the tests property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTests() {
        return tests;
    }

    /**
     * Sets the value of the tests property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTests(String value) {
        this.tests = value;
    }

    /**
     * Gets the value of the treatments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTreatments() {
        return treatments;
    }

    /**
     * Sets the value of the treatments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTreatments(String value) {
        this.treatments = value;
    }

}
