package cputProject.service.Login;

import cputProject.domain.Login.Login;
import cputProject.service.Service;

import java.util.Set;

public interface LoginService extends Service <Login,String>{
    Set<Login> getAll();
}
