
package lasitha.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for drug complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="drug">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dqty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "drug", propOrder = {
    "dname",
    "dqty"
})
public class Drug {

    protected String dname;
    protected String dqty;

    /**
     * Gets the value of the dname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDname() {
        return dname;
    }

    /**
     * Sets the value of the dname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDname(String value) {
        this.dname = value;
    }

    /**
     * Gets the value of the dqty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDqty() {
        return dqty;
    }

    /**
     * Sets the value of the dqty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDqty(String value) {
        this.dqty = value;
    }

}
