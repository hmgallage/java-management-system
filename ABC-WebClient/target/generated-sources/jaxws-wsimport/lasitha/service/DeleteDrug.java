
package lasitha.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteDrug complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteDrug">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deleteDrug" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteDrug", propOrder = {
    "deleteDrug"
})
public class DeleteDrug {

    protected int deleteDrug;

    /**
     * Gets the value of the deleteDrug property.
     * 
     */
    public int getDeleteDrug() {
        return deleteDrug;
    }

    /**
     * Sets the value of the deleteDrug property.
     * 
     */
    public void setDeleteDrug(int value) {
        this.deleteDrug = value;
    }

}
