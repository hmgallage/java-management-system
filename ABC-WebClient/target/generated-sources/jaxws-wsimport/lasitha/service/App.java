
package lasitha.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for app complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="app">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="app_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="app_doc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="app_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="app_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "app", propOrder = {
    "appDate",
    "appDoc",
    "appId",
    "appName"
})
public class App {

    @XmlElement(name = "app_date")
    protected String appDate;
    @XmlElement(name = "app_doc")
    protected int appDoc;
    @XmlElement(name = "app_id")
    protected int appId;
    @XmlElement(name = "app_name")
    protected String appName;

    /**
     * Gets the value of the appDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppDate() {
        return appDate;
    }

    /**
     * Sets the value of the appDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppDate(String value) {
        this.appDate = value;
    }

    /**
     * Gets the value of the appDoc property.
     * 
     */
    public int getAppDoc() {
        return appDoc;
    }

    /**
     * Sets the value of the appDoc property.
     * 
     */
    public void setAppDoc(int value) {
        this.appDoc = value;
    }

    /**
     * Gets the value of the appId property.
     * 
     */
    public int getAppId() {
        return appId;
    }

    /**
     * Sets the value of the appId property.
     * 
     */
    public void setAppId(int value) {
        this.appId = value;
    }

    /**
     * Gets the value of the appName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppName() {
        return appName;
    }

    /**
     * Sets the value of the appName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppName(String value) {
        this.appName = value;
    }

}
