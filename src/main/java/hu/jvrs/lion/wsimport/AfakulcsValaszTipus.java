
package hu.jvrs.lion.wsimport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for afakulcsValaszTipus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="afakulcsValaszTipus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="afakulcsAlap" type="{http://beans.services.ws.lion.jvrs.hu/}afakulcsAlap" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "afakulcsValaszTipus", propOrder = {
    "afakulcsAlap"
})
public class AfakulcsValaszTipus {

    protected AfakulcsAlap afakulcsAlap;

    /**
     * Gets the value of the afakulcsAlap property.
     * 
     * @return
     *     possible object is
     *     {@link AfakulcsAlap }
     *     
     */
    public AfakulcsAlap getAfakulcsAlap() {
        return afakulcsAlap;
    }

    /**
     * Sets the value of the afakulcsAlap property.
     * 
     * @param value
     *     allowed object is
     *     {@link AfakulcsAlap }
     *     
     */
    public void setAfakulcsAlap(AfakulcsAlap value) {
        this.afakulcsAlap = value;
    }

}
