package com.yasin.config;

import javax.servlet.Filter;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.orm.jpa.support.OpenEntityManagerInViewFilter;
import org.springframework.web.filter.DelegatingFilterProxy;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.yasin.filter.CORSFilter;
import com.yasin.servlet.JerseyServlet;

@Order(Ordered.HIGHEST_PRECEDENCE)
public class YasinInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { WebConfig.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] { JerseyServlet.class };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }

    @Override
    protected Filter[] getServletFilters() {
        Filter[] singleton = { new OpenEntityManagerInViewFilter(), new CORSFilter() };
        return singleton;
    }

}