
package knowyourtown.storage.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import knowyourtown.localdb.webservice.PlaceType;


/**
 * <p>Classe Java per getPlaceTypeListResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getPlaceTypeListResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="placeTypeList" type="{http://webservice.localdb.knowyourtown/}placeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPlaceTypeListResponse", propOrder = {
    "placeTypeList"
})
public class GetPlaceTypeListResponse {

    protected List<PlaceType> placeTypeList;

    /**
     * Gets the value of the placeTypeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the placeTypeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlaceTypeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlaceType }
     * 
     * 
     */
    public List<PlaceType> getPlaceTypeList() {
        if (placeTypeList == null) {
            placeTypeList = new ArrayList<PlaceType>();
        }
        return this.placeTypeList;
    }

}
