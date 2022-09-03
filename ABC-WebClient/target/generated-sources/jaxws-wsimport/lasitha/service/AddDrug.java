
package lasitha.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addDrug complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addDrug">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addDrug" type="{http://service.lasitha/}drug" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addDrug", propOrder = {
    "addDrug"
})
public class AddDrug {

    protected Drug addDrug;

    /**
     * Gets the value of the addDrug property.
     * 
     * @return
     *     possible object is
     *     {@link Drug }
     *     
     */
    public Drug getAddDrug() {
        return addDrug;
    }

    /**
     * Sets the value of the addDrug property.
     * 
     * @param value
     *     allowed object is
     *     {@link Drug }
     *     
     */
    public void setAddDrug(Drug value) {
        this.addDrug = value;
    }

}
