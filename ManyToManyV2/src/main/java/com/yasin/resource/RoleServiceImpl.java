package com.yasin.resource;

import com.yasin.model.Roles;
import org.springframework.stereotype.Component;
import javax.ws.rs.Path;

@Component
@Path("/role")
public class RoleServiceImpl extends AbsServicesImpl<Roles> {
}
