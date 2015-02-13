//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.13 at 12:09:41 PM EST 
//


package org.jboss.mapper.camel.blueprint;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for streamResequencerConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="streamResequencerConfig">
 *   &lt;complexContent>
 *     &lt;extension base="{http://camel.apache.org/schema/blueprint}resequencerConfig">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="capacity" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="timeout" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="ignoreInvalidExchanges" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="comparatorRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="rejectOld" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "streamResequencerConfig")
public class StreamResequencerConfig
    extends ResequencerConfig
{

    @XmlAttribute(name = "capacity")
    protected Integer capacity;
    @XmlAttribute(name = "timeout")
    protected Long timeout;
    @XmlAttribute(name = "ignoreInvalidExchanges")
    protected Boolean ignoreInvalidExchanges;
    @XmlAttribute(name = "comparatorRef")
    protected String comparatorRef;
    @XmlAttribute(name = "rejectOld")
    protected Boolean rejectOld;

    /**
     * Gets the value of the capacity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCapacity() {
        return capacity;
    }

    /**
     * Sets the value of the capacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCapacity(Integer value) {
        this.capacity = value;
    }

    /**
     * Gets the value of the timeout property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTimeout() {
        return timeout;
    }

    /**
     * Sets the value of the timeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTimeout(Long value) {
        this.timeout = value;
    }

    /**
     * Gets the value of the ignoreInvalidExchanges property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreInvalidExchanges() {
        return ignoreInvalidExchanges;
    }

    /**
     * Sets the value of the ignoreInvalidExchanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreInvalidExchanges(Boolean value) {
        this.ignoreInvalidExchanges = value;
    }

    /**
     * Gets the value of the comparatorRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComparatorRef() {
        return comparatorRef;
    }

    /**
     * Sets the value of the comparatorRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComparatorRef(String value) {
        this.comparatorRef = value;
    }

    /**
     * Gets the value of the rejectOld property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRejectOld() {
        return rejectOld;
    }

    /**
     * Sets the value of the rejectOld property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRejectOld(Boolean value) {
        this.rejectOld = value;
    }

}
