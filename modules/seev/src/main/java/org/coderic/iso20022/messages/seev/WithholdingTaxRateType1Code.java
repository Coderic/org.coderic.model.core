//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:44 PM COT 
//


package org.coderic.iso20022.messages.seev;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WithholdingTaxRateType1Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="WithholdingTaxRateType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BWIT"/&gt;
 *     &lt;enumeration value="FTCA"/&gt;
 *     &lt;enumeration value="NRAT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WithholdingTaxRateType1Code")
@XmlEnum
public enum WithholdingTaxRateType1Code {

    BWIT,
    FTCA,
    NRAT;

    public String value() {
        return name();
    }

    public static WithholdingTaxRateType1Code fromValue(String v) {
        return valueOf(v);
    }

}
