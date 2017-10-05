package com.yasin.resource;

import com.google.gson.Gson;
import com.yasin.usr.AbsManager;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import java.text.ParseException;
import java.util.List;

public abstract class AbsServicesImpl<T> {

    @Autowired
    private AbsManager<T> absManager;

//    @Path("/name={name}")
    @POST
    @Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    public void add(T item) {
        try {
            absManager.insert(item);
        } catch (ParseException e){
            e.printStackTrace();
        } catch (IllegalArgumentException e){
            e.printStackTrace();
        } catch (NullPointerException e){
            e.printStackTrace();
        } catch (javax.persistence.PersistenceException e){
            e.printStackTrace();
        }
    }

    @Path("/id={id}")
    @DELETE
    @Produces("application/json")
    public void delete( @PathParam("id") int id) {

        try {
            absManager.delete(absManager.findbyID(id));
        } catch (IllegalArgumentException e){
            e.printStackTrace();
        } catch (NullPointerException e){
            e.printStackTrace();
        } catch (javax.persistence.PersistenceException e){
            e.printStackTrace();
        } catch (org.springframework.orm.jpa.JpaSystemException e){
            e.printStackTrace();
        }
    }

//    @Path("/which={turn}/name={name}/id={id}")
    @PUT
    @Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    public void edit(T item) {
        try {
            absManager.edit(item);
        } catch (IllegalArgumentException e){
            e.printStackTrace();
        } catch (NullPointerException e){
            e.printStackTrace();
        } catch (javax.persistence.PersistenceException e){
            e.printStackTrace();
        }
    }

//    @Path("/which={turn}")
    @GET
    @Produces("application/json")

    public String findAll() {
        Gson gson = new Gson();
        List<T> items = absManager.findAll();
        return gson.toJson(items);
    }

    @Path("/id={id}")
    @GET
    @Produces("application/json")
    public String findbyid(@PathParam("id") int id) {


        try {
            Gson gson = new Gson();
            T item = absManager.findbyID(id);
            return  gson.toJson(item);
        } catch (IllegalArgumentException | NullPointerException e){
            e.printStackTrace();
        }
        return "";
    }
}
