
package knowyourtown.storage.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getQuoteResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getQuoteResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="quote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getQuoteResponse", propOrder = {
    "quote"
})
public class GetQuoteResponse {

    protected String quote;

    /**
     * Recupera il valore della proprietà quote.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuote() {
        return quote;
    }

    /**
     * Imposta il valore della proprietà quote.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuote(String value) {
        this.quote = value;
    }

}
