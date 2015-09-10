
package org.datacontract.schemas._2004._07.openlm_server_services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfKeyValueStringPair complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKeyValueStringPair">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeyValueStringPair" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}KeyValueStringPair" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKeyValueStringPair", propOrder = {
    "keyValueStringPair"
})
public class ArrayOfKeyValueStringPair {

    @XmlElement(name = "KeyValueStringPair", nillable = true)
    protected List<KeyValueStringPair> keyValueStringPair;

    /**
     * Gets the value of the keyValueStringPair property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyValueStringPair property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValueStringPair().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValueStringPair }
     * 
     * 
     */
    public List<KeyValueStringPair> getKeyValueStringPair() {
        if (keyValueStringPair == null) {
            keyValueStringPair = new ArrayList<KeyValueStringPair>();
        }
        return this.keyValueStringPair;
    }

}
