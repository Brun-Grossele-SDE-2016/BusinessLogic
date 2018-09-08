
package knowyourtown.storage.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getSomePlace complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getSomePlace">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="personId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="placeTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nPlace" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSomePlace", propOrder = {
    "personId",
    "placeTypeId",
    "nPlace"
})
public class GetSomePlace {

    protected int personId;
    protected String placeTypeId;
    protected int nPlace;

    /**
     * Recupera il valore della proprietà personId.
     * 
     */
    public int getPersonId() {
        return personId;
    }

    /**
     * Imposta il valore della proprietà personId.
     * 
     */
    public void setPersonId(int value) {
        this.personId = value;
    }

    /**
     * Recupera il valore della proprietà placeTypeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceTypeId() {
        return placeTypeId;
    }

    /**
     * Imposta il valore della proprietà placeTypeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceTypeId(String value) {
        this.placeTypeId = value;
    }

    /**
     * Recupera il valore della proprietà nPlace.
     * 
     */
    public int getNPlace() {
        return nPlace;
    }

    /**
     * Imposta il valore della proprietà nPlace.
     * 
     */
    public void setNPlace(int value) {
        this.nPlace = value;
    }

}
