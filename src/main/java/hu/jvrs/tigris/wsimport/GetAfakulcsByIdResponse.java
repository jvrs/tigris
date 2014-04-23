
package hu.jvrs.tigris.wsimport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAfakulcsByIdResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAfakulcsByIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://beans.services.ws.leo.jvrs.hu/}afakulcsValaszTipus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAfakulcsByIdResponse", propOrder = {
    "_return"
})
public class GetAfakulcsByIdResponse {

    @XmlElement(name = "return")
    protected AfakulcsValaszTipus _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link AfakulcsValaszTipus }
     *     
     */
    public AfakulcsValaszTipus getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link AfakulcsValaszTipus }
     *     
     */
    public void setReturn(AfakulcsValaszTipus value) {
        this._return = value;
    }

}
