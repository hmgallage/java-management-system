
package lasitha.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addDoctor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addDoctor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addDoctor" type="{http://service.lasitha/}doctor" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addDoctor", propOrder = {
    "addDoctor"
})
public class AddDoctor {

    protected Doctor addDoctor;

    /**
     * Gets the value of the addDoctor property.
     * 
     * @return
     *     possible object is
     *     {@link Doctor }
     *     
     */
    public Doctor getAddDoctor() {
        return addDoctor;
    }

    /**
     * Sets the value of the addDoctor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Doctor }
     *     
     */
    public void setAddDoctor(Doctor value) {
        this.addDoctor = value;
    }

}
