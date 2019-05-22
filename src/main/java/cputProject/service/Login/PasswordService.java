package cputProject.service.Login;

import cputProject.domain.Login.Password;
import cputProject.service.Service;

import java.util.Set;

public interface PasswordService extends Service <Password,String>{
    Set<Password> getAll();
}
