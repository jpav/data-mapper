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
 * <p>Java class for camelProxyFactoryDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="camelProxyFactoryDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://camel.apache.org/schema/spring}identifiedType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="serviceUrl" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="serviceRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="serviceInterface" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="camelContextId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "camelProxyFactoryDefinition")
public class CamelProxyFactoryDefinition
    extends IdentifiedType
{

    @XmlAttribute(name = "serviceUrl")
    protected String serviceUrl;
    @XmlAttribute(name = "serviceRef")
    protected String serviceRef;
    @XmlAttribute(name = "serviceInterface")
    protected String serviceInterface;
    @XmlAttribute(name = "camelContextId")
    protected String camelContextId;

    /**
     * Gets the value of the serviceUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceUrl() {
        return serviceUrl;
    }

    /**
     * Sets the value of the serviceUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceUrl(String value) {
        this.serviceUrl = value;
    }

    /**
     * Gets the value of the serviceRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceRef() {
        return serviceRef;
    }

    /**
     * Sets the value of the serviceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceRef(String value) {
        this.serviceRef = value;
    }

    /**
     * Gets the value of the serviceInterface property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceInterface() {
        return serviceInterface;
    }

    /**
     * Sets the value of the serviceInterface property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceInterface(String value) {
        this.serviceInterface = value;
    }

    /**
     * Gets the value of the camelContextId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCamelContextId() {
        return camelContextId;
    }

    /**
     * Sets the value of the camelContextId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCamelContextId(String value) {
        this.camelContextId = value;
    }

}
