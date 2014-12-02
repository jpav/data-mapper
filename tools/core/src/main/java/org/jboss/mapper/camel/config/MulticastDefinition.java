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
 * <p>Java class for multicastDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="multicastDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://camel.apache.org/schema/spring}output">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="parallelProcessing" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="strategyRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="strategyMethodName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="strategyMethodAllowNull" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="executorServiceRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="streaming" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="stopOnException" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="timeout" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="onPrepareRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="shareUnitOfWork" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="parallelAggregate" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;anyAttribute processContents='skip' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "multicastDefinition")
public class MulticastDefinition
    extends Output
{

    @XmlAttribute(name = "parallelProcessing")
    protected Boolean parallelProcessing;
    @XmlAttribute(name = "strategyRef")
    protected String strategyRef;
    @XmlAttribute(name = "strategyMethodName")
    protected String strategyMethodName;
    @XmlAttribute(name = "strategyMethodAllowNull")
    protected Boolean strategyMethodAllowNull;
    @XmlAttribute(name = "executorServiceRef")
    protected String executorServiceRef;
    @XmlAttribute(name = "streaming")
    protected Boolean streaming;
    @XmlAttribute(name = "stopOnException")
    protected Boolean stopOnException;
    @XmlAttribute(name = "timeout")
    protected Long timeout;
    @XmlAttribute(name = "onPrepareRef")
    protected String onPrepareRef;
    @XmlAttribute(name = "shareUnitOfWork")
    protected Boolean shareUnitOfWork;
    @XmlAttribute(name = "parallelAggregate")
    protected Boolean parallelAggregate;

    /**
     * Gets the value of the parallelProcessing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isParallelProcessing() {
        return parallelProcessing;
    }

    /**
     * Sets the value of the parallelProcessing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setParallelProcessing(Boolean value) {
        this.parallelProcessing = value;
    }

    /**
     * Gets the value of the strategyRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrategyRef() {
        return strategyRef;
    }

    /**
     * Sets the value of the strategyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrategyRef(String value) {
        this.strategyRef = value;
    }

    /**
     * Gets the value of the strategyMethodName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrategyMethodName() {
        return strategyMethodName;
    }

    /**
     * Sets the value of the strategyMethodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrategyMethodName(String value) {
        this.strategyMethodName = value;
    }

    /**
     * Gets the value of the strategyMethodAllowNull property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStrategyMethodAllowNull() {
        return strategyMethodAllowNull;
    }

    /**
     * Sets the value of the strategyMethodAllowNull property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStrategyMethodAllowNull(Boolean value) {
        this.strategyMethodAllowNull = value;
    }

    /**
     * Gets the value of the executorServiceRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecutorServiceRef() {
        return executorServiceRef;
    }

    /**
     * Sets the value of the executorServiceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecutorServiceRef(String value) {
        this.executorServiceRef = value;
    }

    /**
     * Gets the value of the streaming property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStreaming() {
        return streaming;
    }

    /**
     * Sets the value of the streaming property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStreaming(Boolean value) {
        this.streaming = value;
    }

    /**
     * Gets the value of the stopOnException property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStopOnException() {
        return stopOnException;
    }

    /**
     * Sets the value of the stopOnException property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStopOnException(Boolean value) {
        this.stopOnException = value;
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
     * Gets the value of the onPrepareRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnPrepareRef() {
        return onPrepareRef;
    }

    /**
     * Sets the value of the onPrepareRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnPrepareRef(String value) {
        this.onPrepareRef = value;
    }

    /**
     * Gets the value of the shareUnitOfWork property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShareUnitOfWork() {
        return shareUnitOfWork;
    }

    /**
     * Sets the value of the shareUnitOfWork property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShareUnitOfWork(Boolean value) {
        this.shareUnitOfWork = value;
    }

    /**
     * Gets the value of the parallelAggregate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isParallelAggregate() {
        return parallelAggregate;
    }

    /**
     * Sets the value of the parallelAggregate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setParallelAggregate(Boolean value) {
        this.parallelAggregate = value;
    }

}
