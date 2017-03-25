/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import scholarship.Scholarship;

/**
 *
 * @author ARI
 */
@Stateless
@Path("scholarship.scholarship")
public class ScholarshipFacadeREST extends AbstractFacade<Scholarship> {
    @PersistenceContext(unitName = "scholarshipPU")
    private EntityManager em;

    public ScholarshipFacadeREST() {
        super(Scholarship.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(Scholarship entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") Integer id, Scholarship entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public Scholarship find(@PathParam("id") Integer id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({"application/xml", "application/json"})
    public List<Scholarship> findAll() {
        return super.findAll();
    }
    
     @GET
    @Path("{level}/{field}/{country}/{language}")
    @Produces({ "application/json"}) 
    public List<Scholarship> getScholarshipfindByField(@PathParam("level") String level,@PathParam("field") String field,@PathParam("country") String country,@PathParam("language") String language){
            return super.getScholarshipfindByField(level,field,country,language);

    }     

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<Scholarship> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces("text/plain")
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
