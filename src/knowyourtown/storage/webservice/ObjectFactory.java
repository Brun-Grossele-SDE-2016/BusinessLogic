
package knowyourtown.storage.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the knowyourtown.storage.webservice package. 
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

    private final static QName _ReadPlace_QNAME = new QName("http://webservice.storage.knowyourtown/", "readPlace");
    private final static QName _CreatePlaceResponse_QNAME = new QName("http://webservice.storage.knowyourtown/", "createPlaceResponse");
    private final static QName _GetIdPlaceTypeByTypeResponse_QNAME = new QName("http://webservice.storage.knowyourtown/", "getIdPlaceTypeByTypeResponse");
    private final static QName _UpdatePlaceResponse_QNAME = new QName("http://webservice.storage.knowyourtown/", "updatePlaceResponse");
    private final static QName _GetSuggestions_QNAME = new QName("http://webservice.storage.knowyourtown/", "getSuggestions");
    private final static QName _GetPlaceTypeList_QNAME = new QName("http://webservice.storage.knowyourtown/", "getPlaceTypeList");
    private final static QName _CreateSuggestionResponse_QNAME = new QName("http://webservice.storage.knowyourtown/", "createSuggestionResponse");
    private final static QName _DeletePlace_QNAME = new QName("http://webservice.storage.knowyourtown/", "deletePlace");
    private final static QName _CreatePlace_QNAME = new QName("http://webservice.storage.knowyourtown/", "createPlace");
    private final static QName _GetQuote_QNAME = new QName("http://webservice.storage.knowyourtown/", "getQuote");
    private final static QName _GetQuoteResponse_QNAME = new QName("http://webservice.storage.knowyourtown/", "getQuoteResponse");
    private final static QName _GetLastPlace_QNAME = new QName("http://webservice.storage.knowyourtown/", "getLastPlace");
    private final static QName _UpdateSuggestion_QNAME = new QName("http://webservice.storage.knowyourtown/", "updateSuggestion");
    private final static QName _GetPlaceHistory_QNAME = new QName("http://webservice.storage.knowyourtown/", "getPlaceHistory");
    private final static QName _GetSuggestionByTitleResponse_QNAME = new QName("http://webservice.storage.knowyourtown/", "getSuggestionByTitleResponse");
    private final static QName _GetWeatherInformationByCityResponse_QNAME = new QName("http://webservice.storage.knowyourtown/", "getWeatherInformationByCityResponse");
    private final static QName _UpdatePlace_QNAME = new QName("http://webservice.storage.knowyourtown/", "updatePlace");
    private final static QName _GetWeatherInformationByCity_QNAME = new QName("http://webservice.storage.knowyourtown/", "getWeatherInformationByCity");
    private final static QName _GetLastPlaceByType_QNAME = new QName("http://webservice.storage.knowyourtown/", "getLastPlaceByType");
    private final static QName _GetSuggestionsResponse_QNAME = new QName("http://webservice.storage.knowyourtown/", "getSuggestionsResponse");
    private final static QName _GetQuote2Response_QNAME = new QName("http://webservice.storage.knowyourtown/", "getQuote2Response");
    private final static QName _UpdatePerson_QNAME = new QName("http://webservice.storage.knowyourtown/", "updatePerson");
    private final static QName _ReadPersonResponse_QNAME = new QName("http://webservice.storage.knowyourtown/", "readPersonResponse");
    private final static QName _UpdatePersonResponse_QNAME = new QName("http://webservice.storage.knowyourtown/", "updatePersonResponse");
    private final static QName _GetSuggestionHistoryResponse_QNAME = new QName("http://webservice.storage.knowyourtown/", "getSuggestionHistoryResponse");
    private final static QName _GetSomePlace_QNAME = new QName("http://webservice.storage.knowyourtown/", "getSomePlace");
    private final static QName _ReadSuggestion_QNAME = new QName("http://webservice.storage.knowyourtown/", "readSuggestion");
    private final static QName _CreatePerson_QNAME = new QName("http://webservice.storage.knowyourtown/", "createPerson");
    private final static QName _GetIdPlaceTypeByType_QNAME = new QName("http://webservice.storage.knowyourtown/", "getIdPlaceTypeByType");
    private final static QName _GetSuggestionHistory_QNAME = new QName("http://webservice.storage.knowyourtown/", "getSuggestionHistory");
    private final static QName _GetSuggestionByTitle_QNAME = new QName("http://webservice.storage.knowyourtown/", "getSuggestionByTitle");
    private final static QName _CreatePersonResponse_QNAME = new QName("http://webservice.storage.knowyourtown/", "createPersonResponse");
    private final static QName _ReadPlaceType_QNAME = new QName("http://webservice.storage.knowyourtown/", "readPlaceType");
    private final static QName _ReadPlaceTypeResponse_QNAME = new QName("http://webservice.storage.knowyourtown/", "readPlaceTypeResponse");
    private final static QName _CreateSuggestion_QNAME = new QName("http://webservice.storage.knowyourtown/", "createSuggestion");
    private final static QName _DeletePersonResponse_QNAME = new QName("http://webservice.storage.knowyourtown/", "deletePersonResponse");
    private final static QName _GetLastPlaceResponse_QNAME = new QName("http://webservice.storage.knowyourtown/", "getLastPlaceResponse");
    private final static QName _GetPlaceTypeListResponse_QNAME = new QName("http://webservice.storage.knowyourtown/", "getPlaceTypeListResponse");
    private final static QName _ReadPlaceResponse_QNAME = new QName("http://webservice.storage.knowyourtown/", "readPlaceResponse");
    private final static QName _UpdateSuggestionResponse_QNAME = new QName("http://webservice.storage.knowyourtown/", "updateSuggestionResponse");
    private final static QName _GetLastPlaceByTypeResponse_QNAME = new QName("http://webservice.storage.knowyourtown/", "getLastPlaceByTypeResponse");
    private final static QName _DeletePlaceResponse_QNAME = new QName("http://webservice.storage.knowyourtown/", "deletePlaceResponse");
    private final static QName _ReadSuggestionResponse_QNAME = new QName("http://webservice.storage.knowyourtown/", "readSuggestionResponse");
    private final static QName _DeleteSuggestion_QNAME = new QName("http://webservice.storage.knowyourtown/", "deleteSuggestion");
    private final static QName _ReadPerson_QNAME = new QName("http://webservice.storage.knowyourtown/", "readPerson");
    private final static QName _GetPlaceHistoryResponse_QNAME = new QName("http://webservice.storage.knowyourtown/", "getPlaceHistoryResponse");
    private final static QName _DeleteSuggestionResponse_QNAME = new QName("http://webservice.storage.knowyourtown/", "deleteSuggestionResponse");
    private final static QName _GetSomePlaceResponse_QNAME = new QName("http://webservice.storage.knowyourtown/", "getSomePlaceResponse");
    private final static QName _GetQuote2_QNAME = new QName("http://webservice.storage.knowyourtown/", "getQuote2");
    private final static QName _DeletePerson_QNAME = new QName("http://webservice.storage.knowyourtown/", "deletePerson");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: knowyourtown.storage.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateSuggestionResponse }
     * 
     */
    public UpdateSuggestionResponse createUpdateSuggestionResponse() {
        return new UpdateSuggestionResponse();
    }

    /**
     * Create an instance of {@link ReadPlaceResponse }
     * 
     */
    public ReadPlaceResponse createReadPlaceResponse() {
        return new ReadPlaceResponse();
    }

    /**
     * Create an instance of {@link GetPlaceTypeListResponse }
     * 
     */
    public GetPlaceTypeListResponse createGetPlaceTypeListResponse() {
        return new GetPlaceTypeListResponse();
    }

    /**
     * Create an instance of {@link GetLastPlaceResponse }
     * 
     */
    public GetLastPlaceResponse createGetLastPlaceResponse() {
        return new GetLastPlaceResponse();
    }

    /**
     * Create an instance of {@link DeletePersonResponse }
     * 
     */
    public DeletePersonResponse createDeletePersonResponse() {
        return new DeletePersonResponse();
    }

    /**
     * Create an instance of {@link CreateSuggestion }
     * 
     */
    public CreateSuggestion createCreateSuggestion() {
        return new CreateSuggestion();
    }

    /**
     * Create an instance of {@link ReadPlaceTypeResponse }
     * 
     */
    public ReadPlaceTypeResponse createReadPlaceTypeResponse() {
        return new ReadPlaceTypeResponse();
    }

    /**
     * Create an instance of {@link DeletePerson }
     * 
     */
    public DeletePerson createDeletePerson() {
        return new DeletePerson();
    }

    /**
     * Create an instance of {@link GetQuote2 }
     * 
     */
    public GetQuote2 createGetQuote2() {
        return new GetQuote2();
    }

    /**
     * Create an instance of {@link GetPlaceHistoryResponse }
     * 
     */
    public GetPlaceHistoryResponse createGetPlaceHistoryResponse() {
        return new GetPlaceHistoryResponse();
    }

    /**
     * Create an instance of {@link GetSomePlaceResponse }
     * 
     */
    public GetSomePlaceResponse createGetSomePlaceResponse() {
        return new GetSomePlaceResponse();
    }

    /**
     * Create an instance of {@link DeleteSuggestionResponse }
     * 
     */
    public DeleteSuggestionResponse createDeleteSuggestionResponse() {
        return new DeleteSuggestionResponse();
    }

    /**
     * Create an instance of {@link DeleteSuggestion }
     * 
     */
    public DeleteSuggestion createDeleteSuggestion() {
        return new DeleteSuggestion();
    }

    /**
     * Create an instance of {@link ReadPerson }
     * 
     */
    public ReadPerson createReadPerson() {
        return new ReadPerson();
    }

    /**
     * Create an instance of {@link GetLastPlaceByTypeResponse }
     * 
     */
    public GetLastPlaceByTypeResponse createGetLastPlaceByTypeResponse() {
        return new GetLastPlaceByTypeResponse();
    }

    /**
     * Create an instance of {@link ReadSuggestionResponse }
     * 
     */
    public ReadSuggestionResponse createReadSuggestionResponse() {
        return new ReadSuggestionResponse();
    }

    /**
     * Create an instance of {@link DeletePlaceResponse }
     * 
     */
    public DeletePlaceResponse createDeletePlaceResponse() {
        return new DeletePlaceResponse();
    }

    /**
     * Create an instance of {@link GetSuggestionByTitleResponse }
     * 
     */
    public GetSuggestionByTitleResponse createGetSuggestionByTitleResponse() {
        return new GetSuggestionByTitleResponse();
    }

    /**
     * Create an instance of {@link GetPlaceHistory }
     * 
     */
    public GetPlaceHistory createGetPlaceHistory() {
        return new GetPlaceHistory();
    }

    /**
     * Create an instance of {@link UpdatePlace }
     * 
     */
    public UpdatePlace createUpdatePlace() {
        return new UpdatePlace();
    }

    /**
     * Create an instance of {@link GetWeatherInformationByCityResponse }
     * 
     */
    public GetWeatherInformationByCityResponse createGetWeatherInformationByCityResponse() {
        return new GetWeatherInformationByCityResponse();
    }

    /**
     * Create an instance of {@link GetQuote }
     * 
     */
    public GetQuote createGetQuote() {
        return new GetQuote();
    }

    /**
     * Create an instance of {@link GetLastPlace }
     * 
     */
    public GetLastPlace createGetLastPlace() {
        return new GetLastPlace();
    }

    /**
     * Create an instance of {@link UpdateSuggestion }
     * 
     */
    public UpdateSuggestion createUpdateSuggestion() {
        return new UpdateSuggestion();
    }

    /**
     * Create an instance of {@link GetQuoteResponse }
     * 
     */
    public GetQuoteResponse createGetQuoteResponse() {
        return new GetQuoteResponse();
    }

    /**
     * Create an instance of {@link GetPlaceTypeList }
     * 
     */
    public GetPlaceTypeList createGetPlaceTypeList() {
        return new GetPlaceTypeList();
    }

    /**
     * Create an instance of {@link GetSuggestions }
     * 
     */
    public GetSuggestions createGetSuggestions() {
        return new GetSuggestions();
    }

    /**
     * Create an instance of {@link CreatePlace }
     * 
     */
    public CreatePlace createCreatePlace() {
        return new CreatePlace();
    }

    /**
     * Create an instance of {@link CreateSuggestionResponse }
     * 
     */
    public CreateSuggestionResponse createCreateSuggestionResponse() {
        return new CreateSuggestionResponse();
    }

    /**
     * Create an instance of {@link DeletePlace }
     * 
     */
    public DeletePlace createDeletePlace() {
        return new DeletePlace();
    }

    /**
     * Create an instance of {@link CreatePlaceResponse }
     * 
     */
    public CreatePlaceResponse createCreatePlaceResponse() {
        return new CreatePlaceResponse();
    }

    /**
     * Create an instance of {@link GetIdPlaceTypeByTypeResponse }
     * 
     */
    public GetIdPlaceTypeByTypeResponse createGetIdPlaceTypeByTypeResponse() {
        return new GetIdPlaceTypeByTypeResponse();
    }

    /**
     * Create an instance of {@link ReadPlace }
     * 
     */
    public ReadPlace createReadPlace() {
        return new ReadPlace();
    }

    /**
     * Create an instance of {@link UpdatePlaceResponse }
     * 
     */
    public UpdatePlaceResponse createUpdatePlaceResponse() {
        return new UpdatePlaceResponse();
    }

    /**
     * Create an instance of {@link CreatePersonResponse }
     * 
     */
    public CreatePersonResponse createCreatePersonResponse() {
        return new CreatePersonResponse();
    }

    /**
     * Create an instance of {@link GetSuggestionByTitle }
     * 
     */
    public GetSuggestionByTitle createGetSuggestionByTitle() {
        return new GetSuggestionByTitle();
    }

    /**
     * Create an instance of {@link ReadPlaceType }
     * 
     */
    public ReadPlaceType createReadPlaceType() {
        return new ReadPlaceType();
    }

    /**
     * Create an instance of {@link CreatePerson }
     * 
     */
    public CreatePerson createCreatePerson() {
        return new CreatePerson();
    }

    /**
     * Create an instance of {@link ReadSuggestion }
     * 
     */
    public ReadSuggestion createReadSuggestion() {
        return new ReadSuggestion();
    }

    /**
     * Create an instance of {@link GetSuggestionHistory }
     * 
     */
    public GetSuggestionHistory createGetSuggestionHistory() {
        return new GetSuggestionHistory();
    }

    /**
     * Create an instance of {@link GetIdPlaceTypeByType }
     * 
     */
    public GetIdPlaceTypeByType createGetIdPlaceTypeByType() {
        return new GetIdPlaceTypeByType();
    }

    /**
     * Create an instance of {@link UpdatePersonResponse }
     * 
     */
    public UpdatePersonResponse createUpdatePersonResponse() {
        return new UpdatePersonResponse();
    }

    /**
     * Create an instance of {@link ReadPersonResponse }
     * 
     */
    public ReadPersonResponse createReadPersonResponse() {
        return new ReadPersonResponse();
    }

    /**
     * Create an instance of {@link GetSomePlace }
     * 
     */
    public GetSomePlace createGetSomePlace() {
        return new GetSomePlace();
    }

    /**
     * Create an instance of {@link GetSuggestionHistoryResponse }
     * 
     */
    public GetSuggestionHistoryResponse createGetSuggestionHistoryResponse() {
        return new GetSuggestionHistoryResponse();
    }

    /**
     * Create an instance of {@link GetWeatherInformationByCity }
     * 
     */
    public GetWeatherInformationByCity createGetWeatherInformationByCity() {
        return new GetWeatherInformationByCity();
    }

    /**
     * Create an instance of {@link GetQuote2Response }
     * 
     */
    public GetQuote2Response createGetQuote2Response() {
        return new GetQuote2Response();
    }

    /**
     * Create an instance of {@link UpdatePerson }
     * 
     */
    public UpdatePerson createUpdatePerson() {
        return new UpdatePerson();
    }

    /**
     * Create an instance of {@link GetSuggestionsResponse }
     * 
     */
    public GetSuggestionsResponse createGetSuggestionsResponse() {
        return new GetSuggestionsResponse();
    }

    /**
     * Create an instance of {@link GetLastPlaceByType }
     * 
     */
    public GetLastPlaceByType createGetLastPlaceByType() {
        return new GetLastPlaceByType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPlace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.knowyourtown/", name = "readPlace")
    public JAXBElement<ReadPlace> createReadPlace(ReadPlace value) {
        return new JAXBElement<ReadPlace>(_ReadPlace_QNAME, ReadPlace.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePlaceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.knowyourtown/", name = "createPlaceResponse")
    public JAXBElement<CreatePlaceResponse> createCreatePlaceResponse(CreatePlaceResponse value) {
        return new JAXBElement<CreatePlaceResponse>(_CreatePlaceResponse_QNAME, CreatePlaceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIdPlaceTypeByTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.knowyourtown/", name = "getIdPlaceTypeByTypeResponse")
    public JAXBElement<GetIdPlaceTypeByTypeResponse> createGetIdPlaceTypeByTypeResponse(GetIdPlaceTypeByTypeResponse value) {
        return new JAXBElement<GetIdPlaceTypeByTypeResponse>(_GetIdPlaceTypeByTypeResponse_QNAME, GetIdPlaceTypeByTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePlaceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.knowyourtown/", name = "updatePlaceResponse")
    public JAXBElement<UpdatePlaceResponse> createUpdatePlaceResponse(UpdatePlaceResponse value) {
        return new JAXBElement<UpdatePlaceResponse>(_UpdatePlaceResponse_QNAME, UpdatePlaceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSuggestions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.knowyourtown/", name = "getSuggestions")
    public JAXBElement<GetSuggestions> createGetSuggestions(GetSuggestions value) {
        return new JAXBElement<GetSuggestions>(_GetSuggestions_QNAME, GetSuggestions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPlaceTypeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.knowyourtown/", name = "getPlaceTypeList")
    public JAXBElement<GetPlaceTypeList> createGetPlaceTypeList(GetPlaceTypeList value) {
        return new JAXBElement<GetPlaceTypeList>(_GetPlaceTypeList_QNAME, GetPlaceTypeList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSuggestionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.knowyourtown/", name = "createSuggestionResponse")
    public JAXBElement<CreateSuggestionResponse> createCreateSuggestionResponse(CreateSuggestionResponse value) {
        return new JAXBElement<CreateSuggestionResponse>(_CreateSuggestionResponse_QNAME, CreateSuggestionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePlace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.knowyourtown/", name = "deletePlace")
    public JAXBElement<DeletePlace> createDeletePlace(DeletePlace value) {
        return new JAXBElement<DeletePlace>(_DeletePlace_QNAME, DeletePlace.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePlace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.knowyourtown/", name = "createPlace")
    public JAXBElement<CreatePlace> createCreatePlace(CreatePlace value) {
        return new JAXBElement<CreatePlace>(_CreatePlace_QNAME, CreatePlace.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetQuote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.knowyourtown/", name = "getQuote")
    public JAXBElement<GetQuote> createGetQuote(GetQuote value) {
        return new JAXBElement<GetQuote>(_GetQuote_QNAME, GetQuote.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetQuoteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.knowyourtown/", name = "getQuoteResponse")
    public JAXBElement<GetQuoteResponse> createGetQuoteResponse(GetQuoteResponse value) {
        return new JAXBElement<GetQuoteResponse>(_GetQuoteResponse_QNAME, GetQuoteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLastPlace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.knowyourtown/", name = "getLastPlace")
    public JAXBElement<GetLastPlace> createGetLastPlace(GetLastPlace value) {
        return new JAXBElement<GetLastPlace>(_GetLastPlace_QNAME, GetLastPlace.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSuggestion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.knowyourtown/", name = "updateSuggestion")
    public JAXBElement<UpdateSuggestion> createUpdateSuggestion(UpdateSuggestion value) {
        return new JAXBElement<UpdateSuggestion>(_UpdateSuggestion_QNAME, UpdateSuggestion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPlaceHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.knowyourtown/", name = "getPlaceHistory")
    public JAXBElement<GetPlaceHistory> createGetPlaceHistory(GetPlaceHistory value) {
        return new JAXBElement<GetPlaceHistory>(_GetPlaceHistory_QNAME, GetPlaceHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSuggestionByTitleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.knowyourtown/", name = "getSuggestionByTitleResponse")
    public JAXBElement<GetSuggestionByTitleResponse> createGetSuggestionByTitleResponse(GetSuggestionByTitleResponse value) {
        return new JAXBElement<GetSuggestionByTitleResponse>(_GetSuggestionByTitleResponse_QNAME, GetSuggestionByTitleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWeatherInformationByCityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.knowyourtown/", name = "getWeatherInformationByCityResponse")
    public JAXBElement<GetWeatherInformationByCityResponse> createGetWeatherInformationByCityResponse(GetWeatherInformationByCityResponse value) {
        return new JAXBElement<GetWeatherInformationByCityResponse>(_GetWeatherInformationByCityResponse_QNAME, GetWeatherInformationByCityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePlace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.knowyourtown/", name = "updatePlace")
    public JAXBElement<UpdatePlace> createUpdatePlace(UpdatePlace value) {
        return new JAXBElement<UpdatePlace>(_UpdatePlace_QNAME, UpdatePlace.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWeatherInformationByCity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.knowyourtown/", name = "getWeatherInformationByCity")
    public JAXBElement<GetWeatherInformationByCity> createGetWeatherInformationByCity(GetWeatherInformationByCity value) {
        return new JAXBElement<GetWeatherInformationByCity>(_GetWeatherInformationByCity_QNAME, GetWeatherInformationByCity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLastPlaceByType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.knowyourtown/", name = "getLastPlaceByType")
    public JAXBElement<GetLastPlaceByType> createGetLastPlaceByType(GetLastPlaceByType value) {
        return new JAXBElement<GetLastPlaceByType>(_GetLastPlaceByType_QNAME, GetLastPlaceByType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSuggestionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.knowyourtown/", name = "getSuggestionsResponse")
    public JAXBElement<GetSuggestionsResponse> createGetSuggestionsResponse(GetSuggestionsResponse value) {
        return new JAXBElement<GetSuggestionsResponse>(_GetSuggestionsResponse_QNAME, GetSuggestionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetQuote2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.knowyourtown/", name = "getQuote2Response")
    public JAXBElement<GetQuote2Response> createGetQuote2Response(GetQuote2Response value) {
        return new JAXBElement<GetQuote2Response>(_GetQuote2Response_QNAME, GetQuote2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.knowyourtown/", name = "updatePerson")
    public JAXBElement<UpdatePerson> createUpdatePerson(UpdatePerson value) {
        return new JAXBElement<UpdatePerson>(_UpdatePerson_QNAME, UpdatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.knowyourtown/", name = "readPersonResponse")
    public JAXBElement<ReadPersonResponse> createReadPersonResponse(ReadPersonResponse value) {
        return new JAXBElement<ReadPersonResponse>(_ReadPersonResponse_QNAME, ReadPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.knowyourtown/", name = "updatePersonResponse")
    public JAXBElement<UpdatePersonResponse> createUpdatePersonResponse(UpdatePersonResponse value) {
        return new JAXBElement<UpdatePersonResponse>(_UpdatePersonResponse_QNAME, UpdatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSuggestionHistoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.knowyourtown/", name = "getSuggestionHistoryResponse")
    public JAXBElement<GetSuggestionHistoryResponse> createGetSuggestionHistoryResponse(GetSuggestionHistoryResponse value) {
        return new JAXBElement<GetSuggestionHistoryResponse>(_GetSuggestionHistoryResponse_QNAME, GetSuggestionHistoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSomePlace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.knowyourtown/", name = "getSomePlace")
    public JAXBElement<GetSomePlace> createGetSomePlace(GetSomePlace value) {
        return new JAXBElement<GetSomePlace>(_GetSomePlace_QNAME, GetSomePlace.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadSuggestion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.knowyourtown/", name = "readSuggestion")
    public JAXBElement<ReadSuggestion> createReadSuggestion(ReadSuggestion value) {
        return new JAXBElement<ReadSuggestion>(_ReadSuggestion_QNAME, ReadSuggestion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.knowyourtown/", name = "createPerson")
    public JAXBElement<CreatePerson> createCreatePerson(CreatePerson value) {
        return new JAXBElement<CreatePerson>(_CreatePerson_QNAME, CreatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIdPlaceTypeByType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.knowyourtown/", name = "getIdPlaceTypeByType")
    public JAXBElement<GetIdPlaceTypeByType> createGetIdPlaceTypeByType(GetIdPlaceTypeByType value) {
        return new JAXBElement<GetIdPlaceTypeByType>(_GetIdPlaceTypeByType_QNAME, GetIdPlaceTypeByType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSuggestionHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.knowyourtown/", name = "getSuggestionHistory")
    public JAXBElement<GetSuggestionHistory> createGetSuggestionHistory(GetSuggestionHistory value) {
        return new JAXBElement<GetSuggestionHistory>(_GetSuggestionHistory_QNAME, GetSuggestionHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSuggestionByTitle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.knowyourtown/", name = "getSuggestionByTitle")
    public JAXBElement<GetSuggestionByTitle> createGetSuggestionByTitle(GetSuggestionByTitle value) {
        return new JAXBElement<GetSuggestionByTitle>(_GetSuggestionByTitle_QNAME, GetSuggestionByTitle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.knowyourtown/", name = "createPersonResponse")
    public JAXBElement<CreatePersonResponse> createCreatePersonResponse(CreatePersonResponse value) {
        return new JAXBElement<CreatePersonResponse>(_CreatePersonResponse_QNAME, CreatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPlaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.knowyourtown/", name = "readPlaceType")
    public JAXBElement<ReadPlaceType> createReadPlaceType(ReadPlaceType value) {
        return new JAXBElement<ReadPlaceType>(_ReadPlaceType_QNAME, ReadPlaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPlaceTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.knowyourtown/", name = "readPlaceTypeResponse")
    public JAXBElement<ReadPlaceTypeResponse> createReadPlaceTypeResponse(ReadPlaceTypeResponse value) {
        return new JAXBElement<ReadPlaceTypeResponse>(_ReadPlaceTypeResponse_QNAME, ReadPlaceTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSuggestion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.knowyourtown/", name = "createSuggestion")
    public JAXBElement<CreateSuggestion> createCreateSuggestion(CreateSuggestion value) {
        return new JAXBElement<CreateSuggestion>(_CreateSuggestion_QNAME, CreateSuggestion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.knowyourtown/", name = "deletePersonResponse")
    public JAXBElement<DeletePersonResponse> createDeletePersonResponse(DeletePersonResponse value) {
        return new JAXBElement<DeletePersonResponse>(_DeletePersonResponse_QNAME, DeletePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLastPlaceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.knowyourtown/", name = "getLastPlaceResponse")
    public JAXBElement<GetLastPlaceResponse> createGetLastPlaceResponse(GetLastPlaceResponse value) {
        return new JAXBElement<GetLastPlaceResponse>(_GetLastPlaceResponse_QNAME, GetLastPlaceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPlaceTypeListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.knowyourtown/", name = "getPlaceTypeListResponse")
    public JAXBElement<GetPlaceTypeListResponse> createGetPlaceTypeListResponse(GetPlaceTypeListResponse value) {
        return new JAXBElement<GetPlaceTypeListResponse>(_GetPlaceTypeListResponse_QNAME, GetPlaceTypeListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPlaceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.knowyourtown/", name = "readPlaceResponse")
    public JAXBElement<ReadPlaceResponse> createReadPlaceResponse(ReadPlaceResponse value) {
        return new JAXBElement<ReadPlaceResponse>(_ReadPlaceResponse_QNAME, ReadPlaceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSuggestionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.knowyourtown/", name = "updateSuggestionResponse")
    public JAXBElement<UpdateSuggestionResponse> createUpdateSuggestionResponse(UpdateSuggestionResponse value) {
        return new JAXBElement<UpdateSuggestionResponse>(_UpdateSuggestionResponse_QNAME, UpdateSuggestionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLastPlaceByTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.knowyourtown/", name = "getLastPlaceByTypeResponse")
    public JAXBElement<GetLastPlaceByTypeResponse> createGetLastPlaceByTypeResponse(GetLastPlaceByTypeResponse value) {
        return new JAXBElement<GetLastPlaceByTypeResponse>(_GetLastPlaceByTypeResponse_QNAME, GetLastPlaceByTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePlaceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.knowyourtown/", name = "deletePlaceResponse")
    public JAXBElement<DeletePlaceResponse> createDeletePlaceResponse(DeletePlaceResponse value) {
        return new JAXBElement<DeletePlaceResponse>(_DeletePlaceResponse_QNAME, DeletePlaceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadSuggestionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.knowyourtown/", name = "readSuggestionResponse")
    public JAXBElement<ReadSuggestionResponse> createReadSuggestionResponse(ReadSuggestionResponse value) {
        return new JAXBElement<ReadSuggestionResponse>(_ReadSuggestionResponse_QNAME, ReadSuggestionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSuggestion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.knowyourtown/", name = "deleteSuggestion")
    public JAXBElement<DeleteSuggestion> createDeleteSuggestion(DeleteSuggestion value) {
        return new JAXBElement<DeleteSuggestion>(_DeleteSuggestion_QNAME, DeleteSuggestion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.knowyourtown/", name = "readPerson")
    public JAXBElement<ReadPerson> createReadPerson(ReadPerson value) {
        return new JAXBElement<ReadPerson>(_ReadPerson_QNAME, ReadPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPlaceHistoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.knowyourtown/", name = "getPlaceHistoryResponse")
    public JAXBElement<GetPlaceHistoryResponse> createGetPlaceHistoryResponse(GetPlaceHistoryResponse value) {
        return new JAXBElement<GetPlaceHistoryResponse>(_GetPlaceHistoryResponse_QNAME, GetPlaceHistoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSuggestionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.knowyourtown/", name = "deleteSuggestionResponse")
    public JAXBElement<DeleteSuggestionResponse> createDeleteSuggestionResponse(DeleteSuggestionResponse value) {
        return new JAXBElement<DeleteSuggestionResponse>(_DeleteSuggestionResponse_QNAME, DeleteSuggestionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSomePlaceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.knowyourtown/", name = "getSomePlaceResponse")
    public JAXBElement<GetSomePlaceResponse> createGetSomePlaceResponse(GetSomePlaceResponse value) {
        return new JAXBElement<GetSomePlaceResponse>(_GetSomePlaceResponse_QNAME, GetSomePlaceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetQuote2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.knowyourtown/", name = "getQuote2")
    public JAXBElement<GetQuote2> createGetQuote2(GetQuote2 value) {
        return new JAXBElement<GetQuote2>(_GetQuote2_QNAME, GetQuote2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.storage.knowyourtown/", name = "deletePerson")
    public JAXBElement<DeletePerson> createDeletePerson(DeletePerson value) {
        return new JAXBElement<DeletePerson>(_DeletePerson_QNAME, DeletePerson.class, null, value);
    }

}
