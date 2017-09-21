package com.crunchify.restjersey.impl;

import com.yasin.model.Roles;
import org.springframework.stereotype.Component;

import javax.ws.rs.Path;

@Component
@Path("/role")
public class RoleServiceImpl extends AbsServicesImpl<Roles> {
}
