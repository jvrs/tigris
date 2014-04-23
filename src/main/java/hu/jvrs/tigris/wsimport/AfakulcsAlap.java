
package hu.jvrs.tigris.wsimport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for afakulcsAlap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="afakulcsAlap">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="afakulcsAlapId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="afakulcsReszlets" type="{http://beans.services.ws.leo.jvrs.hu/}afakulcsReszlet" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="gyujtoKod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "afakulcsAlap", propOrder = {
    "afakulcsAlapId",
    "afakulcsReszlets",
    "gyujtoKod"
})
public class AfakulcsAlap {

    protected long afakulcsAlapId;
    @XmlElement(nillable = true)
    protected List<AfakulcsReszlet> afakulcsReszlets;
    protected String gyujtoKod;

    /**
     * Gets the value of the afakulcsAlapId property.
     * 
     */
    public long getAfakulcsAlapId() {
        return afakulcsAlapId;
    }

    /**
     * Sets the value of the afakulcsAlapId property.
     * 
     */
    public void setAfakulcsAlapId(long value) {
        this.afakulcsAlapId = value;
    }

    /**
     * Gets the value of the afakulcsReszlets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the afakulcsReszlets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAfakulcsReszlets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AfakulcsReszlet }
     * 
     * 
     */
    public List<AfakulcsReszlet> getAfakulcsReszlets() {
        if (afakulcsReszlets == null) {
            afakulcsReszlets = new ArrayList<AfakulcsReszlet>();
        }
        return this.afakulcsReszlets;
    }

    /**
     * Gets the value of the gyujtoKod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGyujtoKod() {
        return gyujtoKod;
    }

    /**
     * Sets the value of the gyujtoKod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGyujtoKod(String value) {
        this.gyujtoKod = value;
    }

}
