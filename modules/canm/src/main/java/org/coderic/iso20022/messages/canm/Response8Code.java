//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:46 PM COT 
//


package org.coderic.iso20022.messages.canm;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Response8Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="Response8Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PRCS"/&gt;
 *     &lt;enumeration value="UNPR"/&gt;
 *     &lt;enumeration value="UNRV"/&gt;
 *     &lt;enumeration value="REJT"/&gt;
 *     &lt;enumeration value="TECH"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Response8Code")
@XmlEnum
public enum Response8Code {

    PRCS,
    UNPR,
    UNRV,
    REJT,
    TECH,
    OTHN,
    OTHP;

    public String value() {
        return name();
    }

    public static Response8Code fromValue(String v) {
        return valueOf(v);
    }

}
