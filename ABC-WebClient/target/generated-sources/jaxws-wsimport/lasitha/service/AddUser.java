
package lasitha.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addUser" type="{http://service.lasitha/}user" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addUser", propOrder = {
    "addUser"
})
public class AddUser {

    protected User addUser;

    /**
     * Gets the value of the addUser property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getAddUser() {
        return addUser;
    }

    /**
     * Sets the value of the addUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setAddUser(User value) {
        this.addUser = value;
    }

}
