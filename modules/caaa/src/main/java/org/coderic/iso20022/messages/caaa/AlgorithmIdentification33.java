//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:46:58 PM COT 
//


package org.coderic.iso20022.messages.caaa;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AlgorithmIdentification33 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AlgorithmIdentification33"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Algo" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Algorithm29Code"/&gt;
 *         &lt;element name="Param" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Parameter16" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlgorithmIdentification33", propOrder = {
    "algo",
    "param"
})
public class AlgorithmIdentification33 {

    @XmlElement(name = "Algo", required = true)
    @XmlSchemaType(name = "string")
    protected Algorithm29Code algo;
    @XmlElement(name = "Param")
    protected Parameter16 param;

    /**
     * Obtiene el valor de la propiedad algo.
     * 
     * @return
     *     possible object is
     *     {@link Algorithm29Code }
     *     
     */
    public Algorithm29Code getAlgo() {
        return algo;
    }

    /**
     * Define el valor de la propiedad algo.
     * 
     * @param value
     *     allowed object is
     *     {@link Algorithm29Code }
     *     
     */
    public void setAlgo(Algorithm29Code value) {
        this.algo = value;
    }

    /**
     * Obtiene el valor de la propiedad param.
     * 
     * @return
     *     possible object is
     *     {@link Parameter16 }
     *     
     */
    public Parameter16 getParam() {
        return param;
    }

    /**
     * Define el valor de la propiedad param.
     * 
     * @param value
     *     allowed object is
     *     {@link Parameter16 }
     *     
     */
    public void setParam(Parameter16 value) {
        this.param = value;
    }

}
