
package knowyourtown.localdb.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the knowyourtown.localdb.webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Suggestion_QNAME = new QName("http://webservice.localdb.knowyourtown/", "suggestion");
    private final static QName _Place_QNAME = new QName("http://webservice.localdb.knowyourtown/", "place");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: knowyourtown.localdb.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link Suggestion }
     * 
     */
    public Suggestion createSuggestion() {
        return new Suggestion();
    }

    /**
     * Create an instance of {@link Place }
     * 
     */
    public Place createPlace() {
        return new Place();
    }

    /**
     * Create an instance of {@link PlaceType }
     * 
     */
    public PlaceType createPlaceType() {
        return new PlaceType();
    }

    /**
     * Create an instance of {@link Person.Places }
     * 
     */
    public Person.Places createPersonPlaces() {
        return new Person.Places();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Suggestion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.localdb.knowyourtown/", name = "suggestion")
    public JAXBElement<Suggestion> createSuggestion(Suggestion value) {
        return new JAXBElement<Suggestion>(_Suggestion_QNAME, Suggestion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Place }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.localdb.knowyourtown/", name = "place")
    public JAXBElement<Place> createPlace(Place value) {
        return new JAXBElement<Place>(_Place_QNAME, Place.class, null, value);
    }

}
