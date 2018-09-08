
package knowyourtown.storage.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getIdPlaceTypeByTypeResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getIdPlaceTypeByTypeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idPlaceType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getIdPlaceTypeByTypeResponse", propOrder = {
    "idPlaceType"
})
public class GetIdPlaceTypeByTypeResponse {

    protected int idPlaceType;

    /**
     * Recupera il valore della proprietà idPlaceType.
     * 
     */
    public int getIdPlaceType() {
        return idPlaceType;
    }

    /**
     * Imposta il valore della proprietà idPlaceType.
     * 
     */
    public void setIdPlaceType(int value) {
        this.idPlaceType = value;
    }

}
