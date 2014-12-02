//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.26 at 02:37:57 PM EST 
//


package org.jboss.mapper.camel.config;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for restConfigurationDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="restConfigurationDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="componentProperty" type="{http://camel.apache.org/schema/spring}restPropertyDefinition" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="endpointProperty" type="{http://camel.apache.org/schema/spring}restPropertyDefinition" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="consumerProperty" type="{http://camel.apache.org/schema/spring}restPropertyDefinition" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dataFormatProperty" type="{http://camel.apache.org/schema/spring}restPropertyDefinition" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="component" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="scheme" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="host" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="port" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="contextPath" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="hostNameResolver" type="{http://camel.apache.org/schema/spring}restHostNameResolver" />
 *       &lt;attribute name="bindingMode" type="{http://camel.apache.org/schema/spring}restBindingMode" />
 *       &lt;attribute name="jsonDataFormat" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="xmlDataFormat" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "restConfigurationDefinition", propOrder = {
    "componentProperty",
    "endpointProperty",
    "consumerProperty",
    "dataFormatProperty"
})
public class RestConfigurationDefinition {

    protected List<RestPropertyDefinition> componentProperty;
    protected List<RestPropertyDefinition> endpointProperty;
    protected List<RestPropertyDefinition> consumerProperty;
    protected List<RestPropertyDefinition> dataFormatProperty;
    @XmlAttribute(name = "component")
    protected String component;
    @XmlAttribute(name = "scheme")
    protected String scheme;
    @XmlAttribute(name = "host")
    protected String host;
    @XmlAttribute(name = "port")
    protected String port;
    @XmlAttribute(name = "contextPath")
    protected String contextPath;
    @XmlAttribute(name = "hostNameResolver")
    protected RestHostNameResolver hostNameResolver;
    @XmlAttribute(name = "bindingMode")
    protected RestBindingMode bindingMode;
    @XmlAttribute(name = "jsonDataFormat")
    protected String jsonDataFormat;
    @XmlAttribute(name = "xmlDataFormat")
    protected String xmlDataFormat;

    /**
     * Gets the value of the componentProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the componentProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponentProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RestPropertyDefinition }
     * 
     * 
     */
    public List<RestPropertyDefinition> getComponentProperty() {
        if (componentProperty == null) {
            componentProperty = new ArrayList<RestPropertyDefinition>();
        }
        return this.componentProperty;
    }

    /**
     * Gets the value of the endpointProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endpointProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndpointProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RestPropertyDefinition }
     * 
     * 
     */
    public List<RestPropertyDefinition> getEndpointProperty() {
        if (endpointProperty == null) {
            endpointProperty = new ArrayList<RestPropertyDefinition>();
        }
        return this.endpointProperty;
    }

    /**
     * Gets the value of the consumerProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consumerProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsumerProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RestPropertyDefinition }
     * 
     * 
     */
    public List<RestPropertyDefinition> getConsumerProperty() {
        if (consumerProperty == null) {
            consumerProperty = new ArrayList<RestPropertyDefinition>();
        }
        return this.consumerProperty;
    }

    /**
     * Gets the value of the dataFormatProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataFormatProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataFormatProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RestPropertyDefinition }
     * 
     * 
     */
    public List<RestPropertyDefinition> getDataFormatProperty() {
        if (dataFormatProperty == null) {
            dataFormatProperty = new ArrayList<RestPropertyDefinition>();
        }
        return this.dataFormatProperty;
    }

    /**
     * Gets the value of the component property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponent() {
        return component;
    }

    /**
     * Sets the value of the component property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponent(String value) {
        this.component = value;
    }

    /**
     * Gets the value of the scheme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheme() {
        return scheme;
    }

    /**
     * Sets the value of the scheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheme(String value) {
        this.scheme = value;
    }

    /**
     * Gets the value of the host property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHost() {
        return host;
    }

    /**
     * Sets the value of the host property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHost(String value) {
        this.host = value;
    }

    /**
     * Gets the value of the port property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPort() {
        return port;
    }

    /**
     * Sets the value of the port property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPort(String value) {
        this.port = value;
    }

    /**
     * Gets the value of the contextPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContextPath() {
        return contextPath;
    }

    /**
     * Sets the value of the contextPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContextPath(String value) {
        this.contextPath = value;
    }

    /**
     * Gets the value of the hostNameResolver property.
     * 
     * @return
     *     possible object is
     *     {@link RestHostNameResolver }
     *     
     */
    public RestHostNameResolver getHostNameResolver() {
        return hostNameResolver;
    }

    /**
     * Sets the value of the hostNameResolver property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestHostNameResolver }
     *     
     */
    public void setHostNameResolver(RestHostNameResolver value) {
        this.hostNameResolver = value;
    }

    /**
     * Gets the value of the bindingMode property.
     * 
     * @return
     *     possible object is
     *     {@link RestBindingMode }
     *     
     */
    public RestBindingMode getBindingMode() {
        return bindingMode;
    }

    /**
     * Sets the value of the bindingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestBindingMode }
     *     
     */
    public void setBindingMode(RestBindingMode value) {
        this.bindingMode = value;
    }

    /**
     * Gets the value of the jsonDataFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJsonDataFormat() {
        return jsonDataFormat;
    }

    /**
     * Sets the value of the jsonDataFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJsonDataFormat(String value) {
        this.jsonDataFormat = value;
    }

    /**
     * Gets the value of the xmlDataFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlDataFormat() {
        return xmlDataFormat;
    }

    /**
     * Sets the value of the xmlDataFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlDataFormat(String value) {
        this.xmlDataFormat = value;
    }

}
