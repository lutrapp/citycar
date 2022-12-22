package org.acme.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.acme.dto.CreateDriverRequest;

@Path("/driverlunew")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class DriverLuController {
	@POST
	public Response createDriver(CreateDriverRequest createDriverRequest ) {
		return Response.ok(createDriverRequest).build();
		
	}



//@Path(value = "/driverLu")
//@Produces(MediaType.APPLICATION_JSON)
//public class DriverLuController {
//	
////	@Inject
//	@Resource
//	private DriverLuRepository driverLuRepository;
//	
////	@Resource
////	private DriverLuRepository2 driverLuRepository;
//
//	@GET
//	@Path(value = "/count")
//	public long countdriverlu() {
//		long response = 0;
//		//		Response.ok().build().
////		driverLuRepository.countDriversLu(0)
//		return driverLuRepository.countDriversLu(response);
//	}
	
}
