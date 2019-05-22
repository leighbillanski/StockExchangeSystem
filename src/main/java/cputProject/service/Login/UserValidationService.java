package cputProject.service.Login;

import cputProject.domain.Login.UserValidation;
import cputProject.service.Service;

import java.util.Set;

public interface UserValidationService extends Service <UserValidation,String>{
    Set<UserValidation> getAll();
}
