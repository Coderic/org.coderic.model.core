//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:22 PM COT 
//


package org.coderic.iso20022.messages.pacs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Document complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Document"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MulSttlmReq" type="{urn:iso:std:iso:20022:tech:xsd:pacs.029.001.02}MultilateralSettlementRequestV02"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "mulSttlmReq"
})
public class Document {

    @XmlElement(name = "MulSttlmReq", required = true)
    protected MultilateralSettlementRequestV02 mulSttlmReq;

    /**
     * Obtiene el valor de la propiedad mulSttlmReq.
     * 
     * @return
     *     possible object is
     *     {@link MultilateralSettlementRequestV02 }
     *     
     */
    public MultilateralSettlementRequestV02 getMulSttlmReq() {
        return mulSttlmReq;
    }

    /**
     * Define el valor de la propiedad mulSttlmReq.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilateralSettlementRequestV02 }
     *     
     */
    public void setMulSttlmReq(MultilateralSettlementRequestV02 value) {
        this.mulSttlmReq = value;
    }

}
