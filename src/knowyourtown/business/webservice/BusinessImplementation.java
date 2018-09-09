package knowyourtown.business.webservice;

import knowyourtown.storage.webservice.StorageService;
import knowyourtown.storage.webservice.Storage;

import knowyourtown.localdb.webservice.Person;
import knowyourtown.localdb.webservice.Place;
import knowyourtown.localdb.webservice.Suggestion;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.jws.WebService;


//Service Implementation

@WebService(endpointInterface = "knowyourtown.business.webservice.Business",
    serviceName="BusinessService")
public class BusinessImplementation implements Business 
{
	StorageService service;
	Storage storage;
	
	public void init()
	{
		service = new StorageService();
        storage = service.getStorageImplementationPort();
	}
	
	
	/* Manage Person*/

    @Override
    public int addPerson(Person person) {
    	init();
    	System.out.println("Save Person with id = " + person.getIdPerson());
    	return storage.createPerson(person);
    }

    @Override
    public int updatePerson(Person person) {
    	init();
    	if(person == null)
    	{
    		System.out.println("Zio billy");
    		return 1;
    	}    	
    	System.out.println("Update Person with id = " + person.getIdPerson());
        return storage.updatePerson(person);
    }

    @Override
    public int deletePerson(int id) {
    	init();
    	System.out.println("Delete Person with id = " + id);           
        return storage.deletePerson(id);
    }
    
    
    /* Manage Place */

    @Override
    public int addPlace(int pId, Place place) {
    	init();
    	System.out.println("Save Place with id = " + place.getIdPlace());
        
    	if(place.getPlaceType()==null)
    	{
    		System.out.println("QUi");
    	}
    	else
    	{
		// Gen date
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		// Add date to place
		place.setDate(dateFormat.format(date));

    		System.out.println("QUa " + place.getPlaceType().getType());
    	}
    	
        return storage.createPlace(pId, place);
    }

    @Override
    public int updatePlace(int pId, Place place) {
    	init();
    	System.out.println("Update Place with id = " + place.getIdPlace());  	
    	return storage.updatePlace(pId, place);
    }
    
    @Override
    public int deletePlace(int id) {
    	init();
    	System.out.println("Delete Place with id = " + id);
    	return storage.deletePlace(id);
    }
    
    
    /* Manage Suggestion */
    
    @Override
    public List<Suggestion> getSuggestions(int pId) {
    	init();

    	List<Suggestion> gList = storage.getSuggestions(pId);
    	
    	return gList;
    }
    
    @Override
    public int addSuggestion(int pId, String title) {
    	init();
    	

        String motivation = "";
        if (Math.random() == 0)
            motivation =  storage.getQuote();
        else
            motivation = storage.getQuote2();

        Place lastplace = storage.getLastPlaceByType(pId,"to visit");
        if(lastplace == null)
            return 0;

        String weather = storage.getWeatherInformationByCity(lastplace.getLocation());
        if(weather.equals("Init"))
        {
            weather = "No weather available";
        }
        else{
            String [] weatherdata = weather.split("\\|");
            weather = " Weather for " +lastplace.getLocation() + "\nTemperaure : " + weatherdata[0] + "°\nWind : " + weatherdata[1] + "Km/h\nClouds : " + weatherdata[2] + "%";

        }
        Suggestion s = new Suggestion();
        s.setTitle(title);
        String description = "We suggest you go to " + lastplace.getLocation() + " " + lastplace.getName() + "\n" +
            weather + "\n" + "Here's some motivation : " + motivation;
        s.setDescription(description);
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        s.setDate(dateFormat.format(date));
        s.setLocation(lastplace.getLocation()); 
        s.setEvaluation("0");
        
    	
    	
    	return storage.createSuggestion(pId, s);
    }

    @Override
    public int updateSuggestion(int pId, Suggestion suggestion, String oldSuggestion) {
    	init();
    	System.out.println("Update Suggestion with id = " + suggestion.getIdSuggestion());

		Suggestion g = storage.getSuggestionByTitle(pId, oldSuggestion);
		if(g == null)
			g = new Suggestion();
        g.setTitle(suggestion.getTitle());
        g.setDescription(suggestion.getDescription());
        g.setDate(suggestion.getDate());
        g.setLocation(suggestion.getLocation()); 
        g.setEvaluation(suggestion.getEvaluation());  

    	return storage.updateSuggestion(pId, g);
    }
    
    @Override
    public int deleteSuggestion(int id) {
    	init();
    	System.out.println("Delete Suggestion with id = " + id);
    	return storage.deleteSuggestion(id);
    }
    
    @Override
    public int deleteSuggestionByTitle(int id, String title) {
    	init();
    	System.out.println("Delete Suggestion with id = " + id + " and title " + title);
    	Suggestion g = storage.getSuggestionByTitle(id, title);
    	return storage.deleteSuggestion(g.getIdSuggestion());
    }
   
    
}
