
package knowyourtown.localdb.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per readPlaceType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="readPlaceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="placeTypeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readPlaceType", propOrder = {
    "placeTypeId"
})
public class ReadPlaceType {

    protected int placeTypeId;

    /**
     * Recupera il valore della proprietà placeTypeId.
     * 
     */
    public int getPlaceTypeId() {
        return placeTypeId;
    }

    /**
     * Imposta il valore della proprietà placeTypeId.
     * 
     */
    public void setPlaceTypeId(int value) {
        this.placeTypeId = value;
    }

}
