
package lasitha.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addApp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addApp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addApp" type="{http://service.lasitha/}app" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addApp", propOrder = {
    "addApp"
})
public class AddApp {

    protected App addApp;

    /**
     * Gets the value of the addApp property.
     * 
     * @return
     *     possible object is
     *     {@link App }
     *     
     */
    public App getAddApp() {
        return addApp;
    }

    /**
     * Sets the value of the addApp property.
     * 
     * @param value
     *     allowed object is
     *     {@link App }
     *     
     */
    public void setAddApp(App value) {
        this.addApp = value;
    }

}
