//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.26 at 02:37:57 PM EST 
//


package org.jboss.mapper.camel.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pgpDataFormat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pgpDataFormat">
 *   &lt;complexContent>
 *     &lt;extension base="{http://camel.apache.org/schema/spring}dataFormat">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="keyUserid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="password" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="keyFileName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="armored" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="integrity" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="provider" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pgpDataFormat")
public class PgpDataFormat
    extends DataFormat
{

    @XmlAttribute(name = "keyUserid")
    protected String keyUserid;
    @XmlAttribute(name = "password")
    protected String password;
    @XmlAttribute(name = "keyFileName")
    protected String keyFileName;
    @XmlAttribute(name = "armored")
    protected Boolean armored;
    @XmlAttribute(name = "integrity")
    protected Boolean integrity;
    @XmlAttribute(name = "provider")
    protected String provider;

    /**
     * Gets the value of the keyUserid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyUserid() {
        return keyUserid;
    }

    /**
     * Sets the value of the keyUserid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyUserid(String value) {
        this.keyUserid = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the keyFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyFileName() {
        return keyFileName;
    }

    /**
     * Sets the value of the keyFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyFileName(String value) {
        this.keyFileName = value;
    }

    /**
     * Gets the value of the armored property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isArmored() {
        return armored;
    }

    /**
     * Sets the value of the armored property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setArmored(Boolean value) {
        this.armored = value;
    }

    /**
     * Gets the value of the integrity property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntegrity() {
        return integrity;
    }

    /**
     * Sets the value of the integrity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntegrity(Boolean value) {
        this.integrity = value;
    }

    /**
     * Gets the value of the provider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvider() {
        return provider;
    }

    /**
     * Sets the value of the provider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvider(String value) {
        this.provider = value;
    }

}
