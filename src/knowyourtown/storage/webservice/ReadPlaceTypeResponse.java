
package knowyourtown.storage.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import knowyourtown.localdb.webservice.PlaceType;


/**
 * <p>Classe Java per readPlaceTypeResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="readPlaceTypeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="placeType" type="{http://webservice.localdb.knowyourtown/}placeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readPlaceTypeResponse", propOrder = {
    "placeType"
})
public class ReadPlaceTypeResponse {

    protected PlaceType placeType;

    /**
     * Recupera il valore della proprietà placeType.
     * 
     * @return
     *     possible object is
     *     {@link PlaceType }
     *     
     */
    public PlaceType getPlaceType() {
        return placeType;
    }

    /**
     * Imposta il valore della proprietà placeType.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceType }
     *     
     */
    public void setPlaceType(PlaceType value) {
        this.placeType = value;
    }

}
