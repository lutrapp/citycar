//package org.acme;
//
//import javax.ws.rs.GET;
//import javax.ws.rs.Path;
//import javax.ws.rs.Produces;
//import javax.ws.rs.core.MediaType;
//
//import org.acme.model.DriverLu;
//
//import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
//
//@Path("/drivers")
//@Produces(MediaType.APPLICATION_JSON)
//public class ExampleDriver {
//
//    @GET
//    @Path("/teste")
//    public DriverLu listAll(){
//    	DriverLu x = (DriverLu) PanacheEntityBase.findAll();
//		return x;
//    	
//    }
//}