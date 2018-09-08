
package knowyourtown.storage.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getQuote2Response complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getQuote2Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="quote2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getQuote2Response", propOrder = {
    "quote2"
})
public class GetQuote2Response {

    protected String quote2;

    /**
     * Recupera il valore della proprietà quote2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuote2() {
        return quote2;
    }

    /**
     * Imposta il valore della proprietà quote2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuote2(String value) {
        this.quote2 = value;
    }

}
