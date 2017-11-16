package com.yasin.resource;

import com.yasin.model.UserRoles;
import org.springframework.stereotype.Component;
import javax.ws.rs.Path;

@Component
@Path("/userrole")
public class UserRoleServiceImpl extends AbsServicesImpl<UserRoles> {

    @Override
    public void add(UserRoles item) {
        super.add(item);
    }

    @Override
    public void edit(UserRoles item) {
        super.edit(item);
    }
}
