package com.yasin.servlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

import com.sun.jersey.spi.spring.container.servlet.SpringServlet;

@WebServlet(loadOnStartup = 1, urlPatterns = "/rest/*", initParams = {
    @WebInitParam(name = "com.sun.jersey.config.property.packages", value = "com.yasin.model"),
    @WebInitParam(name = "com.sun.jersey.api.json.POJOMappingFeature", value = "true") })
public class JerseyServlet extends SpringServlet
{

    private static final long serialVersionUID = 8243006890181629211L;
}