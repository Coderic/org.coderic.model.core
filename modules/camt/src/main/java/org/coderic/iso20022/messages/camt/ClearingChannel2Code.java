//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:39 PM COT 
//


package org.coderic.iso20022.messages.camt;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ClearingChannel2Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="ClearingChannel2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RTGS"/&gt;
 *     &lt;enumeration value="RTNS"/&gt;
 *     &lt;enumeration value="MPNS"/&gt;
 *     &lt;enumeration value="BOOK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ClearingChannel2Code")
@XmlEnum
public enum ClearingChannel2Code {

    RTGS,
    RTNS,
    MPNS,
    BOOK;

    public String value() {
        return name();
    }

    public static ClearingChannel2Code fromValue(String v) {
        return valueOf(v);
    }

}
