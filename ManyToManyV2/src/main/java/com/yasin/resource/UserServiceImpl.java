package com.yasin.resource;

import com.yasin.model.User;
import org.springframework.stereotype.Component;
import javax.ws.rs.Path;

@Component
@Path("/user")

public class UserServiceImpl extends AbsServicesImpl<User> {

}
