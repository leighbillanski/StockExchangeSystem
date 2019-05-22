package cputProject.service.Login;

import cputProject.domain.Login.UserName;
import cputProject.service.Service;

import java.util.Set;

public interface UserNameService extends Service <UserName,String>{
    Set<UserName> getAll();
}
