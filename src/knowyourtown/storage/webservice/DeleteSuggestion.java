
package knowyourtown.storage.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per deleteSuggestion complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="deleteSuggestion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="suggestionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteSuggestion", propOrder = {
    "suggestionId"
})
public class DeleteSuggestion {

    protected int suggestionId;

    /**
     * Recupera il valore della proprietà suggestionId.
     * 
     */
    public int getSuggestionId() {
        return suggestionId;
    }

    /**
     * Imposta il valore della proprietà suggestionId.
     * 
     */
    public void setSuggestionId(int value) {
        this.suggestionId = value;
    }

}
