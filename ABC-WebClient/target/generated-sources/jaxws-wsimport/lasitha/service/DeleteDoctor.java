
package lasitha.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteDoctor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteDoctor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deleteDoctor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteDoctor", propOrder = {
    "deleteDoctor"
})
public class DeleteDoctor {

    protected int deleteDoctor;

    /**
     * Gets the value of the deleteDoctor property.
     * 
     */
    public int getDeleteDoctor() {
        return deleteDoctor;
    }

    /**
     * Sets the value of the deleteDoctor property.
     * 
     */
    public void setDeleteDoctor(int value) {
        this.deleteDoctor = value;
    }

}
