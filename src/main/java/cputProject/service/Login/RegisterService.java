package cputProject.service.Login;

import cputProject.domain.Login.Register;
import cputProject.service.Service;

import java.util.Set;

public interface RegisterService extends Service <Register,String>{
    Set<Register> getAll();
}
