//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:06 PM COT 
//


package org.coderic.iso20022.messages.catp;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PartyType12Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="PartyType12Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACQR"/&gt;
 *     &lt;enumeration value="ATMG"/&gt;
 *     &lt;enumeration value="CISP"/&gt;
 *     &lt;enumeration value="DLIS"/&gt;
 *     &lt;enumeration value="HSTG"/&gt;
 *     &lt;enumeration value="ITAG"/&gt;
 *     &lt;enumeration value="OATM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PartyType12Code")
@XmlEnum
public enum PartyType12Code {

    ACQR,
    ATMG,
    CISP,
    DLIS,
    HSTG,
    ITAG,
    OATM;

    public String value() {
        return name();
    }

    public static PartyType12Code fromValue(String v) {
        return valueOf(v);
    }

}
