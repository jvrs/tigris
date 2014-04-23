
package hu.jvrs.tigris.wsimport;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for afakulcsReszlet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="afakulcsReszlet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adomertek" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="afakulcsAlap" type="{http://beans.services.ws.leo.jvrs.hu/}afakulcsAlap" minOccurs="0"/>
 *         &lt;element name="afakulcsReszletId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ervKezd" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ervVege" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="kodEs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mertek" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "afakulcsReszlet", propOrder = {
    "adomertek",
    "afakulcsAlap",
    "afakulcsReszletId",
    "ervKezd",
    "ervVege",
    "kodEs",
    "mertek"
})
public class AfakulcsReszlet {

    protected BigDecimal adomertek;
    protected AfakulcsAlap afakulcsAlap;
    protected long afakulcsReszletId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ervKezd;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ervVege;
    protected String kodEs;
    protected BigDecimal mertek;

    /**
     * Gets the value of the adomertek property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdomertek() {
        return adomertek;
    }

    /**
     * Sets the value of the adomertek property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdomertek(BigDecimal value) {
        this.adomertek = value;
    }

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

    /**
     * Gets the value of the afakulcsReszletId property.
     * 
     */
    public long getAfakulcsReszletId() {
        return afakulcsReszletId;
    }

    /**
     * Sets the value of the afakulcsReszletId property.
     * 
     */
    public void setAfakulcsReszletId(long value) {
        this.afakulcsReszletId = value;
    }

    /**
     * Gets the value of the ervKezd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getErvKezd() {
        return ervKezd;
    }

    /**
     * Sets the value of the ervKezd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setErvKezd(XMLGregorianCalendar value) {
        this.ervKezd = value;
    }

    /**
     * Gets the value of the ervVege property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getErvVege() {
        return ervVege;
    }

    /**
     * Sets the value of the ervVege property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setErvVege(XMLGregorianCalendar value) {
        this.ervVege = value;
    }

    /**
     * Gets the value of the kodEs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodEs() {
        return kodEs;
    }

    /**
     * Sets the value of the kodEs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodEs(String value) {
        this.kodEs = value;
    }

    /**
     * Gets the value of the mertek property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMertek() {
        return mertek;
    }

    /**
     * Sets the value of the mertek property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMertek(BigDecimal value) {
        this.mertek = value;
    }

}
