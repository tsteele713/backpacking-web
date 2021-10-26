package com.poorvins.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.poorvins.constants.Constants;
import com.poorvins.models.Park;
import com.poorvins.services.ParksService;

@Component
@Qualifier(Constants.Qualifiers.PARKS_CONTROLLER)
@Path(Constants.Endpoints.PARKS_ENDPOINT)
public class ParksController {

	@Autowired(required = true)
	@Qualifier(ParksService.QUALIFIER)
	private ParksService parksService;
	
	   @GET
	   @Path(Constants.Endpoints.RETRIEVE_PARKS) 
	   @Produces(MediaType.APPLICATION_JSON)
	   public Response getAllParksWithParameters(@QueryParam("type") String type, @QueryParam("state") String state) throws Exception {
		   
		   try {
			   List<Park> parkList = parksService.getAllParksForType(type, state);
			   ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
			   String json = ow.writeValueAsString(parkList);
			   return Response.ok(json).build();
		   } catch (Exception e) {
			   Map<String,String> exceptionString = new HashMap<String, String>();
			   exceptionString.put("Status", Response.Status.BAD_REQUEST.name());
			   exceptionString.put("Exception", e.getMessage());
			   return Response.status(Response.Status.BAD_REQUEST).entity(exceptionString).build();
		   }
	   }
	
	
}
