package knowyourtown.business.webservice;

import knowyourtown.localdb.webservice.Person;
import knowyourtown.localdb.webservice.Place;
import knowyourtown.localdb.webservice.Suggestion;


import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.WebResult;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

@WebService
@SOAPBinding(style = Style.DOCUMENT, use=Use.LITERAL) //optional
public interface Business 
{
	/* Person */

    @WebMethod(operationName="createPerson")
    @WebResult(name="personId") 
    public int addPerson(@WebParam(name="person", targetNamespace="http://webservice.business.knowyourtown/") Person person);

    @WebMethod(operationName="updatePerson")
    @WebResult(name="personId") 
    public int updatePerson(@WebParam(name="person", targetNamespace="http://webservice.business.knowyourtown/") Person person);

    @WebMethod(operationName="deletePerson")
    @WebResult(name="result") 
    public int deletePerson(@WebParam(name="personId") int id);
    
    
    /* Place */
    
    @WebMethod(operationName="createPlace")
    @WebResult(name="placeId") 
    public int addPlace(@WebParam(name="personId") int pId, @WebParam(name="place", targetNamespace="http://webservice.business.knowyourtown/") Place place);

    @WebMethod(operationName="updatePlace")
    @WebResult(name="placeId") 
    public int updatePlace(@WebParam(name="personId") int pId, @WebParam(name="place", targetNamespace="http://webservice.business.knowyourtown/") Place place);
    
    @WebMethod(operationName="deletePlace")
    @WebResult(name="result") 
    public int deletePlace(@WebParam(name="placeId") int id);
       
    
    /* Suggestion */
    
    @WebMethod(operationName="getSuggestions")
    @WebResult(name="listSuggestion") 
    public List<Suggestion> getSuggestions(@WebParam(name="personId") int pId);
    
    @WebMethod(operationName="createSuggestion")
    @WebResult(name="suggestionId") 
    public int addSuggestion(@WebParam(name="personId") int pId, @WebParam(name="suggestion", targetNamespace="http://webservice.business.knowyourtown/") String title);

    @WebMethod(operationName="updateSuggestion")
    @WebResult(name="suggestionId") 
    public int updateSuggestion(@WebParam(name="personId") int pId, @WebParam(name="suggestion", targetNamespace="http://webservice.business.knowyourtown/") Suggestion suggestion, @WebParam(name="oldTitle") String oldTitle);
    
    @WebMethod(operationName="deleteSuggestion")
    @WebResult(name="result") 
    public int deleteSuggestion(@WebParam(name="suggestionId") int id);
    
    @WebMethod(operationName="deleteSuggestionByTitle")
    @WebResult(name="result") 
    public int deleteSuggestionByTitle(@WebParam(name="suggestionId") int id, @WebParam(name="title") String title);
    
    
}
