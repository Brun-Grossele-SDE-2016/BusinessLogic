
package knowyourtown.storage.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import knowyourtown.localdb.webservice.Suggestion;


/**
 * <p>Classe Java per createSuggestion complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="createSuggestion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="personId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element ref="{http://webservice.localdb.knowyourtown/}suggestion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createSuggestion", propOrder = {
    "personId",
    "suggestion"
})
public class CreateSuggestion {

    protected int personId;
    @XmlElement(namespace = "http://webservice.localdb.knowyourtown/")
    protected Suggestion suggestion;

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
     * Recupera il valore della proprietà suggestion.
     * 
     * @return
     *     possible object is
     *     {@link Suggestion }
     *     
     */
    public Suggestion getSuggestion() {
        return suggestion;
    }

    /**
     * Imposta il valore della proprietà suggestion.
     * 
     * @param value
     *     allowed object is
     *     {@link Suggestion }
     *     
     */
    public void setSuggestion(Suggestion value) {
        this.suggestion = value;
    }

}
