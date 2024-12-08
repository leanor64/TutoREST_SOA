package fr.insa.soa.RestProject;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "comparator" path)
 */
@Path("comparator")
public class Comparator {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String SayHello() {
        return "Bonjour!";
    }
    
    @GET
    @Path("longueur/{chaine}")
    @Produces(MediaType.TEXT_PLAIN)
    public int getLongueur(@PathParam("chaine") String chaine) {
        return chaine.length();
    }
    
    @GET
    @Path("ldouble")
    @Produces(MediaType.TEXT_PLAIN)
    public int getLDouble(@QueryParam("chaine") String chaine) {
        return chaine.length()*2;
    }
    
    @PUT
    @Path("/{idEtudiant}")
    @Consumes(MediaType.TEXT_PLAIN)
    public int updateEtudiant(@PathParam("idEtudiant") int id) {
        System.out.println("mise à jour réussie!!!");
        return id;
    }
}
