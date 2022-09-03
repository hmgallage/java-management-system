
package lasitha.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deletePatient complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deletePatient">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deletePatient" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deletePatient", propOrder = {
    "deletePatient"
})
public class DeletePatient {

    protected int deletePatient;

    /**
     * Gets the value of the deletePatient property.
     * 
     */
    public int getDeletePatient() {
        return deletePatient;
    }

    /**
     * Sets the value of the deletePatient property.
     * 
     */
    public void setDeletePatient(int value) {
        this.deletePatient = value;
    }

}
