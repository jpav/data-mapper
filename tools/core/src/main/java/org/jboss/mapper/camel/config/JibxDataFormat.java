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
 * <p>Java class for jibxDataFormat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jibxDataFormat">
 *   &lt;complexContent>
 *     &lt;extension base="{http://camel.apache.org/schema/spring}dataFormat">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="unmarshallClass" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bindingName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jibxDataFormat")
public class JibxDataFormat
    extends DataFormat
{

    @XmlAttribute(name = "unmarshallClass")
    protected String unmarshallClass;
    @XmlAttribute(name = "bindingName")
    protected String bindingName;

    /**
     * Gets the value of the unmarshallClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnmarshallClass() {
        return unmarshallClass;
    }

    /**
     * Sets the value of the unmarshallClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnmarshallClass(String value) {
        this.unmarshallClass = value;
    }

    /**
     * Gets the value of the bindingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBindingName() {
        return bindingName;
    }

    /**
     * Sets the value of the bindingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBindingName(String value) {
        this.bindingName = value;
    }

}
